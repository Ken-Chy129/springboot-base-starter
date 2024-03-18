package cn.ken.common.core.domain;

import lombok.Data;

import java.util.Objects;

/**
 * <pre>
 * <p></p>
 * </pre>
 *
 * @author <a href="https://github.com/kil1ua">Ken-Chy129</a>
 * @date 2022/11/16 18:08
 */
@Data
public class Page {

    private Integer pageNo;

    private Integer pageSize;

    public Integer getPageNo() {
        if(Objects.isNull(pageNo)){
            pageNo = 1;
        }
        return pageNo;
    }

    public Integer getPageSize() {
        if(Objects.isNull(pageSize)){
            pageSize = 20;
        }
        return pageSize;
    }
    
}
