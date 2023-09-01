import org.example.entity.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

import javax.sound.midi.Soundbank;

public class DemoTest {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student bean = context.getBean("student", Student.class);
        Student bean2 = context.getBean("student", Student.class);
        System.out.println(bean == bean2);
//        bean.setName("第一个名字");
//        System.out.println(bean2.getName());

    }
}
