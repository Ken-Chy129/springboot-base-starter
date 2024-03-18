package cn.ken.common.core.domain;

import cn.ken.common.enums.ErrorCodeEnums;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/Ken-Chy129">Ken-Chy129</a>
 * @since 2024/3/18 19:21
 */
@Data
public class Result<T> implements Serializable {

    @Serial
    private static final long serialVersionUID = -6440134298617223727L;

    private String code;

    private String desc;

    private T data;

    public Result(String code, String desc, T data) {
        this(code, desc);
        this.data = data;
    }

    public Result(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static <T> Result<T> success() {
        return new Result<>(ErrorCodeEnums.SUCCESS.getCode(), ErrorCodeEnums.SUCCESS.getDesc());
    }

    public static <T> Result<T> success(T data) {
        return new Result<>(ErrorCodeEnums.SUCCESS.getCode(), ErrorCodeEnums.SUCCESS.getDesc(), data);
    }

    public static <T> Result<T> error() {
        return new Result<>(ErrorCodeEnums.ERROR.getCode(), ErrorCodeEnums.ERROR.getDesc());
    }

    public static <T> Result<T> error(ErrorCodeEnums enums) {
        return new Result<>(enums.getCode(), enums.getDesc());
    }
    
}
