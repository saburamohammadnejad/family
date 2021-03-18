package ir.maktab.model.services.cfg.xml;

import javax.persistence.*;

@Entity
@Table(name = "type of sending", schema = "services", catalog = "")
@IdClass(TypeOfSendingEntityPK.class)
public class TypeOfSendingEntity {
    private String silver;
    private String gold;
    private int shomarepagiry;
    private String employeeName;
    private String permiume;
    private int price;

    @Basic
    @Column(name = "silver", nullable = false, length = 50)
    public String getSilver() {
        return silver;
    }

    public void setSilver(String silver) {
        this.silver = silver;
    }

    @Basic
    @Column(name = "gold", nullable = false, length = 50)
    public String getGold() {
        return gold;
    }

    public void setGold(String gold) {
        this.gold = gold;
    }

    @Id
    @Column(name = "shomarepagiry", nullable = false)
    public int getShomarepagiry() {
        return shomarepagiry;
    }

    public void setShomarepagiry(int shomarepagiry) {
        this.shomarepagiry = shomarepagiry;
    }

    @Id
    @Column(name = "employee name", nullable = false, length = 50)
    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    @Basic
    @Column(name = "permiume", nullable = false, length = 50)
    public String getPermiume() {
        return permiume;
    }

    public void setPermiume(String permiume) {
        this.permiume = permiume;
    }

    @Basic
    @Column(name = "price", nullable = false)
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TypeOfSendingEntity that = (TypeOfSendingEntity) o;

        if (shomarepagiry != that.shomarepagiry) return false;
        if (price != that.price) return false;
        if (silver != null ? !silver.equals(that.silver) : that.silver != null) return false;
        if (gold != null ? !gold.equals(that.gold) : that.gold != null) return false;
        if (employeeName != null ? !employeeName.equals(that.employeeName) : that.employeeName != null) return false;
        if (permiume != null ? !permiume.equals(that.permiume) : that.permiume != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = silver != null ? silver.hashCode() : 0;
        result = 31 * result + (gold != null ? gold.hashCode() : 0);
        result = 31 * result + shomarepagiry;
        result = 31 * result + (employeeName != null ? employeeName.hashCode() : 0);
        result = 31 * result + (permiume != null ? permiume.hashCode() : 0);
        result = 31 * result + price;
        return result;
    }
}
