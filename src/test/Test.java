import com.lglc.invest.service.test.TestService;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created on 2017/6/8.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:/spring-mvc.xml"})
public class Test {


    @Resource
    private TestService testService;

    @org.junit.Test
    public void test(){
        System.out.println(testService.getTest());
    }

}
