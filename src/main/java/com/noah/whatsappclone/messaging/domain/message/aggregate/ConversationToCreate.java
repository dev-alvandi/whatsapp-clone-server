package com.noah.whatsappclone.messaging.domain.message.aggregate;

import com.noah.whatsappclone.messaging.domain.message.valueObject.ConversationName;
import com.noah.whatsappclone.messaging.domain.user.valueObject.UserPublicId;
import com.noah.whatsappclone.shared.error.domain.Assert;
import org.jilt.Builder;

import java.util.Set;

@Builder
public class ConversationToCreate {
    private final Set<UserPublicId> members;

    private final ConversationName name;

    public ConversationToCreate(Set<UserPublicId> members, ConversationName name) {
        assertMandatoryFields(members, name);
        this.members = members;
        this.name = name;
    }

    private void assertMandatoryFields(Set<UserPublicId> members, ConversationName name) {
        Assert.notNull("members", members);
        Assert.notNull("name", name);
    }

    public Set<UserPublicId> getMembers() {
        return members;
    }

    public ConversationName getName() {
        return name;
    }
}
