package cn.happy.day01;

import cn.happy.day02.printer.Print;
import cn.happy.day03.service.ISomeService;
import cn.happy.day04.MyCollection;
import cn.happy.day04.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/9/28.
 */
public class Test20171007 {

    @Test
    public void test03(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext04DI.xml");
        MyCollection stu = (MyCollection) context.getBean("mycollection");
        System.out.println(stu);
    }
    @Test
    public void test02(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext04DI.xml");
        Student stu = (Student) context.getBean("stu");
        System.out.println(stu);
    }
    @Test
    public void test01(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContextaop.xml");
        ISomeService service = (ISomeService) context.getBean("someService");
       service.doSome();
    }


}
