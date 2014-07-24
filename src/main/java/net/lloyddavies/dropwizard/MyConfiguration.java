package net.lloyddavies.dropwizard;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import org.hibernate.validator.constraints.NotEmpty;

public class MyConfiguration extends Configuration {
    @NotEmpty
    private String message;

    @JsonProperty
    public String getMessage() {
        return message;
    }
}
