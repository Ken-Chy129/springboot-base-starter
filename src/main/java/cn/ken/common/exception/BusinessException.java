package cn.ken.common.exception;

import cn.ken.common.enums.ErrorCodeEnums;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <pre>
 * <p></p>
 * </pre>
 *
 * @author <a href="https://github.com/kil1ua">Ken-Chy129</a>
 * @date 2022/11/17 15:20
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BusinessException extends RuntimeException {
    
    private String code;
    
    private String desc;
    
    public BusinessException(ErrorCodeEnums error) {
        this.code = error.getCode();
        this.desc = error.getDesc();
    }

    public BusinessException(String desc) {
        this.code = ErrorCodeEnums.ERROR.getCode();
        this.desc = desc;
    }
}
