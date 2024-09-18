package com.noah.whatsappclone.messaging.domain.message.valueObject;

public record MessageContent(String text,
                             MessageType type,
                             MessageMediaContent media) {
    public MessageContent {
    }
}
