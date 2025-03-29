package com.thepriyanshiprateek.cure_well.payload;
import lombok.Data;

@Data
public class LoginDto {
    private String usernameOrEmail;
    private String password;
}