package vn.roommanagement.api.controller;


import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.roommanagement.api.dto.request.LoginRequest;
import vn.roommanagement.api.dto.response.AuthenticationResponse;
import vn.roommanagement.api.dto.response.SuccessResponse;
import vn.roommanagement.api.service.UserService;
import vn.roommanagement.api.utils.AuthenticationHelper;
import vn.roommanagement.config.BaseResponse;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class AuthenticationController {

    private final UserService userService;
    private final AuthenticationHelper authenticationHelper;

    @PostMapping("/login")
    public BaseResponse<AuthenticationResponse> login(
            @Validated @RequestBody LoginRequest zaloRequest,
            HttpServletResponse res
            ) {

        AuthenticationResponse authentication = userService.login(zaloRequest);
        authenticationHelper.setCookie(authentication.getToken(), 4320, res);
        return BaseResponse.ofSucceeded(authentication);
    }

    @PostMapping("/logout")
    public BaseResponse<SuccessResponse<String>> logout(HttpServletResponse response) {
        userService.disableUserToken();
        authenticationHelper.setCookie("", 0, response);
        return BaseResponse.ofSucceeded(new SuccessResponse<>(HttpStatus.OK.value(), null, null));
    }

}
