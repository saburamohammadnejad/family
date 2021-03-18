package ir.maktab.model.services.cfg.xml;

import javax.persistence.*;

@Entity
@Table(name = "ordermore tack", schema = "services", catalog = "")
public class OrdermoreTackEntity {
    private int shomarepaygiry;
    private String statuseSendeing;

    @Id
    @Column(name = "shomarepaygiry", nullable = false)
    public int getShomarepaygiry() {
        return shomarepaygiry;
    }

    public void setShomarepaygiry(int shomarepaygiry) {
        this.shomarepaygiry = shomarepaygiry;
    }

    @Basic
    @Column(name = "statuse sendeing", nullable = false, length = 50)
    public String getStatuseSendeing() {
        return statuseSendeing;
    }

    public void setStatuseSendeing(String statuseSendeing) {
        this.statuseSendeing = statuseSendeing;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrdermoreTackEntity that = (OrdermoreTackEntity) o;

        if (shomarepaygiry != that.shomarepaygiry) return false;
        if (statuseSendeing != null ? !statuseSendeing.equals(that.statuseSendeing) : that.statuseSendeing != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = shomarepaygiry;
        result = 31 * result + (statuseSendeing != null ? statuseSendeing.hashCode() : 0);
        return result;
    }
}
