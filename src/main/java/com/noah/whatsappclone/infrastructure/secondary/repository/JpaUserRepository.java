package com.noah.whatsappclone.infrastructure.secondary.repository;

import com.noah.whatsappclone.infrastructure.secondary.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaUserRepository extends JpaRepository<UserEntity, Long> {
}
