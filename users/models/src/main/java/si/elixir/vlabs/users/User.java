package si.elixir.vlabs.users;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String first_name;
    private String last_name;
    private List<Integer> cids;

    public User(int id, String first_name, String last_name, List<Integer> cids) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.cids = cids;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public List<Integer> getCids() {
        return cids;
    }

    public void setCids(List<Integer> cids) {
        this.cids = cids;
    }
}
