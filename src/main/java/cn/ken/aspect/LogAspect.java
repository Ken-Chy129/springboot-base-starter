package cn.ken.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/Ken-Chy129">Ken-Chy129</a>
 * @since 2024/3/18 23:24
 */
@Slf4j
@Aspect
@Component
public class LogAspect {

    @Pointcut("execution(* cn.ken.controller.*.*(..))")
    public void cut() {}

    @Around(value = "cut()")
    public Object logAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object result;
        try{
            result = proceedingJoinPoint.proceed();
            log.info("请求方法：{}，请求参数：{}，请求结果：{}", proceedingJoinPoint.getSignature().getName(), Arrays.toString(proceedingJoinPoint.getArgs()), result);
        } catch (Throwable e) {
            log.error(e.getMessage());
            throw e;
        }
        return result;
    }
}
