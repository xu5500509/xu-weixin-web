package testService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import cn.xu.weixin.service.FirstService;

import java.util.List;

/**
 * Created by USER-20160603SD$ on 2016/11/10.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-service.xml"})
public class TestFirstService {

    @Autowired
    FirstService firstService;

    /**
     * @Author: xuyangjian
     * @Date: 2016/11/10 15:24
     */
    @Test
    public void testGetBaseInfoList() {
        String str = firstService.getMeg();
        System.out.print(str);
    }

}
