package vn.roommanagement.api.service;

import vn.roommanagement.api.dto.request.LoginRequest;
import vn.roommanagement.api.dto.response.AuthenticationResponse;
import vn.roommanagement.api.entity.User;

public interface UserService {
    AuthenticationResponse login(LoginRequest zaloRequest);

    User findById(String id);

    void disableUserToken();
}
