package ir.maktab.model.services.cfg.xml;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "applicationpacke", schema = "services", catalog = "")
@IdClass(ApplicationpackeEntityPK.class)
public class ApplicationpackeEntity {
    private String employeeName;
    private String name;
    private String managerName;
    private int employeeid;
    private int shomarePaygiry;
    private Timestamp tarikhTahvil;

    @Id
    @Column(name = "employee-name", nullable = false, length = 50)
    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Id
    @Column(name = "managerName", nullable = false, length = 50)
    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    @Basic
    @Column(name = "employeeid", nullable = false)
    public int getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }

    @Id
    @Column(name = "shomare paygiry", nullable = false)
    public int getShomarePaygiry() {
        return shomarePaygiry;
    }

    public void setShomarePaygiry(int shomarePaygiry) {
        this.shomarePaygiry = shomarePaygiry;
    }

    @Basic
    @Column(name = "tarikh-tahvil", nullable = false)
    public Timestamp getTarikhTahvil() {
        return tarikhTahvil;
    }

    public void setTarikhTahvil(Timestamp tarikhTahvil) {
        this.tarikhTahvil = tarikhTahvil;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ApplicationpackeEntity that = (ApplicationpackeEntity) o;

        if (employeeid != that.employeeid) return false;
        if (shomarePaygiry != that.shomarePaygiry) return false;
        if (employeeName != null ? !employeeName.equals(that.employeeName) : that.employeeName != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (managerName != null ? !managerName.equals(that.managerName) : that.managerName != null) return false;
        if (tarikhTahvil != null ? !tarikhTahvil.equals(that.tarikhTahvil) : that.tarikhTahvil != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = employeeName != null ? employeeName.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (managerName != null ? managerName.hashCode() : 0);
        result = 31 * result + employeeid;
        result = 31 * result + shomarePaygiry;
        result = 31 * result + (tarikhTahvil != null ? tarikhTahvil.hashCode() : 0);
        return result;
    }
}
