package ir.maktab.model.services.cfg.xml;

import javax.persistence.*;

@Entity
@Table(name = "order pending", schema = "services", catalog = "")
public class OrderPendingEntity {
    private String chengeStatus;
    private int shomareppaygiry;

    @Basic
    @Column(name = "chenge status", nullable = false, length = 50)
    public String getChengeStatus() {
        return chengeStatus;
    }

    public void setChengeStatus(String chengeStatus) {
        this.chengeStatus = chengeStatus;
    }

    @Id
    @Column(name = "shomareppaygiry", nullable = false)
    public int getShomareppaygiry() {
        return shomareppaygiry;
    }

    public void setShomareppaygiry(int shomareppaygiry) {
        this.shomareppaygiry = shomareppaygiry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderPendingEntity that = (OrderPendingEntity) o;

        if (shomareppaygiry != that.shomareppaygiry) return false;
        if (chengeStatus != null ? !chengeStatus.equals(that.chengeStatus) : that.chengeStatus != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = chengeStatus != null ? chengeStatus.hashCode() : 0;
        result = 31 * result + shomareppaygiry;
        return result;
    }
}
