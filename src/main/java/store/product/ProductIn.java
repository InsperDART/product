package store.product;

import lombok.Builder;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

@Builder
public record ProductIn(

    @NotBlank
    String name,

    @Positive
    @NotNull
    Double price,

    @NotNull
    String unit

) {}