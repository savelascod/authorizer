package authorization.project.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.OffsetDateTime;

/**
 * Entity class that represents a TRANSACTION
 *
 * @version 1.0
 * @since 1.0
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class TransactionEntity {

    /**
     * Internal ID representation of an ACCOUNT object
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * Integer that represents the DESTINY ACCOUNT'S ID
     */
    @NotNull
    private Integer destinyAccountId;

    /**
     * String that represents the MERCHANT'S NAME who perform the transaction
     */
    @NotNull
    private String merchantName;

    /**
     * OffsetDateTime that represents the TRANSACTION'S CREATION DATE
     */
    @NotNull
    @Column(name = "date", columnDefinition = "TIMESTAMP WITH TIME ZONE")
    private OffsetDateTime date;

    /**
     * Integer that represents the TRANSACTION'S AMOUNT
     */
    @NotNull
    private Integer amount;
}
