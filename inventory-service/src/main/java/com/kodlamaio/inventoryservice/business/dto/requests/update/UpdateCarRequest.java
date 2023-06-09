package com.kodlamaio.inventoryservice.business.dto.requests.update;

import com.kodlamaio.inventoryservice.entities.enums.State;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateCarRequest {
    @NotNull
    @NotBlank
    private UUID modelId;
    @Min(value = 2000)
    //todo: notfuture custom annotation
    private int modelYear;
    @NotBlank
    @NotNull
    //todo: add regex
    private String plate;
    @NotNull
    @NotBlank
    private State state;
    @Min(value = 1)
    private double dailyPrice;
}
