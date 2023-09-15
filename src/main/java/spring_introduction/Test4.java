package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Pet myDog = context.getBean("myPet", Pet.class);
        Pet yourDog = context.getBean("myPet", Pet.class);

        System.out.println(myDog);
        System.out.println(yourDog);
        System.out.println(myDog == yourDog);

        context.close();
    }
}
