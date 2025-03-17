package StudentLibraryManagement.LibraryMangerApplication.Repository;

import StudentLibraryManagement.LibraryMangerApplication.Dialect.Model.EarningCoin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EarningCoinRepo extends JpaRepository<EarningCoin,Integer> {

}
