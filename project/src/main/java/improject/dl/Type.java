package improject.dl;

import improject.dl.entities.Motorcycle;
import improject.dl.entities.User;
import improject.dl.entities.shortcut.IntelijShortcut;

/**
 * Created by mamok on 8/17/2016.
 */
public enum Type {

    USER(User.class),
    MOTORCYCLE(Motorcycle.class),
    INTELIJSHORTCUT(IntelijShortcut.class);

    private final Class<?> type;

    Type(Class<?> type) {
        this.type = type;
    }

    public Class<?> getType(){
        return this.type;
    }

    public String getTypeName() {
        return type.getSimpleName().toLowerCase();
    }
}