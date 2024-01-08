package com.exceptions;
import org.apache.logging.log4j.*;

public class Logic {
    private static Logger logger = LogManager.getLogger(Logic.class);
    public void publicCall() throws InterruptedException {
        logger.log(Level.INFO,"Public method was called");
        Thread.sleep(3000);
        this.privateCall();
    }

    private void privateCall(){
        logger.log(Level.INFO, "Private method was called");
    }
}
