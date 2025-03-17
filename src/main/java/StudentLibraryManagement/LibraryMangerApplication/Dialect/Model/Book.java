package StudentLibraryManagement.LibraryMangerApplication.Dialect.Model;

import StudentLibraryManagement.LibraryMangerApplication.Enum.countryEnum.BookCatgeory;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Book")
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Book {
    @Id
    long bookId;
    String bookName;
    int noOfPages;
    @Column(nullable = false)
    String activeLink;
    @Column(nullable = false)
    String authorName;
    @Column(nullable = false)
    String title;
//    @Enumerated(EnumType.STRING)
//    @Column(nullable = false, columnDefinition = "VARCHAR(255)")
    String catgeory;


//    Relationships
     @ManyToOne
     @JoinColumn(name = "pvsCard")
     PvsCard pvsCard;


}
