package org.maslov;

import org.maslov.beans.ICalculator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ICalculator calculator = (ICalculator) context.getBean("calculator");
    }
}