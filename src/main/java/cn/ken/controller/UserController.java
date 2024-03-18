package cn.ken.controller;

import cn.ken.common.core.domain.Result;
import cn.ken.domain.vo.UserVO;
import cn.ken.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/Ken-Chy129">Ken-Chy129</a>
 * @since 2024/3/18 19:45
 */
@RestController
@RequestMapping("/user")
public class UserController {
    
    @Resource
    private UserService userService;
    
    @GetMapping("/login")
    public Result<UserVO> login(String username, String password) {
        return userService.login(username, password);
    }
}
