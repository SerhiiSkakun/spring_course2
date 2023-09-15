package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Pet myDog = context.getBean("myPet", Dog.class);
        Pet yourDog = context.getBean("myPet", Dog.class);
        myDog.say();

        context.close();
    }
}
