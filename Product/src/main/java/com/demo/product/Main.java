package com.demo.product;

import org.apache.log4j.Logger;

public class Main{
    private static final Logger logger = Logger.getLogger(Main.class);
    public static void main(String[] args) throws Exception {
        // just log a message
        logger.info("Info Log.");
        logger.warn("Warn Log");
        logger.error("Error Log.");
        System.exit(0);
    }
}
