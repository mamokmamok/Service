package dl.entities.shortcut;

import dl.DataLayer;
import dl.DataLayerManager;
import dl.Type;
import dl.entities.BaseEntity;

import java.net.UnknownHostException;

/**
 * Created by mamok on 8/17/2016.
 */
public class IntelijShortcut extends BaseEntity{
    private String shortcutKeys;
    private String description;
    private Category category;

    public static void main(String[] args) throws UnknownHostException {
        DataLayer dl = new DataLayerManager();
        dl.add(new IntelijShortcut(1l,
                Type.INTELIJSHORTCUT,
                "CTRL + SPACE", "Basic code completion (the name of any class,\n" +
                "method or variable)",
                Category.Editing));

    }

    public IntelijShortcut(Long id, Type type, String shortcutKeys, String description, Category category) {
        super(id, type);
        this.shortcutKeys = shortcutKeys;
        this.description = description;
        this.category = category;
    }

    public IntelijShortcut(BaseEntity entity, String shortcutKeys, String description, Category category) {
        super(entity);
        this.shortcutKeys = shortcutKeys;
        this.description = description;
        this.category = category;
    }
}
