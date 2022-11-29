package TD.controller;

import TD.domain.User;
import TD.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@CrossOrigin(origins = "*")
@RequestMapping(value = "",method = RequestMethod.GET)
@RestController
public class UserController {
    @Autowired
    private userService userservice;


    @PostMapping(value = "/register")
    public String register(User user){
        boolean rflag = userservice.addUser(user);
        if (rflag == true)return "success";
        System.out.println(user);
        return "fail";
    }

    @PostMapping(value = "/login")
    public String login(User user, HttpServletRequest request){
        String uname = user.getUsername();
        request.getServletContext().setAttribute("username", uname);

        System.out.println(user);
        User u = userservice.demandUser(user);
        if (u!=null)return "success";
        return "fail";
    }
}
