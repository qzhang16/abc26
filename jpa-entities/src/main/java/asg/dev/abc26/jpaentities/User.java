package asg.dev.abc26.jpaentities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@Builder
@NoArgsConstructor
@Data
@Entity
public class User {
    @Id
    private Long id;
    private String firstName;
    private String lastName;
    private String email;

}
