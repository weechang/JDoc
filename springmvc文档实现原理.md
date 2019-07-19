#Spring Mvc 文档实现原理

## 1.获取所有Controller类

根据配置的基础包，使用reflections扫描指定路径下面的所有带有@Controller 和 @RestController的类。