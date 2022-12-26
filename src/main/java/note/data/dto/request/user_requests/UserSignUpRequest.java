package note.data.dto.request;

import lombok.Data;
import note.data.models.Note;

import java.util.List;

@Data
public class UserSignUpRequest {
    private String firstName;
    private String lastName;
    private String password;
    private String email;
}
