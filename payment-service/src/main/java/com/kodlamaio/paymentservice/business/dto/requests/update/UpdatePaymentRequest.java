package com.kodlamaio.paymentservice.business.dto.requests.update;

import com.kodlamaio.paymentservice.business.dto.requests.PaymentRequest;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UpdatePaymentRequest extends PaymentRequest {
    @Min(value = 1)
    private double balance;
}