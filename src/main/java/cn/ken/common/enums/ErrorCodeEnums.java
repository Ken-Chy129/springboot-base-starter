package cn.ken.common.enums;

import lombok.Getter;
import lombok.ToString;

/**
 * <pre>
 * <p></p>
 * </pre>
 *
 * @author <a href="https://github.com/kil1ua">Ken-Chy129</a>
 * @date 2022/11/16 18:07
 */
@Getter
@ToString
public enum ErrorCodeEnums {

    SUCCESS("200", "success"),
    ERROR("500", "error"),
    
    SYS_UN_LOGIN("10001", "登录凭证已过期"),
    SYS_NO_PERMISSION("10002", "管理员权限不足"),
    
    ;

    private final String code;
    private final String desc;

    ErrorCodeEnums(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
