package com.noah.whatsappclone.messaging.domain.message.valueObject;

import com.noah.whatsappclone.shared.error.domain.Assert;

import java.time.Instant;

public record  MessageSendTime(Instant date) {
    public MessageSendTime {
        Assert.field("date", date).notNull();
    }
}
