package com.exceptions;
import org.apache.logging.log4j.*;

public class Logic {
    private static Logger logger = LogManager.getLogger(Logic.class);
    public void publicCall(){
        logger.log(Level.INFO,"Public method was called");
        this.privateCall();
    }

    private void privateCall(){
        logger.log(Level.INFO, "Private method was called");
    }
}
