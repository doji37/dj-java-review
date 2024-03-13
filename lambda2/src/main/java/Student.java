import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.*;

@AllArgsConstructor
// @Data includes (@NoArgsConstructor@Data@Getter@Setter@ToString@EqualsAndHashCode@RequiredArgsConstructor)
@Data
//@NoArgsConstructor
//@Data
//@Getter
//@Setter
//@ToString
//@EqualsAndHashCode
// @RequiredArgsConstructor
public class Student {

    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private String password;
    private String confirmPassword;
    //private final int age;


}
