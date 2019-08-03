# MultiModuleTest
Test the global variable sharing in springboot multi module project

主要就是想在一个多模块的springboot项目中，共享变量
多模块项目的搭建参考：https://segmentfault.com/a/1190000011367492
读取配置文件的代码参考：https://blog.csdn.net/Ho528528/article/details/88887926
遇到了一些问题：
比如@Autowired不能对静态变量进行注入，以及有的类提示扫描不到，就得@ComponentScan(basePackages = {"com.example.myservice"})这样操作一下
光是pom文件中添加对那个模块的依赖还不够，还得扫描它的包路经
