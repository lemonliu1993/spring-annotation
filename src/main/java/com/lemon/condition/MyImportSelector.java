package com.lemon.condition;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * Created by lemoon on 2023/8/25 22:14
 * 自定义逻辑返回需要导入的组件
 */
public class MyImportSelector implements ImportSelector {


    //返回值，就是要导入到容器中的组件全类名

    /**
     * @param importingClassMetadata:当前标注@Import注解的类的所有注解信息
     * @return
     */
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        //方法不要返回null值
        return new String[]{"com.lemon.bean.Blue","com.lemon.bean.Yellow"};
//        return new String[]{"com.lemon.bean.Blue","com.lemon.Yellow"};
        //类名要写对，不然会报class path resource [com/lemon/Yellow.class] cannot be opened because it does not exist
    }
}
