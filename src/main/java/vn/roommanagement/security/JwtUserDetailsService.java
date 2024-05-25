package vn.roommanagement.security;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import vn.roommanagement.api.entity.User;
import vn.roommanagement.api.service.UserService;

@Service
@AllArgsConstructor
public class JwtUserDetailsService implements UserDetailsService {

    private final UserService userService;

    @Override
    public UserDetails loadUserByUsername(String id) throws UsernameNotFoundException {
        User user = userService.findById(id);
      return new CustomUserDetails(user);
    }
}
