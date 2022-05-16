package pers.ocean.springframework.test;

import org.junit.Test;
import pers.ocean.springframework.BeanDefinition;
import pers.ocean.springframework.BeanFactory;
import pers.ocean.springframework.test.bean.UserService;

/**
 * @Description
 * @Author ocean_wll
 * @Date 2022/5/16 3:46 下午
 */
public class ApiTest {

    @Test
    public void testBeanDefinition() {
        BeanFactory beanFactory = new BeanFactory();

        beanFactory.registerBean("userService", new BeanDefinition(new UserService()));

        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }
}
