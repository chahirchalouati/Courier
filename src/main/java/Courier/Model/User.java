package Courier.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Users")
@Table(name = "Users")
@NamedQueries({
    @NamedQuery(name = "User.findByUsername", query = "SELECT u FROM Users u WHERE u.username =:username"),
    @NamedQuery(name = "User.findByEmailContact", query = "SELECT u FROM Users u WHERE u.contact.email =:email"),
    @NamedQuery(name = "User.findByIdUser", query = "SELECT u FROM Users u WHERE u.idUser=:idUser"),})
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUser;
    @NotBlank(message = "firstname can't be blank")
    private String firstname;
    @NotBlank(message = "lastname can't be blank")
    private String lastname;
    @NotBlank(message = "username can't  be blank")
    @Column(unique = true)
    private String username;
    @JsonProperty(access = Access.WRITE_ONLY)
    @Lob
    @Size(min = 8, max = 32, message = "Invalid password min 8 , max 9")
    private String password;

    @ManyToOne(targetEntity = Contact.class)
    @JsonProperty(access = Access.READ_WRITE)
    private Contact contact;

    @ManyToOne(targetEntity = Authoritie.class)
    @JsonProperty(access = Access.READ_ONLY)
    private Authoritie authoritie;

    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonProperty(access = Access.READ_ONLY)
    private Date createdAt;

}
