package TD.controller.interceptor;

import TD.controller.result.Result;
import TD.exception.BuinessException;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description: 项目异常增强处理器
 * @ClassName: ProjectExceptionAdivce
 * @Author: 25507
 * @Date: 2022-08-14 9:17
 * @Version: 1.0
 */
@Component
@ControllerAdvice
public class ProjectExceptionAdivce {
    @ExceptionHandler(BuinessException.class)
    @ResponseBody //不解析页面
    public Result doBuinessExecption(BuinessException e){
        return  new Result(e.getCode(),null,e.getMessage());
    }
}
