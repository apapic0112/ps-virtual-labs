package si.elixir.vlabs.docker;

import javax.persistence.*;

@Entity
@NamedQuery(name = "Container.findAll", query = "SELECT c FROM Container c")
public class Container {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String container_id;
    private String name;

    @Temporal(TemporalType.TIMESTAMP)
    private long created;
    private String image_name;
    private String status;

    public Container() {
        /*setCid(container.getId());
        setName(container.getNames());
        setCreated(container.getCreated());
        setImage(container.getImage());
        setStatus(container.getStatus());*/
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void setName(String[] names) {
        if (name.length() == 0)
            this.name = "unknown";
        else this.name = names[0].substring(1);
    }

    public long getCreated() {
        return created;
    }

    public void setCreated(long created) {
        this.created = created;
    }

    public String getImage() {
        return image_name;
    }

    public void setImage(String image_name) {
        this.image_name = image_name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        if (status.toLowerCase().contains("exited"))
            this.status = "OFF";
        else
            this.status = "ON";
    }

    public String getCid() {
        return container_id;
    }

    public void setCid(String cid) {
        this.container_id = cid;
    }

    @Override
    public String toString() {
        return this.getCid();
    }
}
