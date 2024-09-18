package com.noah.whatsappclone.messaging.domain.message.aggregate;

import com.noah.whatsappclone.messaging.domain.message.valueObject.ConversationName;
import com.noah.whatsappclone.messaging.domain.message.valueObject.ConversationPublicId;
import com.noah.whatsappclone.shared.error.domain.Assert;
import org.jilt.Builder;

import java.util.Set;


@Builder
public class Conversation {

    private final Set<Message> messages;

    private final Set<User> members;

    private final ConversationPublicId conversationPublicId;

    private final ConversationName conversationName;

    private Long dbId;

    public Conversation(Set<Message> messages,
                        Set<User> members,
                        ConversationPublicId conversationPublicId,
                        ConversationName conversationName,
                        Long dbId) {
        this.messages = messages;
        this.members = members;
        this.conversationPublicId = conversationPublicId;
        this.conversationName = conversationName;
        this.dbId = dbId;
    }

    private void assertMandatoryFields(Set<User> users, ConversationName name) {
        Assert.notNull("users", users);
        Assert.notNull("name", name); // 28:50
    }
}
