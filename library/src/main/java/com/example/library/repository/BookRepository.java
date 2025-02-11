package com.example.library.repository;

import com.example.library.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Indica que esta interfaz es un repositorio
public interface BookRepository extends JpaRepository<Book, Long> {
    // Spring Data JPA genera automáticamente los métodos CRUD
}