package TD.dao;

import TD.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface userDao {

    @Insert("insert into users(username,password) values(#{username},#{password})")
    public void addUser(User user);


    @Select("select * from users where username=#{username}")
    public User demandUser(User user);
}
