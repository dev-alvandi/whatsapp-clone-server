package com.noah.whatsappclone.infrastructure.secondary.repository;

import com.noah.whatsappclone.infrastructure.secondary.entity.ConversationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaConversationRepository extends JpaRepository<ConversationEntity, Long> {
}
