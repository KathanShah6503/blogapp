package com.personal.blogapp.users;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

@DataJpaTest
@ActiveProfiles("test")
public class UsersRepositoryTests {
    @Autowired
    private UsersRepository usersRepository;

    @Test
    @Order(1)
    void canCreateUser() {
        var user = new UserEntity.UserEntityBuilder()
                .username("Kathan")
                .email("kathan@gmail.com")
                .build();

        usersRepository.save(user);
    }

    @Test
    @Order(2)
    void canGetAllUsers() {
        var users = usersRepository.findAll();
        Assertions.assertNotNull(users);
    }
}
