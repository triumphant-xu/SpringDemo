import com.lsu.controller.CatController;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCat {


    @Test
    public void test(){

        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        Cat cat=(Cat)context.getBean("cat");
        cat.sing();
    }
    @Test
    public  void test2(){
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        CatController catController=(CatController) context.getBean("catController");
        catController.showCat();

    }
}
