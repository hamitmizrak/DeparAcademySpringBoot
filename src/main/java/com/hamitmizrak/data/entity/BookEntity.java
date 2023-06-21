package com.hamitmizrak.data.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

// LOMBOK
@Getter
@Setter

// Entity
@Entity
@Table(name = "book")
// N(Book) 1(Writer)
public class BookEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private Long id;

    @Column(name = "book_name")
    private String bookName;

    @Column(name = "book_price")
    private String bookPrice;

    // Relation
    // Varsayılan olarak, @ManyToOne ilişkilendirmesi getirme türü için FetchType.EAGER kullanır, ancak performans açısından kötüdür
    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name="writer_id",nullable = false)
    // @OnDelete(action = OnDeleteAction.CASCADE)
    //@JsonIgnore //Json verisinde gözükmesini istemediğimiz alanları tanımlanır
    private WriterEntity writerEntity;

    // CONSTRUCTOR
    // parametresiz Constructor
    public BookEntity() {
    }

    // parametreli constructor
    public BookEntity(String bookName, String bookPrice) {
        this.bookName = bookName;
        this.bookPrice = bookPrice;
    }
}
