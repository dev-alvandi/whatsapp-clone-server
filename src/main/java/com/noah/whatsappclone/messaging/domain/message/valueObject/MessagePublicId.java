package com.noah.whatsappclone.messaging.domain.message.valueObject;


import org.springframework.util.Assert;

import java.util.UUID;

public record MessagePublicId(UUID value) {
    public MessagePublicId {
        Assert.notNull(value, "Id cannot be null /Noah");
    }
}
