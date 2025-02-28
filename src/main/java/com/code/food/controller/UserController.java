package com.code.food.controller;

import com.code.food.entity.UserEntity;
import com.code.food.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

// A anotação @RestController indica que esta classe é responsável por tratar requisições HTTP
@RestController
// A anotação @RequestMapping define o caminho base para acessar os métodos dessa classe.
// No caso, a URL será mapeada para "/user", e qualquer metodo dentro da classe com um mapeamento.
// adicional será acessado em relação a esse caminho.
@RequestMapping("/user")
public class UserController {

    // A anotação @Autowired é utilizada para injeção automática de dependências pelo Spring.
    @Autowired
    private UserService userService;

    // A anotação @PostMapping é usada para mapear uma requisição HTTP do tipo POST
    // A anotação @RequestBody é utilizada para indicar que o corpo da requisição HTTP
    // será convertido automaticamente em um objeto Java. O Spring realiza a desserialização
    // dos dados (geralmente em formato JSON ou XML) e os mapeia para o parâmetro do metodo
    // de acordo com o tipo especificado.
    @PostMapping
    public UserEntity createUser(@RequestBody UserEntity userEntity) {
        return userService.createUser(userEntity);
    }

    // A anotação @GetMapping serve para especificar que vamos buscar e retornar algo
    // O metodo findAllUsers() irá retornar uma lista(List) contendo todos os usuários que foram cadastrados
    @GetMapping
    public List<UserEntity> findAllUsers() {
        return userService.findAllUsers();
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }

    @GetMapping("/{id}")
    public Optional<UserEntity> getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

}
