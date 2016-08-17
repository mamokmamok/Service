package dl;

import dl.entities.Motorcycle;
import dl.entities.User;
import dl.entities.shortcut.IntelijShortcut;

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