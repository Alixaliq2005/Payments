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
public class CashPayment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    Double cashPayment;
}
