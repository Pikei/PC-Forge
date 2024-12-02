package com.pcforge.backend;

import com.pcforge.backend.model.User;
import com.pcforge.backend.model.UserRole;
import com.pcforge.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class BackendApplication {
    @Autowired
    private UserRepository userRepository;
    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);
    }

    @Bean
    CommandLineRunner run() {
        return args -> {
            User user = new User();
            user.setFirstName("user");
            user.setLastName("user");
            user.setPassword("password");
            user.setEmail("user@email.com");
            user.setUsername("user");
            user.setRole(UserRole.CUSTOMER);

            User admin = new User();
            admin.setFirstName("admin");
            admin.setLastName("admin");
            admin.setEmail("admin@admin.com");
            admin.setUsername("admin");
            admin.setPassword("admin");
            admin.setRole(UserRole.ADMIN);

            userRepository.save(user);
            userRepository.save(admin);
        };
    }
}


