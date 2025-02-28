package com.code.food.controller;

import com.code.food.entity.MenuItemEntity;
import com.code.food.service.MenuItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/item")
public class MenuItemController {

    @Autowired
    private MenuItemService menuItemService;

    @PostMapping
    public MenuItemEntity createItem(@RequestBody MenuItemEntity menuItemEntity) {
        return menuItemService.createItem(menuItemEntity);
    }

    @GetMapping
    public List<MenuItemEntity> findAllItems() {
        return menuItemService.findAllItems();
    }

    @GetMapping("/{id}")
    public Optional<MenuItemEntity> getItemById(@PathVariable Long id) {
        return menuItemService.getItemById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteItem(@PathVariable Long id) {
        menuItemService.deleteItem(id);
    }

    @PutMapping("/{id}")
    public MenuItemEntity updateItem(@RequestBody MenuItemEntity newItem, @PathVariable Long id) {
        return menuItemService.updateItem(newItem, id);
    }

}
