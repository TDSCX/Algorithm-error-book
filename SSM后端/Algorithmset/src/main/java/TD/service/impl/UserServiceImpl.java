package TD.service.impl;

import TD.dao.userDao;
import TD.domain.User;
import TD.service.userService;
import TD.utils.WebUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements userService {

    @Autowired
    private userDao userdao;

    @Override
    public boolean addUser(User user) {


        String uname = user.getUsername();

        if (uname!=null) {
            userdao.addUser(user);
            return true;
        }
        return false;
    }

    @Override
    public User demandUser(User user) {

        String password = user.getPassword();
        User u = userdao.demandUser(user);

        if(u!=null && u.getPassword().equals(password)){
            WebUtils.getSession().setAttribute("user",u);
            return u;
        }
        return null;
    }

}
