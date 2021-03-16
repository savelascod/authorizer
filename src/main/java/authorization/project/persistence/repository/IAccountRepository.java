package authorization.project.persistence.repository;

import authorization.project.persistence.entity.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Repository contract to manage persistence on {@link AccountEntity} Entities
 *
 * @version 1.0
 * @since 1.0
 */
public interface IAccountRepository extends JpaRepository<AccountEntity, Integer> {
    Optional<AccountEntity> findFirstByIdIsNotNull();
}
