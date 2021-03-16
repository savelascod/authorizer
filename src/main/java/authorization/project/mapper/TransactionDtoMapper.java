package authorization.project.mapper;

import authorization.project.dto.domain.TransactionDto;
import authorization.project.dto.request.TransactionAuthorizationRequestDto;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * Mapper class for {@link TransactionDtoMapper}
 *
 * @version 1.0
 * @since 1.0
 */
@Component
public class TransactionDtoMapper extends DefaultMapper {
    public Optional<TransactionDto> objectToTransactionAuthorizationRequestDto(Object object) {
        return Optional.ofNullable(getObjectMapper().convertValue(object, TransactionAuthorizationRequestDto.class).getTransaction());
    }
}
