package com.example.jenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author zhangdh
 * @version 1.0
 * @date 2020/11/9 10:56
 */

@RestController
public class  myConntroller {

    @GetMapping("/get")
    public String get(){
        return "test1";
    }
}
