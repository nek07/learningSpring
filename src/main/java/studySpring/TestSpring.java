package studySpring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        TestBean testbean = context.getBean("id",TestBean.class);
        System.out.println("testbean = " + testbean.getName());
        context.close();
    }
}
