package cn.ken.service;

import cn.ken.common.core.domain.Result;
import cn.ken.domain.vo.UserVO;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/Ken-Chy129">Ken-Chy129</a>
 * @since 2024/3/18 19:46
 */
public interface UserService {
    
    Result<UserVO> login(String username, String password);
}
