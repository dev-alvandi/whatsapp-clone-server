package com.noah.whatsappclone.infrastructure.primary;

import com.noah.whatsappclone.messaging.domain.user.aggregate.User;
import org.jilt.Builder;

import java.util.Set;
import java.util.UUID;

@Builder
public record RestUser(UUID publicId, String firstname, String lastname, String email, String image_url, Set<RestAuthority> authorities) {
    static RestUser from(User user) {
        RestUserBuilder restUserBuilder = RestUserBuilder.restUser();

        if (user.getImageUrl() != null) {
            restUserBuilder.image_url(user.getImageUrl().value());
        }

        return restUserBuilder
                .email(user.getEmail().value())
                .firstname(user.getFirstname().value())
                .lastname(user.getLastname().value())
                .publicId(user.getUserPublicId().value())
                .authorities(RestAuthority.fromSet(user.getAuthorities()))
                .build();
    }
}
