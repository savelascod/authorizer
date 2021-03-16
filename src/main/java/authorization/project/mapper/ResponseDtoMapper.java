package authorization.project.mapper;

import authorization.project.dto.response.ResponseDto;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Mapper class for {@link ResponseDto}
 *
 * @version 1.0
 * @since 1.0
 */
@Component
public class ResponseDtoMapper extends DefaultMapper {
    public String responseListDtoToString(List<ResponseDto> responseDto) throws JsonProcessingException {
        return getObjectMapper().writeValueAsString(responseDto);
    }
}
