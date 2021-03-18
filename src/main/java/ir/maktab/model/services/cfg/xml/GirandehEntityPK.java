package ir.maktab.model.services.cfg.xml;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Timestamp;

public class GirandehEntityPK implements Serializable {
    private String lastName;
    private Timestamp dateTahvil;

    @Column(name = "lastName", nullable = false, length = 50)
    @Id
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name = "date tahvil", nullable = false)
    @Id
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

        GirandehEntityPK that = (GirandehEntityPK) o;

        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
        if (dateTahvil != null ? !dateTahvil.equals(that.dateTahvil) : that.dateTahvil != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = lastName != null ? lastName.hashCode() : 0;
        result = 31 * result + (dateTahvil != null ? dateTahvil.hashCode() : 0);
        return result;
    }
}
