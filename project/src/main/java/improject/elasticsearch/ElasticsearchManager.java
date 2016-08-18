package improject.elasticsearch;

import improject.dl.DataLayer;
import improject.dl.DataLayerManager;
import improject.dl.Type;
import improject.dl.entities.Motorcycle;
import improject.dl.entities.MotorcycleType;
import org.elasticsearch.action.delete.DeleteResponse;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;

/**
 * Created by mamok on 8/14/2016.
 */
public class ElasticsearchManager implements DBManager {

    final private String SERVER_URL = "localhost";
    final private String INDEX_NAME = "project";
    final private int PORT = 9300;
    private Client client;

    public static void main(String[] args) throws UnknownHostException {
        DataLayer dl = new DataLayerManager();
//        improject.dl.add(new User(2, "Moshik", "Cohen", "12345"));
//        improject.dl.delete(new User(1, "", "" ,""));
//        improject.dl.delete(new User(2, "", "" ,""));

        Motorcycle motorcycle = new Motorcycle(1l, Type.MOTORCYCLE, "21-802-79", MotorcycleType.STANDARD, 125.4d, 125d);
//        improject.dl.add(motorcycle);
        dl.delete(motorcycle);

    }

    public ElasticsearchManager() throws UnknownHostException {
        init();
    }

    private void init() throws UnknownHostException {
        Settings settings = Settings.settingsBuilder()
                .put("cluster.name", "my-application").build();
        client = TransportClient.builder().settings(settings).build()
                        .addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName(SERVER_URL), PORT));
    }

    public ElasticsearchEntity getById(Type type, Long id) {
        GetResponse response = client.prepareGet(INDEX_NAME, type.getTypeName(), id.toString()).get();
        return new ElasticsearchEntity(id, type, response.getSourceAsString());
    }

    public ArrayList<ElasticsearchEntity> getAll(Type type) {
        return null;
    }

    public void add(ElasticsearchEntity entity) {
        // TODO : need to add write and check add (user b)
        // TODO : need to add another type (check modularity)
        IndexResponse response = client.prepareIndex(INDEX_NAME, entity.getType().getTypeName(), entity.getId().toString())
                .setSource(entity.getJson())
                .get();

    }

    public void delete(ElasticsearchEntity entity){
        DeleteResponse response = client.prepareDelete(INDEX_NAME, entity.getType().getTypeName(), entity.getId().toString())
                .get();
    }
}
