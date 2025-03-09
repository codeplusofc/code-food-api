package com.code.food.validation;

import com.code.food.entity.UserEntity;
import com.code.food.exception.BadRequestException;

public class UserValidator {

    public static void validateFields(UserEntity userEntity) {
        validateName(userEntity.getName());
        validateEmail(userEntity.getEmail());
        validatePassword(userEntity.getPassword());
        validatePhone(userEntity.getPhone());
    }

    public static String validateName(String name) {
        if (name.isEmpty()) {
            throw new BadRequestException("O nome não pode ser vazio");
        }
        return name;
    }

    public static String validateEmail(String email) {
        if (email.isEmpty()) {
            throw new BadRequestException("O e-mail não pode ser vazio");
        }
        return email;
    }

    public static String validatePassword(String password) {
        if (password.isEmpty()) {
            throw new BadRequestException("A senha não pode ser vazia");
        }
        return password;
    }

    public static String validatePhone(String phone) {
        if (phone.isEmpty()) {
            throw new BadRequestException("O telefone não pode ser vazio");
        }
        return phone;
    }
}



