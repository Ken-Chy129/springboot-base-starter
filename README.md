# SpringBoot Base Starter

Spring Boot 项目脚手架，封装了常用的基础设施组件，开箱即用，适合作为新项目的起始模板。

## 内置功能

- **统一响应封装**：`Result` 统一返回格式，`Page` 分页封装
- **全局异常处理**：`BusinessException` 业务异常 + 错误码枚举
- **Redis 缓存**：Gson 序列化器 + `Cache` 缓存工具类
- **日志切面**：`LogAspect` 自动记录接口请求日志
- **API 文档**：集成 Knife4j（OpenAPI 3）
- **工具集成**：Hutool、Gson

## 技术栈

- Java 17
- Spring Boot 3.2
- MyBatis
- MySQL
- Redis
- Knife4j（Swagger）
- Hutool
- Lombok

## 项目结构

```
src/main/java/cn/ken/
├── common/
│   ├── cache/            # Redis 缓存工具
│   ├── core/domain/      # Result 统一响应、Page 分页
│   ├── enums/            # 错误码枚举
│   ├── exception/        # 业务异常
│   └── utils/            # JSON 工具类
├── aspect/               # 日志切面
├── config/               # Redis 配置
├── controller/           # 示例 Controller
├── service/              # 示例 Service
├── mapper/               # 示例 Mapper
└── domain/               # 实体类与 VO
```

## 快速开始

1. 克隆项目并导入 IDE
2. 修改 `application.yml` 配置数据库和 Redis 连接信息
3. 启动 `SpringbootBaseStarterApplication`
4. 访问 Knife4j 文档：`http://localhost:8080/doc.html`
