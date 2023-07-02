package com.example.lanittesttask.repository;

import com.example.lanittesttask.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AuthorRepository extends JpaRepository<Author, String> {

    @Query(value = "select * from author a where a.id = :id", nativeQuery = true)
    Optional<Author> findById(String id);
}
