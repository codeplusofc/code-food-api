package com.code.food.controller;

import com.code.food.entity.UserEntity;
import com.code.food.repository.UserRepository;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// O @RestController serve para dizer que a classe é um controlador de requisição
// O @RequestMapping serve para dizer qual caminho a requisição irá percorrer
@RestController
@RequestMapping("/user")
public class UserController {

    //O @Autowired serve para inicializar uma determinada dependencia
    @Autowired
    private UserRepository userRepository;

    //O @PostMapping serve para indicar que a funcionalidade é uma função responsável por inserção
    @PostMapping
    public UserEntity createUser(@RequestBody UserEntity userEntity) {
        if (userEntity.getEmail().isEmpty()||userEntity.getName().isEmpty()||userEntity.getPassword().isEmpty()||userEntity.getPhone().isEmpty()){
            throw new RuntimeException("Por favor inserir campos validos");
        }
        return userRepository.save(userEntity);
    }

    //TODO: @BrunoAligathor deve criar uma funcionalidade que retorne todos os usuários
    //TODO: @Ingrid deve validar se ao criar um usuário, todos os campos estão sendo preenchidos corretamente
}
