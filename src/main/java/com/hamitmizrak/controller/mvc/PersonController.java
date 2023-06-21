package com.hamitmizrak.controller.mvc;


import com.hamitmizrak.data.entity.PersonEntity;
import com.hamitmizrak.data.repository.IPersonRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// LOMBOK
@Log4j2
@RequiredArgsConstructor

@Controller

public class PersonController {

    private final IPersonRepository iPersonRepository;

    // Data Speed
    // http://localhost:2222/data/speed
    @GetMapping("/data/speed")
    @ResponseBody
    public String getPerson1() {
        for (int i = 1; i <= 40; i++) {
            PersonEntity personEntity = PersonEntity.builder()
                    .personName("adı " + i)
                    .personSurname("soyadı " + i)
                    .build();
            iPersonRepository.save(personEntity);
        }
        return "20 tane veri kaydedildi";
    }

    // http://localhost:2222/person/sorting
    @GetMapping("/person/sorting")
    @ResponseBody
    public String personNameSorting() {
        Sort sort = Sort.by("personName");
        Iterable<PersonEntity> personEntityList = iPersonRepository.findAll(sort);
        for (PersonEntity temp  :personEntityList ) {
            log.info(temp+" ");
        }
        return personEntityList+" ";
    }

    // http://localhost:2222/person/sorting2
    @GetMapping("/person/sorting2")
    @ResponseBody
    public String personNameSorting2() {
        //Sort sort = Sort.by("personName").ascending();
        Sort sort = Sort.by("personName").descending();
        Iterable<PersonEntity> personEntityList = iPersonRepository.findAll(sort);
        for (PersonEntity temp  :personEntityList ) {
            log.info(temp+" ");
        }
        return personEntityList+" ";
    }
}
