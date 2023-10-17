package az.ingress.payment.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Builder
@Data
@AllArgsConstructor
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "cash")

public class CreditPayment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String cardNumber;

    String expiryDate;

    Integer cvvCode;
}

