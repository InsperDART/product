package store.product;

import lombok.Builder;

@Builder
public record ProductIn(

    String name,
    String price,
    String unit

) {}