package improject.gson;

/**
 * Created by mamok on 8/16/2016.
 */
public class GsonRequest<T> {
    private Class<T> clazz;
    private Long id;
    private String json;

    public GsonRequest(Class<T> clazz, Long id, String json) {
        this.clazz = clazz;
        this.id = id;
        this.json = json;
    }

    public Class<T> getClazz() {
        return clazz;
    }

    public void setClazz(Class<T> clazz) {
        this.clazz = clazz;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getJson() {
        return json;
    }

    public void setJson(String json) {
        this.json = json;
    }
}
