package authorization.project.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 * Entity class that represents an ACCOUNT
 *
 * @version 1.0
 * @since 1.0
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class AccountEntity {

    /**
     * Internal ID representation of an ACCOUNT object
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * Boolean that represents if an ACCOUNT has an ACTIVE CARD
     */
    @NotNull
    private Boolean activeCard;

    /**
     * Integer that represents the AVAILABLE LIMIT of an ACCOUNT
     */
    @NotNull
    private Integer availableLimit;
}
