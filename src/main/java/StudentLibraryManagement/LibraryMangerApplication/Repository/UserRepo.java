package StudentLibraryManagement.LibraryMangerApplication.Repository;

import StudentLibraryManagement.LibraryMangerApplication.Dialect.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User,Integer> {
}
