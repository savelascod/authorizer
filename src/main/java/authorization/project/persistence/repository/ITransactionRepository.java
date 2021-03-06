package authorization.project.persistence.repository;

import authorization.project.persistence.entity.TransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.OffsetDateTime;
import java.util.List;

/**
 * Repository contract to manage persistence on {@link TransactionEntity} Entities
 *
 * @version 1.0
 * @since 1.0
 */
public interface ITransactionRepository extends JpaRepository<TransactionEntity, Integer> {

    List<TransactionEntity> findAllByDateLessThanEqualAndDateGreaterThanEqual
            (OffsetDateTime endDateTime, OffsetDateTime startDateTime);

    List<TransactionEntity> findAllByAmountEqualsAndMerchantNameEquals
            (Integer amount, String merchantName);
}
