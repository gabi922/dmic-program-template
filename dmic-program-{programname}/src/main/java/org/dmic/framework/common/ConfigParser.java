package org.dmic.framework.common;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

public class ConfigParser<T> {
    private Class<T> configClass;

    public ConfigParser(Class<T> configClass) {
        this.configClass = configClass;
    }

    public T parseString(String operatorConfig) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(operatorConfig, configClass);
    }
}