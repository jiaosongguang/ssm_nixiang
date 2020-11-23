**一.什么是逆向工程**

     MyBatis逆向工程可以方便的从数据库中将表自动映射到JAVA POJO类，并同时生成Mapper.xml和Mapper接口，方便实用。

 ----
 
**二.SSM搭建逆向工程**
#1.在idea新建maven项目，Maven模板下的webapp。
![在这里插入图片描述](https://img-blog.csdnimg.cn/20181129094626529.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM1MTgwOTcz,size_16,color_FFFFFF,t_70)
   
 
 -------
 #2.然后搭建如下项目结构，新建java文件夹和资源文件夹。
![在这里插入图片描述](https://img-blog.csdnimg.cn/20181129094730801.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM1MTgwOTcz,size_16,color_FFFFFF,t_70)
    为了进一步验证项目结构是否正确，可以按下图查看
    ![在这里插入图片描述](https://img-blog.csdnimg.cn/20181129094833134.png)
    ![在这里插入图片描述](https://img-blog.csdnimg.cn/20181129094853792.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM1MTgwOTcz,size_16,color_FFFFFF,t_70)
    如果和上图不同，可以右键新建，点击Mark as取消或者新建。
    
   ------
 #3.新建generatorConfig.xml，逆向工程配置文件。
 源码如下：
 

```
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE generatorConfiguration
        PUBLIC "-//mybatis.org//DTD MyBatis Generator Configuration 1.0//EN"
        "http://mybatis.org/dtd/mybatis-generator-config_1_0.dtd">

<generatorConfiguration>
    <context id="DB2Tables" targetRuntime="MyBatis3">
        <commentGenerator>
            <!-- 是否去除自动生成的注释 true：是 ： false:否 -->
            <property name="suppressAllComments" value="true" />
        </commentGenerator>
        <!--数据库连接的信息：驱动类、连接地址、用户名、密码 -->
        <jdbcConnection driverClass="com.mysql.jdbc.Driver"
                        connectionURL="jdbc:mysql://localhost:3306/db_ssm" userId="root"
                        password="123456">
        </jdbcConnection>
        <!-- 默认false，把JDBC DECIMAL 和 NUMERIC 类型解析为 Integer，为 true时把JDBC DECIMAL 和
            NUMERIC 类型解析为java.math.BigDecimal -->
        <javaTypeResolver>
            <property name="forceBigDecimals" value="false" />
        </javaTypeResolver>

        <!-- targetProject:生成PO类的位置 -->
        <javaModelGenerator targetPackage="com.zhang.pojo"
                            targetProject=".\src\main\java">
            <!-- enableSubPackages:是否让schema作为包的后缀 -->
            <property name="enableSubPackages" value="false" />
            <!-- 从数据库返回的值被清理前后的空格 -->
            <property name="trimStrings" value="true" />
        </javaModelGenerator>
        <!-- targetProject:mapper映射文件生成的位置 -->
        <sqlMapGenerator targetPackage="com.zhang.mapper"
                         targetProject=".\src\main\java">
            <!-- enableSubPackages:是否让schema作为包的后缀 -->
            <property name="enableSubPackages" value="false" />
        </sqlMapGenerator>
        <!-- targetPackage：mapper接口生成的位置 -->
        <javaClientGenerator type="XMLMAPPER"
                             targetPackage="com.zhang.mapper"
                             targetProject=".\src\main\java">
            <!-- enableSubPackages:是否让schema作为包的后缀 -->
            <property name="enableSubPackages" value="false" />
        </javaClientGenerator>
        <!-- 指定数据库表 -->
        <table schema="" tableName="tb_customer"></table>
        <table schema="" tableName="tb_user"></table>

    </context>
</generatorConfiguration>




```
#需要修改的地方：
1.数据库名称，账户和密码  <br>
2. 包生成地址（如果不存在，会自动新建） <br>
3.指定数据库表生成策略 <br>
![在这里插入图片描述](https://img-blog.csdnimg.cn/2018112909540523.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM1MTgwOTcz,size_16,color_FFFFFF,t_70)

----
**三.测试**
#在测试文件夹下新建逆向工程测试类TestMbg，源码如下：

```
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author created by Zhangdazhuang
 * @version v.0.1
 * @Description TODO
 * @date 2018/11/29
 * @备注   逆向工程生产项目
 **/
public class TestMbg {
    public static void main(String[] arge) throws Exception{

        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        File configFile = new File("generatorConfig.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
    }
}

```

![在这里插入图片描述](https://img-blog.csdnimg.cn/20181129095451665.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM1MTgwOTcz,size_16,color_FFFFFF,t_70)

  运行测试类，在src对应位置生产对应的pojo和mapper文件。
![在这里插入图片描述](https://img-blog.csdnimg.cn/20181129095836221.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzM1MTgwOTcz,size_16,color_FFFFFF,t_70)
注：
        1.逆向工程生成后可以根据需求，自己改写或者添加
        
