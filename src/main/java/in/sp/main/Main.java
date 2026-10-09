package in.sp.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import in.sp.beans.*; 
public class Main {
 public static void main(String[] args) {
	 ApplicationContext Context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
	 Student std=(Student) Context.getBean("student");
	 std.display();
 }
}
