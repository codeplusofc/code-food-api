package com.code.food.repository;

import com.code.food.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// A interface UserRepository é um repositório de dados que estende JpaRepository,
// o que proporciona métodos prontos para operações CRUD (Create, Read, Update, Delete)
// no banco de dados para a entidade UserEntity. A anotação @Repository indica
// que esta interface é um componente do Spring responsável por acessar a camada de persistência.
@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
