package TD.service.impl;

import TD.dao.problemDao;
import TD.domain.Problem;
import TD.service.problemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProblemServiceImpl implements problemService {

    @Autowired
    private problemDao problemdao;
    
    @Override
    public boolean addproblem(Problem problem) {

        problemdao.addproblem(problem);
        return true;
    }

    public List<Problem> showproblem(String username){

        return problemdao.showpro(username);
    }

    @Override
    public Problem specificpro(int id) {
        return problemdao.specificpro(id);
    }

}
