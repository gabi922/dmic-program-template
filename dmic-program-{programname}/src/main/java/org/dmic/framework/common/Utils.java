package org.dmic.framework.common;

import java.util.Collection;

public class Utils {
    public static boolean isNullOrEmpty(String string) {
        return string == null || string.isEmpty();
    }

    public static Class<?>[] toArray(Collection<Class<?>> collection) {
        Class<?>[] array = new Class<?>[collection.size()];
        return collection.toArray(array);
    }
}
