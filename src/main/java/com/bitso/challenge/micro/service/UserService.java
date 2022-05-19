package com.bitso.challenge.micro.service;

import com.bitso.challenge.micro.entity.UserEntity;
import com.bitso.challenge.micro.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserEntity> getAll(){
        return userRepository.findAll();
    }

    public Optional<UserEntity> findById(Long id){
        return userRepository.findById(id);
    }

    public Long create(UserEntity userEntity){
        UserEntity save = userRepository.save(userEntity);
        return save.getId();
    }

}
