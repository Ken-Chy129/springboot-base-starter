package cn.ken.service.impl;

import cn.ken.common.core.domain.Result;
import cn.ken.domain.entity.User;
import cn.ken.domain.vo.UserVO;
import cn.ken.mapper.UserMapper;
import cn.ken.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/Ken-Chy129">Ken-Chy129</a>
 * @since 2024/3/18 19:46
 */
@Service
public class UserServiceImpl implements UserService {
    
    @Resource
    private UserMapper userMapper;
    
    @Override
    public Result<UserVO> login(String username, String password) {
        User user = userMapper.selectByUsernameAndPassword(username, password);
        if (Objects.isNull(user)) {
            return Result.error();
        }
        UserVO userVO = new UserVO();
        userVO.setUsername(username);
        userVO.setPassword(password);
        return Result.success(userVO);
    }
}
