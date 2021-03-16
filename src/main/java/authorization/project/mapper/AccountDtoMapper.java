package authorization.project.mapper;

import authorization.project.dto.domain.AccountDto;
import authorization.project.dto.request.AccountCreationRequestDto;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * Mapper class for {@link AccountDto}
 *
 * @version 1.0
 * @since 1.0
 */
@Component
public class AccountDtoMapper extends DefaultMapper {
    public Optional<AccountDto> objectToAccountCreationRequestDto(Object object) {
        return Optional.ofNullable(getObjectMapper().convertValue(object, AccountCreationRequestDto.class).getAccount());
    }
}
