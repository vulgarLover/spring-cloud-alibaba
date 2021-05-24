package com.example.provider;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author YSAR
 * @since 2021/05/24 13:57:20
 **/
@RestController
public class ProviderController {

    @Value("${server.port}")
    String port;

    @GetMapping("/hi")
    public String hi(@RequestParam(value = "name", defaultValue = "forezp", required = false) String name) {
        return "hello " + name + ", i'm provider ,my port:" + port;
    }
}
