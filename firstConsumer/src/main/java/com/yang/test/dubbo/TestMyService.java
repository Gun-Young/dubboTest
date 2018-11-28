package com.yang.test.dubbo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Administrator on 2018/9/15 0015.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {FirstConsumerApplication.class})
public class TestMyService {

    @Autowired
    private DubboTestService dubboTestService;

    @Autowired
    private TestRedisService testRedisService;

    @Test
    public void getByKey(){
        String key = "name";
        System.out.println("==========:"+testRedisService.getByKey(key));
    }

    @Test
    public void test1(){
        System.out.println("............:"+dubboTestService.test("zhangziyi"));
    }
  /*  @Before
    public void isbefore(){
        System.out.println(".....................before..........");
    }*/

   /* @After
    public void isafter(){
        System.out.println(".....................after..........");
    }*/

    @Test
    public void test2(){
        System.out.println(".....................this is test2..........");
    }
}
