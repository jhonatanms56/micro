package com.bitso.challenge.micro.repository;

import com.bitso.challenge.micro.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
