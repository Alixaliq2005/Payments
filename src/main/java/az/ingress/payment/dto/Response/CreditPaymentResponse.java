package az.ingress.payment.dto.Response;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CreditPaymentResponse {
    Long id;

    String cardNumber;

    String expiryDate;

    Integer cvvCode;
}

