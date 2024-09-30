package com.noah.whatsappclone.infrastructure.secondary.repository;

import com.noah.whatsappclone.messaging.domain.message.aggregate.Conversation;
import com.noah.whatsappclone.messaging.domain.message.aggregate.ConversationToCreate;
import com.noah.whatsappclone.messaging.domain.message.repository.ConversationRepository;
import com.noah.whatsappclone.messaging.domain.message.valueObject.ConversationPublicId;
import com.noah.whatsappclone.messaging.domain.user.aggregate.User;
import com.noah.whatsappclone.messaging.domain.user.valueObject.UserPublicId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class SpringDataConversationRepository implements ConversationRepository {

    @Override
    public Conversation save(ConversationToCreate conversation,
                             List<User> members) {
        return null;
    }

    @Override
    public Optional<Conversation> get(ConversationPublicId conversationPublicId) {
        return Optional.empty();
    }

    @Override
    public Page<Conversation> getConversationByUserPublicId(UserPublicId userPublicId,
                                                            Pageable pageable) {
        return null;
    }

    @Override
    public int deleteByPublicId(UserPublicId userPublicId,
                                ConversationPublicId conversationPublicId) {
        return 0;
    }

    @Override
    public Optional<Conversation> getConversationByUsersPublicIdAndPublicId(UserPublicId userPublicId,
                                                                            ConversationPublicId conversationPublicId) {
        return Optional.empty();
    }

    @Override
    public Optional<Conversation> getConversationByUserPublicIds(List<UserPublicId> publicIds) {
        return Optional.empty();
    }

    @Override
    public Optional<Conversation> getOneByPublicId(ConversationPublicId conversationPublicId) {
        return Optional.empty();
    }
}
