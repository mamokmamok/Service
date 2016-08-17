package dl;

import dl.entities.BaseEntity;
import elasticsearch.ElasticsearchEntity;
import elasticsearch.ElasticsearchManager;
import gson.GsonManger;

import java.net.UnknownHostException;

/**
 * Created by mamok on 8/17/2016.
 */
public class DataLayerManager implements DataLayer {
    ElasticsearchManager esManager;
    GsonManger gsonManger;

    public DataLayerManager() throws UnknownHostException {
        this.esManager = new ElasticsearchManager();
        this.gsonManger = new GsonManger();
    }


    public void add(BaseEntity baseEntity) {
        String jsonEntity = GsonManger.convertToJson(baseEntity);
        ElasticsearchEntity entity = new ElasticsearchEntity(baseEntity, jsonEntity);
        esManager.add(entity);
    }

    public void delete(BaseEntity baseEntity) {
        esManager.delete(new ElasticsearchEntity(baseEntity));

    }

    public void update(BaseEntity baseEntity) {

    }

    public BaseEntity get(Long id, String type) {
        return null;
    }
}
