package com.mesbahi.mongocrud.repository;

import com.mesbahi.mongocrud.entity.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepo extends MongoRepository<Book, Integer> {
}
