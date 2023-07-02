package com.example.lanittesttask.repository;

import com.example.lanittesttask.model.Title;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TitleRepository extends JpaRepository<Title, String> {

    @Query(value = "select * from title t where t.code = :id", nativeQuery = true)
    Optional<Title> findById(String id);
}
