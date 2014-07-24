package net.lloyddavies.dropwizard;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import net.lloyddavies.dropwizard.resources.MessageResource;

public class MyApplication extends Application<MyConfiguration> {
    public static void main(String[] args) throws Exception {
        new MyApplication().run(args);
    }

    @Override
    public String getName() {
        return "dropwizard-config-test";
    }

    @Override
    public void initialize(Bootstrap<MyConfiguration> bootstrap) {
        // nothing to do yet
    }

    @Override
    public void run(MyConfiguration configuration, Environment environment) {
        environment.jersey().register(new MessageResource(configuration.getMessage()));
    }
}