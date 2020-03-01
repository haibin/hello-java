package com.mycompany.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    private Logger logger = LoggerFactory.getLogger(App.class);

    public void foo() {
        logger.info("in foo()");
    }

    public static void main( String[] args )
    {
        App app = new App();
        app.foo();
    }
}
