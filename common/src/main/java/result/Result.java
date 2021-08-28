package result;

import java.sql.ResultSet;

/**
 * 放回结果包装
 */
public class Result {

    private String code;
    private String message;
    private Object data;

    public static Result success() {
        return Result.success("操作成功");
    }


    public static Result success(String message) {

        return Result.success(message, null);
    }

    public static Result success(Object data) {
        return Result.success("操作成功", data);
    }

    public static Result success(String message, Object data) {
        return new Result("200", message, data);
    }

    /**
     * 错误
     *
     * @return
     */
    public static Result error() {

        return Result.error("操作失败");
    }

    public static Result error(String message) {
        return Result.error(message, null);

    }

    public static Result error(String message, Object data) {
        return new Result("500", message, null);
    }

    /**
     * 构造函数
     */
    public Result() {
    }

    public Result(String code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Result(String code, String message) {
        this.code = code;
        this.message = message;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
