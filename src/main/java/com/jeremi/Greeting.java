package com.jeremi;

import org.apache.log4j.Logger;
import org.apache.log4j.MDC;

public class Greeting {
    private static Logger log =  Logger.getLogger(Greeting.class.getName());
    private final long id;
    private final String content;


    public Greeting(long id, String content, String sid) {
        MDC.put("sid",sid);
        log.info("New Greeting: " + content);
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
