package com.lglc.invest.controller.test;

import com.lglc.invest.service.test.TestService;
import org.apache.ibatis.io.ResolverUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created on 2017/6/8.
 */
@Controller
@RequestMapping("/test")
public class TestController {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestController.class);

    @Resource
    private TestService testService;

    @RequestMapping("getTest")
    public String test(Model model, String name){

        LOGGER.info("test controller");

        String data = testService.getTest();
        model.addAttribute("data",data);
        if(!StringUtils.isEmpty(name)){
            try {
                name = new String(name.getBytes("iso8859-1"),"utf-8");
                model.addAttribute("name",name);
            }catch (Exception e){
                LOGGER.error("{}",e);
            }
        }

        return "test/welcome";
    }

}
