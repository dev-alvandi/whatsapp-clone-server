package com.noah.whatsappclone.messaging.domain.message.repository;

import com.noah.whatsappclone.messaging.domain.message.aggregate.Conversation;
import com.noah.whatsappclone.messaging.domain.message.aggregate.ConversationToCreate;
import com.noah.whatsappclone.messaging.domain.message.valueObject.ConversationPublicId;
import com.noah.whatsappclone.messaging.domain.user.aggregate.User;
import com.noah.whatsappclone.messaging.domain.user.valueObject.UserPublicId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface ConversationRepository {

    Conversation save(ConversationToCreate conversation, List<User> members);

    Optional<Conversation> get(ConversationPublicId conversationPublicId);

    Page<Conversation> getConversationByUserPublicId(UserPublicId userPublicId, Pageable pageable);

    int deleteByPublicId(UserPublicId userPublicId, ConversationPublicId conversationPublicId);

    Optional<Conversation> getConversationByUsersPublicIdAndPublicId(UserPublicId userPublicId,
                                                                     ConversationPublicId conversationPublicId);

    Optional<Conversation> getConversationByUserPublicIds(List<UserPublicId> publicIds);

    Optional<Conversation> getOneByPublicId(ConversationPublicId conversationPublicId);
}
