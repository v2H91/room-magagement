package vn.roommanagement.api.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import vn.roommanagement.api.dto.request.LoginRequest;
import vn.roommanagement.api.dto.response.AuthenticationResponse;
import vn.roommanagement.api.entity.User;
import vn.roommanagement.api.entity.UserToken;
import vn.roommanagement.api.repository.UserRepository;
import vn.roommanagement.api.repository.UserTokenRepository;
import vn.roommanagement.api.service.UserService;
import vn.roommanagement.api.utils.AuthenticationHelper;
import vn.roommanagement.api.utils.JwtUtils;
import io.jsonwebtoken.Claims;

import java.sql.Timestamp;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final UserTokenRepository userTokenRepository;
    private final AuthenticationHelper authenticationHelper;
    private final JwtUtils jwtUtils;

    @Value("${jwt.secret}")
    private String jwtSecret;
    @Value("${jwt.duration}")
    private Integer duration;
    @Override
    public AuthenticationResponse login(LoginRequest request) {
        Optional<User> userOpt = userRepository.findById(request.getId());

        User user;
        if(userOpt.isPresent()){
            user = userOpt.get();
        }else{
            User userEntity = new User();
            userEntity.setId(request.getId());
            userEntity.setName(request.getName());
            userEntity.setUrlAvatar(request.getAvatar());
            user = userRepository.save(userEntity);
        }

        var token = jwtUtils.generateToken(jwtSecret, user.getId(), (duration * 1_000));
        var expiration = jwtUtils.extractClaim(jwtSecret, token, Claims::getExpiration);

        userTokenRepository.save(new UserToken(token, user.getId(), true, new Timestamp(expiration.getTime())));
        return new AuthenticationResponse(token, user.getRolesId(), expiration.getTime());
    }

    @Override
    public User findById(String id) {
        Optional<User> userOpt = userRepository.findById(id);
        if(userOpt.isPresent()){
            return userOpt.get();
        }
        throw new UsernameNotFoundException("user not found");
    }

    @Override
    public void disableUserToken() {
        Optional<UserToken> optionalUserToken =
                userTokenRepository.findByUserId(authenticationHelper.getUserId());
        if (optionalUserToken.isPresent()){
            UserToken userToken = optionalUserToken.get();
            userToken.setActive(false);
            userTokenRepository.save(userToken);
        }
    }
}
