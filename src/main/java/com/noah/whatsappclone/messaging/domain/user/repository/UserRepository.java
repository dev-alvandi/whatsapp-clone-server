package com.noah.whatsappclone.messaging.domain.user.repository;

import com.noah.whatsappclone.infrastructure.secondary.entity.ConversationEntity;
import com.noah.whatsappclone.messaging.domain.message.valueObject.ConversationPublicId;
import com.noah.whatsappclone.messaging.domain.user.aggregate.User;
import com.noah.whatsappclone.messaging.domain.user.valueObject.UserEmail;
import com.noah.whatsappclone.messaging.domain.user.valueObject.UserPublicId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

public interface UserRepository {

    void save(User user);

    Optional<User> get(UserPublicId userPublicId);

    Optional<User> getOneByEmail(UserEmail userEmail);

    List<User> getByPublicIds(List<UserPublicId> userPublicIds);

    Page<User> search(Pageable pageable, String query);

    int updateLastSeenByPublicId(UserPublicId userPublicId, Instant lastSeen);

    List<User> getRecipientByConversationIdExcludingReader(ConversationPublicId conversationPublicId, UserPublicId readerPublicId);
}
