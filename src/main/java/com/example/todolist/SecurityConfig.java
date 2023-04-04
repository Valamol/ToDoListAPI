package com.example.todolist;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.RequestMatcher;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;



@Configuration
public class SecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        RequestMatcher publicMatcher = (HttpServletRequest request) ->
                request.getRequestURI().startsWith("/public/");

        RequestMatcher privateMatcher = (HttpServletRequest request) ->
                request.getRequestURI().startsWith("/private/");

        http
                .authorizeRequests(authorizeRequests ->
                        authorizeRequests
                                .requestMatchers(publicMatcher).permitAll()
                                .requestMatchers(privateMatcher).authenticated()
                )
                .formLogin(AbstractHttpConfigurer::disable)
                .csrf(AbstractHttpConfigurer::disable);

        return http.build();
    }
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}