# springboot-web-jsp

使用idea打开，主要内容为使用springboot建jsp文件

若自己从头创建步骤为：
1、在使用Spring Initializr创建项目时，选择打包方式为war(检查是否自动创建了ServletInitializer类，并调用configure方法)
2、在main文件夹下生成webapp文件，并指定为web 资源目录（web resource directory）
创建src\main\webapp\WEB-INF\，并声称web.xml文件
3、配置tomcat server，并在deployment选择项目（使用war exploded）
4、在webapp目录下新建jsp页面，在resource.preperities中配置前缀和后缀
5、创建controller包,编写controller类和方法
