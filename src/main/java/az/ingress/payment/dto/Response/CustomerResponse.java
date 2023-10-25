package az.ingress.payment.dto.Response;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CustomerResponse {
    Long id;

    String firstName;

    String lastName;

    String phoneNumber;

    String email;
}
