package com.lemon.config;

import com.lemon.bean.Color;
import com.lemon.bean.Person;
import com.lemon.bean.Red;
import com.lemon.condition.LinuxCondition;
import com.lemon.condition.MyImportSelector;
import com.lemon.condition.WindowsCondition;
import org.springframework.context.annotation.*;

import static org.springframework.beans.factory.config.BeanDefinition.SCOPE_PROTOTYPE;

/**
 * Created by lemoon on 2023/8/22 08:14
 */
//配置类==配置文件
@Configuration  //告诉Spring这是一个配置类
@Import({Color.class, Red.class, MyImportSelector.class})
//导入组件，id默认是组件的全类名 com.lemon.bean.Color
public class MainConfig2 {

    //默认是单例的

    /**
     * SCOPE_PROTOTYPE :多实例的,ioc容器启动并不会去调用方法创建对象放在容器中
     * 每次获取的时候才会调用方法创建对象
     * SCOPE_SINGLETON :单实例的(默认值),ioc容器启动会调用方法创建对象放到ioc容器中。
     * 以后每次获取就是直接从容器(map.get())中获取
     * SCOPE_REQUEST :同一次请求创建一个实例
     * SCOPE_SESSION :同一个session创建一个实例
     *
     * 懒加载：
     *      单例bean：默认在容器启动的时候创建对象
     *      懒加载：容器启动不创建对象，第一次使用(获取)bean创建对象，并初始化
     *
     * @return
     */
//    @Scope(value = SCOPE_PROTOTYPE)
    @Lazy
    @Bean("person")
    public Person person() {
        System.out.println("person 初始化");
        return new Person("lisi", 18);
    }


    /**
     * @Conditional,按照一定的条件进行判断，满足条件给容器中注入bean
     * 如果系统是windows，给容器中注册bill
     * 如果系统是linux，给容器中注册linus
     *
     * @return
     */

    @Conditional({WindowsCondition.class})
    @Bean("bill")
    public Person person01(){
        return new Person("Bill",60);
    }

    @Conditional({LinuxCondition.class})
    @Bean("linus")
    public Person person02(){
        return new Person("linus",50);
    }

    /**
     * 给容器中注册组件：
     * 1）包扫描+组件标注注解(@Controller/@Service/@Repository/@Component) 自己写的类
     * 2）@Bean[导入的第三方包里面的组件]
     * 3) @Import[快速给容器中导入一个组件]
     *      1.@Import(要导入到容器中的组件)：容器中就会自动注册这个组件，id就是全类名
     *      2.ImportSelector:返回需要导入的组件的全类名数组；
     */
}
