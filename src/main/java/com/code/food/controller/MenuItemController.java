package com.code.food.controller;

import com.code.food.entity.MenuItemEntity;
import com.code.food.repository.MenuItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

// O @RestController serve para dizer que a classe é um controlador de requisição
// O @RequestMapping serve para dizer qual caminho a requisição irá percorrer
@RestController
@RequestMapping("/item")
public class MenuItemController {

    @Autowired
    MenuItemRepository menuItemRepository;

    @PostMapping
    public MenuItemEntity createItem(@RequestBody MenuItemEntity menuItemEntity ){
        return menuItemRepository.save(menuItemEntity);
    }

}
