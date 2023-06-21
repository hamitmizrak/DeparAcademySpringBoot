package com.hamitmizrak.main;

import com.hamitmizrak.data.entity.BookEntity;
import com.hamitmizrak.data.entity.WriterEntity;
import com.hamitmizrak.data.repository.IBookRepository;
import com.hamitmizrak.data.repository.IWriterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// LOMBOK
@RequiredArgsConstructor

@Configuration
public class OneToManyMain {

    private final IWriterRepository iWriterRepository;
    private final IBookRepository iBookRepository;

    @Bean
    public CommandLineRunner commandLineRunnerAutomaticProduct2(){
        return (args)->{
            // Önce Tekil ile başla
            // Writer(1)
            WriterEntity writerEntity = new WriterEntity();
            writerEntity.setWriterName("Neşat Nuri");
            writerEntity.setWriterSurname("Gültekin");
            iWriterRepository.save(writerEntity);

            // BookEntity(N)
            BookEntity bookEntity = new BookEntity();
            bookEntity.setBookName("Çalıkuşu");
            bookEntity.setBookPrice("25TL");
            bookEntity.setWriterEntity(writerEntity);
            iBookRepository.save(bookEntity);
        }; //end return
    }// end commandLineRunnerAutomaticProduct
}




