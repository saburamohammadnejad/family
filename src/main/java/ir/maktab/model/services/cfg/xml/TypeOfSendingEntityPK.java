package ir.maktab.model.services.cfg.xml;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class TypeOfSendingEntityPK implements Serializable {
    private int shomarepagiry;
    private String employeeName;

    @Column(name = "shomarepagiry", nullable = false)
    @Id
    public int getShomarepagiry() {
        return shomarepagiry;
    }

    public void setShomarepagiry(int shomarepagiry) {
        this.shomarepagiry = shomarepagiry;
    }

    @Column(name = "employee name", nullable = false, length = 50)
    @Id
    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TypeOfSendingEntityPK that = (TypeOfSendingEntityPK) o;

        if (shomarepagiry != that.shomarepagiry) return false;
        if (employeeName != null ? !employeeName.equals(that.employeeName) : that.employeeName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = shomarepagiry;
        result = 31 * result + (employeeName != null ? employeeName.hashCode() : 0);
        return result;
    }
}
