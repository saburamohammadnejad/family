package ir.maktab.model.services.cfg.xml;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "packet-history", schema = "services", catalog = "")
public class PacketHistoryEntity {
    private String costomerName;
    private String emplooyeeName;
    private int shomarepaygiry;
    private Timestamp dateTahvil;

    @Basic
    @Column(name = "costomerName", nullable = false, length = 50)
    public String getCostomerName() {
        return costomerName;
    }

    public void setCostomerName(String costomerName) {
        this.costomerName = costomerName;
    }

    @Basic
    @Column(name = "emplooyeeName", nullable = false, length = 50)
    public String getEmplooyeeName() {
        return emplooyeeName;
    }

    public void setEmplooyeeName(String emplooyeeName) {
        this.emplooyeeName = emplooyeeName;
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

        PacketHistoryEntity that = (PacketHistoryEntity) o;

        if (shomarepaygiry != that.shomarepaygiry) return false;
        if (costomerName != null ? !costomerName.equals(that.costomerName) : that.costomerName != null) return false;
        if (emplooyeeName != null ? !emplooyeeName.equals(that.emplooyeeName) : that.emplooyeeName != null)
            return false;
        if (dateTahvil != null ? !dateTahvil.equals(that.dateTahvil) : that.dateTahvil != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = costomerName != null ? costomerName.hashCode() : 0;
        result = 31 * result + (emplooyeeName != null ? emplooyeeName.hashCode() : 0);
        result = 31 * result + shomarepaygiry;
        result = 31 * result + (dateTahvil != null ? dateTahvil.hashCode() : 0);
        return result;
    }
}
