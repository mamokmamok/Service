package improject.dl;

import improject.dl.entities.BaseEntity;

/**
 * Created by mamok on 8/17/2016.
 */
public interface DataLayer {
    BaseEntity get(Long id, String type);
    void add(BaseEntity baseEntity);
    void delete(BaseEntity baseEntity);
    void update(BaseEntity baseEntity);
}
