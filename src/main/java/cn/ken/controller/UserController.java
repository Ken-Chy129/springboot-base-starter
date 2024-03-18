package cn.ken.controller;

import cn.ken.common.core.domain.Result;
import cn.ken.domain.vo.UserVO;
import cn.ken.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
@Tag(name = "用户模块")
public class UserController {
    
    @Resource
    private UserService userService;
    
    @PostMapping("/login")
    @Operation(summary = "登录请求")
    public Result<UserVO> login(String username, String password) {
        return userService.login(username, password);
    }
}
