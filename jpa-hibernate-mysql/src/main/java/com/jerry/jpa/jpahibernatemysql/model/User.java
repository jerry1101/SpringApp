package com.jerry.jpa.jpahibernatemysql.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * User
 */
@Entity
@Table(name = "users", catalog = "example")
@Data
@NoArgsConstructor
public class User {

    @Id
    @NotNull
    private Integer id;

    @NotNull
    @NotBlank
    private String name;
    @NotNull
    @NotBlank
    private String teamName;
    @NotNull
    @NotBlank
    private Integer salary;
}