package com.test.zhuxinkai;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

/**
 * <h3>parenttest</h3>
 * <p>MyapplciationRunner2</p>
 *
 * @author : zhuxinkai
 * @date : 2019-12-12 14:07
 **/

@Component
@Order(2)

public class MyApplicationRunner2 implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        List<String> nonOptionArgs = args.getNonOptionArgs();
        System.out.println("2-nonOptionArgs>>>" + nonOptionArgs);
        Set<String> optionNames = args.getOptionNames();
        for(String optionName : optionNames){
            System.out.println("2-key:" + optionName + ";value:" + args.getOptionValues(optionName));
        }

    }
}


