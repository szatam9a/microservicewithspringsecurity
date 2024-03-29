package jpasecurity.jpasecurity.model.dto.note;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateNoteDto {
    @Schema(description = "The name of the new example", example = "")
    private String name;
    @Schema(description = "The description of the new example", example = "")
    private String description;


}
