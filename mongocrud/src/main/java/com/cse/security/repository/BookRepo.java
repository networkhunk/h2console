package com.cse.security.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.cse.security.entity.Book;
public interface BookRepo
	extends MongoRepository<Book, Integer> {
}
