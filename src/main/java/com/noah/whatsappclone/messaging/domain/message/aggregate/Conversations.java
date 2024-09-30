package com.noah.whatsappclone.messaging.domain.message.aggregate;

import com.noah.whatsappclone.shared.error.domain.Assert;

import java.util.List;

public record Conversations(List<Conversation> conversations) {

    public Conversations {
        Assert.field("conversations", conversations).notNull().noNullElement();
    }
}
