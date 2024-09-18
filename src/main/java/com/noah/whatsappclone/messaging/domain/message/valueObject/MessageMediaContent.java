package com.noah.whatsappclone.messaging.domain.message.valueObject;

public record MessageMediaContent(byte[] file,
                                  String mimetype) {
}
