package az.ingress.payment.dto.Response;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class InvoiceResponse {
    Long id;

    Double amount;
    @JsonFormat(pattern = "dd.MM.yyyy")
    LocalDate dueDate;
}
