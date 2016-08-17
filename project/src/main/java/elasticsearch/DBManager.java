package elasticsearch;

import dl.Type;

import java.util.ArrayList;

/**
 * Created by mamok on 8/14/2016.
 */
public interface DBManager {

    // Get methods
    ElasticsearchEntity getById(Type type, Long id);
    ArrayList<ElasticsearchEntity> getAll(Type type);
    void add(ElasticsearchEntity envelope);
}
