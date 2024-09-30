package com.noah.whatsappclone.messaging.application;

import com.noah.whatsappclone.messaging.domain.user.aggregate.User;
import com.noah.whatsappclone.messaging.domain.user.repository.UserRepository;
import com.noah.whatsappclone.messaging.domain.user.service.UserReader;
import com.noah.whatsappclone.messaging.domain.user.service.UserSynchronizer;
import com.noah.whatsappclone.messaging.domain.user.valueObject.UserEmail;
import com.noah.whatsappclone.shared.authentication.application.AuthenticatedUser;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserApplicationService {

    private final UserSynchronizer userSynchronizer;

    private final UserReader userReader;

    public UserApplicationService(UserRepository userRepository) {
        this.userSynchronizer = new UserSynchronizer(userRepository);
        this.userReader = new UserReader(userRepository);

    }

    @Transactional
    public User getAuthenticatedUserWithSync(Jwt oath2User, boolean forceResync) {
        userSynchronizer.syncWithIdp(oath2User, forceResync);
        return userReader.getByEmail(new UserEmail(AuthenticatedUser.username().get())).orElseThrow();
    }
}
