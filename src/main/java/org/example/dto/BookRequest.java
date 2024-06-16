package org.example.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@Builder
public class BookRequest {

    @Schema(description = "Название книги", example = "Гамлет")
    @NotNull
    @NotBlank
    String title;

    @Schema(description = "Авторы книги", example = "[\"Шекспир\", \"Пушкин\"]")
    @NotNull
    //@Schema(description = "Список точек доставки, Map.Entry<номер точки, координаты точки>", example = "[{\"658571\": \"55.784853, 37.547717\"}, {\"658572\": \"55.739778,37.669211\"}, {\"658573\": \"55.767954,37.633104\"}]")
    List<String> authorNames;

    @Schema(description = "ISBN книги", example = "ISBN 978-5-699-12014-7")
    @NotNull
    @NotBlank
    String isbn;
}