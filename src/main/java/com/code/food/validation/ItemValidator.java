package com.code.food.validation;

import com.code.food.entity.MenuItemEntity;

public class ItemValidator {

    public static void validateItems(MenuItemEntity menuItemEntity) {
        validateName(menuItemEntity.getName());
        validatePrice(menuItemEntity.getPrice());
        validateAvailability(menuItemEntity.getAvailability());
    }


    public static String validateName(String name) {
        if (name.isEmpty()) {
            throw new RuntimeException("O prato precisa de um nome");
        }
        return name;
    }

    public static double validatePrice(double price) {
        if (price <= 0.0) {
            throw new RuntimeException("O preço deve ser maior que R$ 0,00");
        }
        return price;
    }

    public static String validateAvailability(String availability) {
        if (availability.isEmpty()) {
            throw new RuntimeException("É necessário informar a disponibilidade");
        }
        return availability;
    }
}
