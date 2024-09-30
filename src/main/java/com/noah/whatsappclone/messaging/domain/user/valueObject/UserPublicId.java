package com.noah.whatsappclone.messaging.domain.user.valueObject;

import org.springframework.util.Assert;

import java.util.UUID;

public record UserPublicId(UUID value) {
    public UserPublicId {
        Assert.notNull("value",
                String.valueOf(value));
    }
}