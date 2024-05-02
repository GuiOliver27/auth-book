package com.security.jwt.config;

import java.io.IOException;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class JwtAuthenticationFilter extends OncePerRequestFilter{

    @Override
    protected void doFilterInternal(
        @SuppressWarnings("null") HttpServletRequest request,
        @SuppressWarnings("null") HttpServletResponse response,
        @SuppressWarnings("null") FilterChain filterChain
    ) throws ServletException, IOException {
        // TODO Auto-generated method stub
        
    }
    
}
