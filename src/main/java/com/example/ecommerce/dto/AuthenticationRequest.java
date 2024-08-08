package com.example.ecommerce.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class AuthenticationRequest {
    private String username;
    private String password;
}
