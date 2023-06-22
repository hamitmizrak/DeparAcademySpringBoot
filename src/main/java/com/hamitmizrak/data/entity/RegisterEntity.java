package com.hamitmizrak.data.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

import java.io.Serializable;

// LOMBOK
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Log4j2
// @SneakyThrows

@Entity
@Table(name="register")
public class RegisterEntity  extends BaseEntity implements Serializable {

    public static final Long serialVersionUID=1L;

    @Column(name="email", columnDefinition = "varchar(255) default 'deneme@gmail.com' ")
    private String uEmail;

    @Column(name="password", columnDefinition = "varchar(255) default 'Hm1234@.' ")
    private String uPassword;
}
