package org.example;

import org.hmcore.modules.Module;

public class ExampleModule extends Module {
    @Override
    public String getName() {
        return "examplemodule";
    }

    private static final String PREFIX = "[Example Module] ";

    @Override
    protected boolean initialize() {

        System.out.print(PREFIX + "Loading darker netzz...");
        System.out.println(Math.random());

        return true;
    }

    @Override
    protected boolean hook() {
        System.out.print(PREFIX + "Loading much darker netzz...");
        System.out.println(Math.floor(Math.random()));
        return true;
    }

    @Override
    protected boolean disable() {
        System.out.print(PREFIX + "Unloading much darker netzz...");
        System.out.println(Math.abs(Math.random()));
        return true;
    }

    @Override
    protected boolean unload() {
        System.out.print(PREFIX + "Unloading darker netzz...");
        System.out.println(Math.cos(Math.random()));
        return true;
    }
}
