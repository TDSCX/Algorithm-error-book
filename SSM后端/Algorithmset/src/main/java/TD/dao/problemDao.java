package TD.dao;

import TD.domain.Problem;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface problemDao {
    @Insert("insert into problems(details,sourceurl,analysis,level,username,proname) values(#{details},#{sourceurl},#{analysis},#{level},#{username},#{proname})")
    public void addproblem(Problem problem);

    @Select("select * from problems where username=#{username}")
    public List<Problem> showpro(String username);

    @Select("select * from problems where id=#{id}")
    public Problem specificpro(int id);
}
