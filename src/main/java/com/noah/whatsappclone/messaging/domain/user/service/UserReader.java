package com.noah.whatsappclone.messaging.domain.user.service;


import com.noah.whatsappclone.messaging.domain.user.aggregate.User;
import com.noah.whatsappclone.messaging.domain.user.repository.UserRepository;
import com.noah.whatsappclone.messaging.domain.user.valueObject.UserEmail;

import java.util.Optional;

public class UserReader {

    private final UserRepository userRepository;

    public UserReader(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Optional<User> getByEmail(UserEmail email) {
        return userRepository.getOneByEmail(email);
    }
}
