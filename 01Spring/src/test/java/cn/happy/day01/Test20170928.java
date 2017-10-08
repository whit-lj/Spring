package cn.happy.day01;

import cn.happy.day02.printer.Print;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/9/28.
 */
public class Test20170928 {
    @Test
    //打印机
    public void test02(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Print pp = (Print) context.getBean("printer");
        pp.print();
    }

    @Test
    public void test01(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        HappyService service =(HappyService) context.getBean("service");
        System.out.println(service);
    }


}
