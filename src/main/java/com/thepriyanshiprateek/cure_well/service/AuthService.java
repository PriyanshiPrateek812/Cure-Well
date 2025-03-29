package com.thepriyanshiprateek.cure_well.service;

import com.thepriyanshiprateek.cure_well.payload.LoginDto;
import com.thepriyanshiprateek.cure_well.payload.RegisterDto;

public interface AuthService {
    String login(LoginDto loginDto);
    String register(RegisterDto registerDto);
}