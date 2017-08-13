package com.cicd.com.app;

import com.cicd.com.app.EchoResponse.EchoResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by abine on 8/13/2017.
 */
@RestController
public class EchoCountService {

    private AtomicLong count = new AtomicLong();

    @RequestMapping("/greeting" )
    public EchoResponse echoCount(@RequestParam(value = "input") String input){
        return new EchoResponse(input, count.getAndIncrement());
    }

}
