package improject.gson;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import improject.dl.entities.User;

import java.lang.reflect.Type;

/**
 * Created by mamok on 8/16/2016.
 */
public class UserDeserializer implements JsonDeserializer<User> {

    public User deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        return null;
    }
}
