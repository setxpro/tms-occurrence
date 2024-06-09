package com.github.setxpro.tms_ocurrences.infra.config.security;

import org.springframework.http.HttpMethod;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    private static final String OCOREN_POINT = "/ocoren";

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.csrf(csrf -> csrf.disable())
                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .authorizeRequests(authorizeRequests ->
                        authorizeRequests
                                .requestMatchers(HttpMethod.POST, OCOREN_POINT).hasRole("BASIC")
                                .requestMatchers(HttpMethod.GET, OCOREN_POINT).hasRole("ADMIN")
                                .requestMatchers(HttpMethod.GET, OCOREN_POINT + "/**").hasRole("ADMIN")
                                .requestMatchers(HttpMethod.PATCH, OCOREN_POINT + "/**").hasRole("ADMIN")
                                .requestMatchers(HttpMethod.DELETE, OCOREN_POINT + "/**").hasRole("ADMIN")
                                .anyRequest().authenticated()
                )
                .httpBasic(Customizer.withDefaults());
        return http.build();
    }
}
