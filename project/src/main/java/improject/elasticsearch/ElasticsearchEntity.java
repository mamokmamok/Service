package improject.elasticsearch;

import improject.dl.Type;
import improject.dl.entities.BaseEntity;

/**
 * Created by mamok on 8/17/2016.
 */
public class ElasticsearchEntity extends BaseEntity {
    private String json;

    public ElasticsearchEntity(BaseEntity baseEntity, String json) {
        super(baseEntity.getId(), baseEntity.getType());
        this.json = json;
    }

    public ElasticsearchEntity(BaseEntity baseEntity) {
        super(baseEntity.getId(), baseEntity.getType());
    }

    public ElasticsearchEntity(Long id, Type type, String json) {
        super(id, type);
        this.json = json;
    }

    public String getJson() {
        return json;
    }
}
