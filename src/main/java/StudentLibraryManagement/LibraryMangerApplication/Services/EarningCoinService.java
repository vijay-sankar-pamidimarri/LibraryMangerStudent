package StudentLibraryManagement.LibraryMangerApplication.Services;

import StudentLibraryManagement.LibraryMangerApplication.Dialect.Model.User;
import StudentLibraryManagement.LibraryMangerApplication.Repository.EarningCoinRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EarningCoinService {
    @Autowired
    EarningCoinRepo earningCoinRepo;
    public void createCoinAccount(User user){
         return;
    }
}
