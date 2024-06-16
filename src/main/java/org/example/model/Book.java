package org.example.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@Builder
@Table(name = "books")
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "ID книги")
    @Column(name = "id")
    Long id;

    @Schema(description = "Название")
    @Column(name = "title")
    String title;

    @Schema(description = "ISBN книги")
    String isbn;

    @Schema(description = "Авторы")
    @ManyToMany
    @JoinTable(name = "books_autors",
            joinColumns = @JoinColumn(name = "books_id"),
            inverseJoinColumns = @JoinColumn(name = "autors_id"))
    List<Author> authors;
}