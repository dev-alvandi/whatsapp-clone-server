package com.noah.whatsappclone.messaging.domain.message.valueObject;


import org.springframework.util.Assert;

import java.util.UUID;

public record ConversationPublicId (UUID value) {
    public ConversationPublicId {
        Assert.notNull(value, "Conversation cannot be null /Noah");
    }
}
