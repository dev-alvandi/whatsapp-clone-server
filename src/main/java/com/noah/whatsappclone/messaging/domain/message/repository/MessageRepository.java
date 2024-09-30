package com.noah.whatsappclone.messaging.domain.message.repository;

import com.noah.whatsappclone.messaging.domain.message.aggregate.Conversation;
import com.noah.whatsappclone.messaging.domain.message.aggregate.Message;
import com.noah.whatsappclone.messaging.domain.message.valueObject.ConversationPublicId;
import com.noah.whatsappclone.messaging.domain.message.valueObject.MessageSendState;
import com.noah.whatsappclone.messaging.domain.user.aggregate.User;
import com.noah.whatsappclone.messaging.domain.user.valueObject.UserPublicId;

import java.util.List;

public interface MessageRepository {

    Message save(Message message, User user, Conversation conversation);

    int updateMessageSendState(ConversationPublicId conversationPublicId,
                               UserPublicId userPublicId,
                               MessageSendState messageSendState);

    List<Message> findMessageToUpdateSendState(ConversationPublicId conversationPublicId, UserPublicId userPublicId);


}
