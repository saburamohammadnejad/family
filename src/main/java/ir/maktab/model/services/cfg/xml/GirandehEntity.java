package ir.maktab.model.services.cfg.xml;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "girandeh", schema = "services", catalog = "")
@IdClass(GirandehEntityPK.class)
public class GirandehEntity {
    private String name;
    private String lastName;
    private Timestamp dateTahvil;
    private long phone;

    @Basic
    @Column(name = "name", nullable = false, length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Id
    @Column(name = "lastName", nullable = false, length = 50)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Id
    @Column(name = "date tahvil", nullable = false)
    public Timestamp getDateTahvil() {
        return dateTahvil;
    }

    public void setDateTahvil(Timestamp dateTahvil) {
        this.dateTahvil = dateTahvil;
    }

    @Basic
    @Column(name = "phone", nullable = false)
    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GirandehEntity that = (GirandehEntity) o;

        if (phone != that.phone) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
        if (dateTahvil != null ? !dateTahvil.equals(that.dateTahvil) : that.dateTahvil != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (dateTahvil != null ? dateTahvil.hashCode() : 0);
        result = 31 * result + (int) (phone ^ (phone >>> 32));
        return result;
    }
}
