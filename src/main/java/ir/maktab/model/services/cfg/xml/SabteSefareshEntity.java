package ir.maktab.model.services.cfg.xml;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "sabte sefaresh", schema = "services", catalog = "")
public class SabteSefareshEntity {
    private int employeeid;
    private int shomarepaygiry;
    private Timestamp dateTahvil;

    @Basic
    @Column(name = "employeeid", nullable = false)
    public int getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }

    @Id
    @Column(name = "shomarepaygiry", nullable = false)
    public int getShomarepaygiry() {
        return shomarepaygiry;
    }

    public void setShomarepaygiry(int shomarepaygiry) {
        this.shomarepaygiry = shomarepaygiry;
    }

    @Basic
    @Column(name = "date tahvil", nullable = false)
    public Timestamp getDateTahvil() {
        return dateTahvil;
    }

    public void setDateTahvil(Timestamp dateTahvil) {
        this.dateTahvil = dateTahvil;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SabteSefareshEntity that = (SabteSefareshEntity) o;

        if (employeeid != that.employeeid) return false;
        if (shomarepaygiry != that.shomarepaygiry) return false;
        if (dateTahvil != null ? !dateTahvil.equals(that.dateTahvil) : that.dateTahvil != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = employeeid;
        result = 31 * result + shomarepaygiry;
        result = 31 * result + (dateTahvil != null ? dateTahvil.hashCode() : 0);
        return result;
    }
}
