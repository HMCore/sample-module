package org.example;

import org.hmcore.modules.Module;

import static org.hmcore.HMCore.logger;

public class ExampleModule extends Module {
    @Override
    public String getName() {
        return "examplemodule";
    }

    private static final String PREFIX = "[Example Module] ";

    @Override
    protected boolean initialize() {

        logger.info(PREFIX + "Loading darker netzz...");
        logger.info(Math.random());

        return true;
    }

    @Override
    protected boolean hook() {
        logger.info(PREFIX + "Loading much darker netzz...");
        logger.info(Math.floor(Math.random()));
        return true;
    }

    @Override
    protected boolean disable() {
        logger.info(PREFIX + "Unloading much darker netzz...");
        logger.info(Math.abs(Math.random()));
        return true;
    }

    @Override
    protected boolean unload() {
        logger.info(PREFIX + "Unloading darker netzz...");
        logger.info(Math.cos(Math.random()));
        return true;
    }
}
