package TD.exception;

/**
 * @Description: 自定义异常
 * @ClassName: BuinessException
 * @Author: 25507
 * @Date: 2022-08-14 9:12
 * @Version: 1.0
 */
public class BuinessException extends RuntimeException {

    //异常编码
    private Integer code;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public BuinessException(Integer code) {
        super();
        this.code = code;
    }

    public BuinessException(String message,Integer code) {
        super(message);
        this.code = code;
    }

    public BuinessException(String message, Throwable cause,Integer code) {
        super(message, cause);
        this.code = code;
    }

    public BuinessException(Throwable cause,Integer code) {
        super(cause);
        this.code = code;
    }

    protected BuinessException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace,Integer code) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.code = code;
    }
}
