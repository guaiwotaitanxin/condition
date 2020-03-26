package com.hyl;

import com.hyl.config.JavaConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

/**
 * @author 韩宇龙
 * @create 2020-03-26 9:03
 */
public class FoodTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入南方人或北方人：");
        String next = scanner.next();

        context.getEnvironment().getSystemProperties().put("people",next);
        context.register(JavaConfig.class);
        context.refresh();
       Food food = (Food) context.getBean("food");
        System.out.println(food.showName());
    }
}
