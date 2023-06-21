package com.hamitmizrak.data.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
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
@Table(name="person")
public class PersonEntity  extends BaseEntity implements Serializable {

    private String personName;
    private String personSurname;
}
