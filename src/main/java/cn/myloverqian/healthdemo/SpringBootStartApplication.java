package cn.myloverqian.healthdemo;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * cn.myloverqian.healthdemo
 *
 * @author zhiwei
 * @create 2017-12-02 21:25.
 * @github {@https://github.com/loveqianqian}
 */
public class SpringBootStartApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        // 注意这里要指向原先用main方法执行的Application启动类
        return builder.sources(HealthdemoApplication.class);
    }
}