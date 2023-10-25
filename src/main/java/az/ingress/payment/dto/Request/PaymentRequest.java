package az.ingress.payment.dto.Request;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PaymentRequest {

    Double amount;

    String paymentMethod;

    @JsonFormat(pattern = "dd.MM.yyyy")
    LocalDate date;

}
