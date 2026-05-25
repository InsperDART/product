package store.product;

import lombok.Builder;

@Builder
public record ProductOut(

    Int id,
    String name,
    String price,
    String unit

) {}