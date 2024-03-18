package cn.ken.mapper;

import cn.ken.domain.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/Ken-Chy129">Ken-Chy129</a>
 * @since 2024/3/18 19:51
 */
@Mapper
public interface UserMapper {
    
    User selectByUsernameAndPassword(String username, String password);
}
