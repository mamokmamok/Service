package gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by mamok on 8/16/2016.
 */
public class GsonManger {
    static Gson gson;

    public static Gson getInstance() {
        if (gson == null) init();
        return gson; }

    private static void init() {

        GsonBuilder gsonBuilder = new GsonBuilder();

        // Type Adapters
        gson = new GsonBuilder().create();
    }

    public static <T> T convertToObject(GsonRequest envelope){
        return (T) getInstance().fromJson(envelope.getJson(), envelope.getClazz());
    }

    public static String convertToJson(Object o){
        return getInstance().toJson(o);
    }
}
