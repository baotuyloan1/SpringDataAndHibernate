package com.manning.javapersistence.helloworld.repositories;

import com.manning.javapersistence.helloworld.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepository extends CrudRepository<Message, Long> {
}
