package ir.maktab.model.services.cfg.xml;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class ApplicationpackeEntityPK implements Serializable {
    private String employeeName;
    private String managerName;
    private int shomarePaygiry;

    @Column(name = "employee-name", nullable = false, length = 50)
    @Id
    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    @Column(name = "managerName", nullable = false, length = 50)
    @Id
    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    @Column(name = "shomare paygiry", nullable = false)
    @Id
    public int getShomarePaygiry() {
        return shomarePaygiry;
    }

    public void setShomarePaygiry(int shomarePaygiry) {
        this.shomarePaygiry = shomarePaygiry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ApplicationpackeEntityPK that = (ApplicationpackeEntityPK) o;

        if (shomarePaygiry != that.shomarePaygiry) return false;
        if (employeeName != null ? !employeeName.equals(that.employeeName) : that.employeeName != null) return false;
        if (managerName != null ? !managerName.equals(that.managerName) : that.managerName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = employeeName != null ? employeeName.hashCode() : 0;
        result = 31 * result + (managerName != null ? managerName.hashCode() : 0);
        result = 31 * result + shomarePaygiry;
        return result;
    }
}
