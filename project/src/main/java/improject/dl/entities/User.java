package improject.dl.entities;

import com.google.gson.annotations.SerializedName;
import improject.dl.Type;

/**
 * Created by mamok on 8/16/2016.
 */
public class User extends BaseEntity {
    @SerializedName("FirstName")
    private String firstName;
    @SerializedName("LastName")
    private String lastName;
    @SerializedName("Password")
    private String password;

    public User(long id, String firstName, String lastName, String password) {
        super(id, Type.USER);
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
