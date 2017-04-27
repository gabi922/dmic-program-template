package org.dmic.framework.common;

import java.util.Collection;
import org.apache.commons.io.IOUtils;
import java.nio.charset.StandardCharsets;
import java.io.IOException;

public class Utils {
    public static boolean isNullOrEmpty(String string) {
        return string == null || string.isEmpty();
    }

    public static Class<?>[] toArray(Collection<Class<?>> collection) {
        Class<?>[] array = new Class<?>[collection.size()];
        return collection.toArray(array);
    }

    public static <T> T loadParameters(Class<T> tClass, String location) throws IOException {
        ConfigParser<T> configParser = new ConfigParser<>(tClass);
        String parameters = IOUtils.toString(Utils.class.getResourceAsStream(location), StandardCharsets.UTF_8);
        return configParser.parseString(parameters);
    }
}
