package com.noah.whatsappclone.messaging.domain.message.aggregate;

import com.noah.whatsappclone.messaging.domain.message.valueObject.ConversationPublicId;
import com.noah.whatsappclone.messaging.domain.message.valueObject.MessageContent;

public record MessageSendNew(MessageContent messageContent, ConversationPublicId conversationPublicId) {
}
