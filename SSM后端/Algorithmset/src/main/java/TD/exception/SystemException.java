package TD.exception;

/**
 * @Description: 自定义异常
 * @ClassName: BuinessException
 * @Author: 25507
 * @Date: 2022-08-14 9:12
 * @Version: 1.0
 */
public class SystemException extends RuntimeException {
    public SystemException() {
        super();
    }

    public SystemException(String message) {
        super(message);
    }

    public SystemException(String message, Throwable cause) {
        super(message, cause);
    }

    public SystemException(Throwable cause) {
        super(cause);
    }

    protected SystemException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
