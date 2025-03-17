package StudentLibraryManagement.LibraryMangerApplication.Controller;

import StudentLibraryManagement.LibraryMangerApplication.Dialect.Model.User;
import StudentLibraryManagement.LibraryMangerApplication.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("LibrarayManager")
public class userController {
    @Autowired
    UserService userService;

    @PostMapping("/testing")
    public String testingLibrary(@RequestParam(required = false,defaultValue = "vijay") String name,@RequestParam("age") int age){
        return name+" Hi Library Manger Working Good";
    }



    @PostMapping("create/user")
    public String CreateUser(@RequestBody User user){
        return userService.createUser(user);
    }
}
