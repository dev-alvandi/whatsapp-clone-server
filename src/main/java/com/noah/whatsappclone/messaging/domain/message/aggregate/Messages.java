package com.noah.whatsappclone.messaging.domain.message.aggregate;

import com.noah.whatsappclone.shared.error.domain.Assert;

import java.util.List;

public record Messages(List<Message> messages) {
    public Messages {
        Assert.field("messages", messages).notNull().noNullElement();
    }
}
