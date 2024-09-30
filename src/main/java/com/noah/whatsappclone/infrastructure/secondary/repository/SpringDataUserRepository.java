package com.noah.whatsappclone.infrastructure.secondary.repository;

import com.noah.whatsappclone.messaging.domain.message.valueObject.ConversationPublicId;
import com.noah.whatsappclone.messaging.domain.user.aggregate.User;
import com.noah.whatsappclone.messaging.domain.user.repository.UserRepository;
import com.noah.whatsappclone.messaging.domain.user.valueObject.UserEmail;
import com.noah.whatsappclone.messaging.domain.user.valueObject.UserPublicId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

@Repository
public class SpringDataUserRepository implements UserRepository {

    @Override
    public void save(User user) {

    }

    @Override
    public Optional<User> get(UserPublicId userPublicId) {
        return Optional.empty();
    }

    @Override
    public Optional<User> getOneByEmail(UserEmail userEmail) {
        return Optional.empty();
    }

    @Override
    public List<User> getByPublicIds(List<UserPublicId> userPublicIds) {
        return List.of();
    }

    @Override
    public Page<User> search(Pageable pageable,
                             String query) {
        return null;
    }

    @Override
    public int updateLastSeenByPublicId(UserPublicId userPublicId,
                                        Instant lastSeen) {
        return 0;
    }

    @Override
    public List<User> getRecipientByConversationIdExcludingReader(ConversationPublicId conversationPublicId,
                                                                  UserPublicId readerPublicId) {
        return List.of();
    }
}
