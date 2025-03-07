package com.code.food.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// A anotação @Entity indica que esta classe é uma entidade JPA, ou seja,
// ela será mapeada para uma tabela no banco de dados com o mesmo nome (ou um nome configurado).
@Entity
public class UserEntity {

    // A anotação @Id marca o campo 'id' como a chave primária da tabela,
    // identificando unicamente cada registro de usuário.
    @Id

    // A anotação @GeneratedValue define a estratégia para geração automática do valor do ID.
    // Neste caso, a estratégia GenerationType.AUTO permite que o JPA escolha a melhor forma
    // de gerar o ID, seja por incremento automático ou outro metodo dependendo do banco de dados.
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String email;
    private String password;
    private String role;
    private String phone;
    private String referralSource;

    public UserEntity(String name, String email, String password, String phone, String referralSource) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.referralSource = referralSource;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getReferralSource() {
        return referralSource;
    }

    public void setReferralSource(String referralSource) {
        this.referralSource = referralSource;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
