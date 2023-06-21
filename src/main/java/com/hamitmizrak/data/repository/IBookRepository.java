package com.hamitmizrak.data.repository;

import com.hamitmizrak.data.entity.BookEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
// N(Book) 1(Writer)
public interface IBookRepository extends CrudRepository<BookEntity,Long> {

    //public BookEntity findBookEntities(String book);
}
