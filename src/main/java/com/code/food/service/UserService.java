package com.code.food.service;

import com.code.food.dto.InUser;
import com.code.food.dto.OutUser;
import com.code.food.entity.UserEntity;
import com.code.food.repository.UserRepository;
import com.code.food.validation.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static com.code.food.validation.UserValidator.*;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public OutUser createUser(InUser inUser) {

        UserEntity userEntity = new UserEntity(inUser.getName(), inUser.getEmail(),
                inUser.getPassword(), inUser.getPhone(), inUser.getReferralSource());

        validateFields(userEntity);

        UserEntity userSaved = userRepository.save(userEntity);

        return new OutUser(userSaved.getId(), userSaved.getName(), userSaved.getEmail(),
                userSaved.getRole(), userSaved.getPhone(), userSaved.getReferralSource());
    }

    public List<UserEntity> findAllUsers() {
        return userRepository.findAll();
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    public Optional<UserEntity> getUserById(Long id) {
        return userRepository.findById(id);
    }
}
