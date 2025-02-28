package com.code.food.service;

import com.code.food.entity.MenuItemEntity;
import com.code.food.repository.MenuItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static com.code.food.validation.ItemValidator.validateItems;

@Service
public class MenuItemService {

    @Autowired
    private MenuItemRepository menuItemRepository;

    public MenuItemEntity createItem(MenuItemEntity menuItemEntity) {
        validateItems(menuItemEntity);
        return menuItemRepository.save(menuItemEntity);
    }

    public List<MenuItemEntity> findAllItems() {
        return menuItemRepository.findAll();
    }

    public void deleteItem(Long id) {
        menuItemRepository.deleteById(id);
    }

    public Optional<MenuItemEntity> getItemById(Long id) {
        return menuItemRepository.findById(id);
    }

    public MenuItemEntity updateItem(MenuItemEntity newItem, Long id) {
        Optional<MenuItemEntity> menuDataBase = menuItemRepository.findById(id);

        if (menuDataBase.isEmpty()) {
            throw new RuntimeException("Usuário inexistente");
        }

        menuDataBase.get().setName(newItem.getName());
        menuDataBase.get().setDescription(newItem.getDescription());
        menuDataBase.get().setPrice(newItem.getPrice());
        menuDataBase.get().setType(newItem.getType());
        menuDataBase.get().setIngredients(newItem.getIngredients());
        menuDataBase.get().setImageUrl(newItem.getImageUrl());
        menuDataBase.get().setCategory(newItem.getCategory());
        menuDataBase.get().setAvailability(newItem.getAvailability());

        return menuItemRepository.save(menuDataBase.get());
    }
}
