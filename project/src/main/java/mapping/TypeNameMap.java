package mapping;

import dl.entities.Motorcycle;
import dl.entities.User;

import java.util.HashMap;

/**
 * Created by mamok on 8/16/2016.
 */
public class TypeNameMap {
    private static HashMap<String, Class> classHashMap = new HashMap<String, Class>();

    static {
        classHashMap.put("user", User.class);
        classHashMap.put("motorcyle", Motorcycle.class);
    }

    public static Class getClass(String className){
        return classHashMap.get(className);
    }
}
