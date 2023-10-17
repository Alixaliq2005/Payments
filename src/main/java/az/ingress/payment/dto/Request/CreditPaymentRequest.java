package az.ingress.payment.dto.Request;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CreditPaymentRequest {
    String cardNumber;

    String expiryDate;

    Integer cvvCode;

}
