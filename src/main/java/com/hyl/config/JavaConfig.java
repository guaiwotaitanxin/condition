package com.hyl.config;

import com.hyl.Food;
import com.hyl.condition.NoodlesCondition;
import com.hyl.condition.RiceCondition;

import com.hyl.impl.Noodles;
import com.hyl.impl.Rice;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author 韩宇龙
 * @create 2020-03-26 8:49
 */
@Configuration  //ApplicationContext.xml
public class JavaConfig {
    @Bean("food")
    @Conditional(RiceCondition.class)
    Food rice(){
        return new Rice();
    }

    @Bean("food")
    @Conditional(NoodlesCondition.class)
    Food noodles(){
        return new Noodles();
    }

}
