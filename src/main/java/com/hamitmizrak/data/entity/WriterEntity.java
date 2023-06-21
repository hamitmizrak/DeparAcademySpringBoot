package com.hamitmizrak.data.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

// LOMBOK
@Getter
@Setter

// Entity
@Entity
@Table(name="writer")

// 1(Writer) N(Book)
public class WriterEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "writer_id")
    private Long id;

    @Column(name = "writer_name")
    private String writerName;

    @Column(name = "writer_surname")
    private String writerSurname;

    @OneToMany(mappedBy = "writerEntity",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    List<BookEntity> bookEntities;

    // parametresiz Constructor
    public WriterEntity() {
    }

    // parametreli constructor
    public WriterEntity(String writerName, String writerSurname) {
        this.writerName = writerName;
        this.writerSurname = writerSurname;
    }
}
