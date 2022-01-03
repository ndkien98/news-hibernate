package com.t3h.newspringboot.service;

import com.t3h.newspringboot.model.request.UserRequest;
import com.t3h.newspringboot.model.response.UserResponse;

import java.util.List;

public interface IUserService {

    List<UserResponse> getList();

    UserResponse insert(UserRequest userRequest);

}
