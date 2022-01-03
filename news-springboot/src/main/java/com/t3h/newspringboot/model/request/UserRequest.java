package com.t3h.newspringboot.model.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequest {

    public Integer id;

    private String username;

    private String password;

    private String fullName;

    private String address;

    private String email;
}
