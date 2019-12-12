package com.test.zhuxinkai;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

/**
 * <h3>parenttest</h3>
 * <p>ApplicationRunner测试</p>
 *
 * @author : zhuxinkai
 * @date : 2019-12-12 14:01
 **/
@Component
@Order(1)

public class MyApplicationRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        List<String> nonOptionArgs = args.getNonOptionArgs();
        System.out.println("1-nonOptionArgs>>>" + nonOptionArgs);
        Set<String> optionNames = args.getOptionNames();
        for(String optionName : optionNames){
            System.out.println("1-key:" + optionName + ";value:" + args.getOptionValues(optionName));
        }

    }
}


