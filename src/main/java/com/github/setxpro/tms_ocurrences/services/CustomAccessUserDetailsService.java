package com.github.setxpro.tms_ocurrences.services;

import com.github.setxpro.tms_ocurrences.infra.database.models.Access;
import com.github.setxpro.tms_ocurrences.infra.database.repositories.AccessEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomAccessUserDetailsService implements UserDetailsService {

    private final AccessEntityRepository accessRepository;

    @Autowired
    public CustomAccessUserDetailsService(AccessEntityRepository accessRepository) {
        this.accessRepository = accessRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Access access = accessRepository.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("User not found with username: " + username));
        System.out.println(access.getUsername());
        return User.builder()
                .username(access.getUsername())
                .password(access.getPassword())
                .roles(access.getRole().name())
                .build();
    }
}
