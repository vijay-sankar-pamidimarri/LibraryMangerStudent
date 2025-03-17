package StudentLibraryManagement.LibraryMangerApplication.Dialect.Model;

import StudentLibraryManagement.LibraryMangerApplication.Enum.countryEnum.country;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "User")
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {
    @Id
   long userId;
    @Column(nullable = false)
    String userName;
    @Column(nullable = false,unique = true)
    String mail;
    @Column(nullable = false,unique = true)
    String mobileNumber;
//    @Enumerated(EnumType.STRING)
//    @Column(nullable = false, columnDefinition = "VARCHAR(255)")
    String country;
    String Description;

//    RelationsShips

    @OneToOne(mappedBy = "user",cascade = CascadeType.ALL,orphanRemoval = true)
    PvsCard pvsCard;
}
