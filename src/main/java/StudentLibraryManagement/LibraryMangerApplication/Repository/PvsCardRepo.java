package StudentLibraryManagement.LibraryMangerApplication.Repository;

import StudentLibraryManagement.LibraryMangerApplication.Dialect.Model.PvsCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PvsCardRepo extends JpaRepository<PvsCard,Integer> {
}
