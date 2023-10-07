package com.example.JavaEE25Security_3.service;

import com.example.JavaEE25Security_3.domain.User;
import com.example.JavaEE25Security_3.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}