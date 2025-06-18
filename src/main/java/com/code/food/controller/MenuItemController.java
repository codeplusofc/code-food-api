package com.code.food.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// O @RestController serve para dizer que a classe é um controlador de requisição
// O @RequestMapping serve para dizer qual caminho a requisição irá percorrer
@RestController
@RequestMapping("/item")
public class MenuItemController {


}
