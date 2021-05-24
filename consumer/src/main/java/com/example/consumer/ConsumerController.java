package com.example.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author YSAR
 * @since 2021/05/24 13:49:47
 **/
@RestController
public class ConsumerController {

    @Autowired
    private ProviderClient providerClient;

    @GetMapping("/hi-feign")
    public String hiFeign() {
        return providerClient.hi("feign");
    }
}
