package TD.controller;


import TD.domain.Problem;
import TD.service.problemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "*")
@RequestMapping(value = "",method = RequestMethod.GET)
@RestController

public class ProblemController {

    @Autowired
    private problemService problemservice;

    @RequestMapping(value = "/augment",method = {RequestMethod.GET,RequestMethod.POST})
    public String addproblem(Problem problem, HttpServletRequest request){


        String uname = (String) request.getServletContext().getAttribute("username");
        problem.setUsername(uname);

        System.out.println(problem);
        problemservice.addproblem(problem);
        return "success";
    }

    @RequestMapping(value = "/")
    public List<Problem> showproblem(HttpServletRequest request){
        List<Problem> problemList = new ArrayList<Problem>();
        String uname = (String) request.getServletContext().getAttribute("username");
        problemList = problemservice.showproblem(uname);
        System.out.println(uname);
        System.out.println(problemList);
        return problemList;
    }

    @RequestMapping(value = "/specific",method = RequestMethod.GET)
    public Problem specificpro(int id){

        Problem problem = problemservice.specificpro(id);
        return problem;
    }
}
