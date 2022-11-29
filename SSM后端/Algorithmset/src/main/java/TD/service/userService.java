package TD.service;

import TD.domain.User;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface userService {

    public boolean addUser(User user);



    public User demandUser(User user);
}
