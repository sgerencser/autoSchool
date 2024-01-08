package com.exceptions;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogicWithException {
    private static Logger logger = LogManager.getLogger(Logic.class);

    public void publicCall() {
        try{ logger.log(Level.INFO,"Public method was called");
            int zero = 5/0;
            this.privateCall();}
        catch (ArithmeticException e) {
            System.out.println("You shall not fall");;
        }
    }

    private void privateCall(){
        logger.log(Level.INFO, "Private method was called");
    }

}
