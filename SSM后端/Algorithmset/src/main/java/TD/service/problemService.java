package TD.service;

import TD.domain.Problem;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface problemService {

    public boolean addproblem(Problem problem);

    public List<Problem> showproblem(String username);

    public Problem specificpro(int id);
}
