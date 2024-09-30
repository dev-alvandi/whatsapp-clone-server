package com.noah.whatsappclone.infrastructure.secondary.repository;

import com.noah.whatsappclone.messaging.domain.message.aggregate.Conversation;
import com.noah.whatsappclone.messaging.domain.message.aggregate.Message;
import com.noah.whatsappclone.messaging.domain.message.repository.MessageRepository;
import com.noah.whatsappclone.messaging.domain.message.valueObject.ConversationPublicId;
import com.noah.whatsappclone.messaging.domain.message.valueObject.MessageSendState;
import com.noah.whatsappclone.messaging.domain.user.aggregate.User;
import com.noah.whatsappclone.messaging.domain.user.valueObject.UserPublicId;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SpringDataMessageRepository implements MessageRepository {
    @Override
    public Message save(Message message,
                        User user,
                        Conversation conversation) {
        return null;
    }

    @Override
    public int updateMessageSendState(ConversationPublicId conversationPublicId,
                                      UserPublicId userPublicId,
                                      MessageSendState messageSendState) {
        return 0;
    }

    @Override
    public List<Message> findMessageToUpdateSendState(ConversationPublicId conversationPublicId,
                                                      UserPublicId userPublicId) {
        return List.of();
    }
}
