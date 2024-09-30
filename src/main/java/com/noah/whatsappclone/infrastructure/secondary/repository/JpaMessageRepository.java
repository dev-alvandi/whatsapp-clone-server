package com.noah.whatsappclone.infrastructure.secondary.repository;

import com.noah.whatsappclone.infrastructure.secondary.entity.MessageEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaMessageRepository extends JpaRepository<MessageEntity, Long> {
}
