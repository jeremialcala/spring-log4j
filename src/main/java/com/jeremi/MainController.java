package com.jeremi;

import org.apache.log4j.Logger;
import org.apache.log4j.MDC;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.concurrent.atomic.AtomicLong;
import com.jeremi.utils.tools;
import static org.springframework.web.bind.annotation.RequestMethod.GET;


@RestController
public class MainController {
    private static Logger log =  Logger.getLogger(MainController.class.getName());
    private static final String template = "Hello, %s!";
    private final AtomicLong couter = new AtomicLong();

    @RequestMapping(name ="/greeting", method=GET)
    public Greeting hello(@RequestParam(value = "name", defaultValue = "World") String name){
        String sid = tools.getSessionId();
        MDC.put("sid", sid);
        log.info("hello");
        return new Greeting(couter.incrementAndGet(), String.format(template, name), sid);
    }
}
