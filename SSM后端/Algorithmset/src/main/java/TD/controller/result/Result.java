package TD.controller.result;

/**
 * @Description: 返回数据格式统一封装
 * @ClassName: Result
 * @Author: 25507
 * @Date: 2022-08-14 8:50
 * @Version: 1.0
 */
public class Result {

    //操作结果编码
    private Integer code;

    //操作数据结果
    private Object data;

    //消息
    private String message;


    public Result(Integer code, Object data) {
        this.code = code;
        this.data = data;
    }


    public Result(Integer code, Object data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    public Result(Integer code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", data=" + data +
                ", message='" + message + '\'' +
                '}';
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
