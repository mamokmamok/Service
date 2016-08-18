package improject.dl.entities;

import improject.dl.Type;

/**
 * Created by mamok on 8/17/2016.
 */
public abstract class BaseEntity {
    private Long id;
    private Type type;

    public BaseEntity(Long id, Type type) {
        this.id = id;
        this.type = type;
    }

    public BaseEntity(BaseEntity entity) {
         this(entity.getId(), entity.getType());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
