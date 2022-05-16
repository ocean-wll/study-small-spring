package pers.ocean.springframework;

/**
 * @Description
 * @Author ocean_wll
 * @Date 2022/5/16 3:36 下午
 */
public class BeanDefinition {

    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }
}
