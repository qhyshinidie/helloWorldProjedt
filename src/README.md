# Spring Security 登录演示

这是一个使用Spring Boot 3.2.0和Spring Security构建的简单登录演示项目。

## 功能特点

- 美观的登录页面，带有光标效果
- 用户名密码认证
- 登录失败时显示错误信息，带有光标效果
- 登录成功后显示"Hello World"，带有打字机光标效果

## 技术栈

- Spring Boot 3.2.0
- Spring Security
- Thymeleaf
- Bootstrap 5
- HTML/CSS/JavaScript

## 如何运行

### 前提条件

- Java 17或更高版本
- Maven 3.6或更高版本

### 步骤

1. 克隆仓库
   ```
   git clone https://github.com/你的用户名/spring-security-demo.git
   cd spring-security-demo
   ```

2. 构建项目
   ```
   mvn clean install
   ```

3. 运行项目
   ```
   mvn spring-boot:run
   ```

4. 访问应用
   - 登录页面：`http://localhost:8080/login`
   - 用户名：`admin`
   - 密码：`123456`

## 项目结构

```
src/
├── pom.xml
├── main/
    ├── java/
    │   └── com/
    │       └── example/
    │           └── demo/
    │               ├── DemoApplication.java
    │               ├── config/
    │               │   └── SecurityConfig.java
    │               └── controller/
    │                   ├── HelloController.java
    │                   └── LoginController.java
    └── resources/
        ├── application.properties
        └── templates/
            └── login.html
```

## 许可证

MIT 