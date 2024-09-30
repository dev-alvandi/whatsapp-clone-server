package com.noah.whatsappclone.infrastructure.secondary.repository;

import com.noah.whatsappclone.infrastructure.secondary.entity.MessageContentBinaryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaMessageContentBinaryRepository extends JpaRepository<MessageContentBinaryEntity, Long> {
}
