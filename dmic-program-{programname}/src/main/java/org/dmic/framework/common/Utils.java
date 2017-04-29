package org.dmic.framework.common;

import java.util.Collection;
import org.apache.commons.io.IOUtils;
import java.nio.charset.StandardCharsets;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

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

    public static List<Class<?>> getTupleParameterTypes(List<String> tupleParametersNames) throws ClassNotFoundException {
        List<Class<?>> tupleParametersTypes = new ArrayList<>();
        for (String fieldType: tupleParametersNames) {
            tupleParametersTypes.add(Class.forName(fieldType));
        }
        return tupleParametersTypes;
    }
}
