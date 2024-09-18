package com.noah.whatsappclone.messaging.domain.message.valueObject;

import com.noah.whatsappclone.shared.error.domain.Assert;

public record ConversationName(String name) {
    public ConversationName {
        Assert.field("name", name).minLength(3).maxLength(25);
    }
}
