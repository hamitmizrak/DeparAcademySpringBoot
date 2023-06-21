package com.hamitmizrak.data.repository;

import com.hamitmizrak.data.entity.WriterEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IWriterRepository extends CrudRepository<WriterEntity,Long> {
}
