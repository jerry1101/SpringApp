package com.jerry.jpa.jpahibernatemysql.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * User
 */
@Entity
@Table(name = "users", catalog = "example")
@Data
@NoArgsConstructor
@ToString
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