package com.auto.salon;

import com.auto.salon.core.carBrand.Brand;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

import java.util.UUID;

@Builder
@Data
@AllArgsConstructor
public class Auto {

    @Builder.Default
    private UUID id = UUID.randomUUID();
    @NonNull
    private String registration;
    @NonNull
    private Brand brand;

}
