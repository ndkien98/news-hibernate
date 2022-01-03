package com.t3h.newspringboot.model.response;

import lombok.Data;

@Data
public class UserResponse {

    private Integer id;

    private String username;

    private String password;

    private String fullName;

    private String address;

    private String email;
}
