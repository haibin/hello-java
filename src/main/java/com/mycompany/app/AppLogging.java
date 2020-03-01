package com.mycompany.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class AppLogging
{
    private Logger logger = LoggerFactory.getLogger(AppLogging.class);

    public void foo() {
        logger.info("in foo()");
        System.out.println("hello world logging");
    }

    public static void main( String[] args )
    {
        AppLogging appLogging = new AppLogging();
        appLogging.foo();
    }
}
