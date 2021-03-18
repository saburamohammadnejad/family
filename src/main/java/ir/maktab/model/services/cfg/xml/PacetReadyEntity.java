package ir.maktab.model.services.cfg.xml;

import javax.persistence.*;

@Entity
@Table(name = "pacet ready", schema = "services", catalog = "")
@IdClass(PacetReadyEntityPK.class)
public class PacetReadyEntity {
    private int shomarePaygiry;
    private String nameCostomer;
    private String typeOgHaml;
    private String firstAdress;
    private String endAddress;
    private double waighte;
    private String typeOfPacket;

    @Id
    @Column(name = "shomare paygiry", nullable = false)
    public int getShomarePaygiry() {
        return shomarePaygiry;
    }

    public void setShomarePaygiry(int shomarePaygiry) {
        this.shomarePaygiry = shomarePaygiry;
    }

    @Id
    @Column(name = "name costomer", nullable = false, length = 50)
    public String getNameCostomer() {
        return nameCostomer;
    }

    public void setNameCostomer(String nameCostomer) {
        this.nameCostomer = nameCostomer;
    }

    @Basic
    @Column(name = "type og haml", nullable = false, length = 50)
    public String getTypeOgHaml() {
        return typeOgHaml;
    }

    public void setTypeOgHaml(String typeOgHaml) {
        this.typeOgHaml = typeOgHaml;
    }

    @Basic
    @Column(name = "first adress", nullable = false, length = 50)
    public String getFirstAdress() {
        return firstAdress;
    }

    public void setFirstAdress(String firstAdress) {
        this.firstAdress = firstAdress;
    }

    @Basic
    @Column(name = "end address", nullable = false, length = 50)
    public String getEndAddress() {
        return endAddress;
    }

    public void setEndAddress(String endAddress) {
        this.endAddress = endAddress;
    }

    @Basic
    @Column(name = "waighte", nullable = false, precision = 0)
    public double getWaighte() {
        return waighte;
    }

    public void setWaighte(double waighte) {
        this.waighte = waighte;
    }

    @Basic
    @Column(name = "type of packet", nullable = false, length = 50)
    public String getTypeOfPacket() {
        return typeOfPacket;
    }

    public void setTypeOfPacket(String typeOfPacket) {
        this.typeOfPacket = typeOfPacket;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PacetReadyEntity that = (PacetReadyEntity) o;

        if (shomarePaygiry != that.shomarePaygiry) return false;
        if (Double.compare(that.waighte, waighte) != 0) return false;
        if (nameCostomer != null ? !nameCostomer.equals(that.nameCostomer) : that.nameCostomer != null) return false;
        if (typeOgHaml != null ? !typeOgHaml.equals(that.typeOgHaml) : that.typeOgHaml != null) return false;
        if (firstAdress != null ? !firstAdress.equals(that.firstAdress) : that.firstAdress != null) return false;
        if (endAddress != null ? !endAddress.equals(that.endAddress) : that.endAddress != null) return false;
        if (typeOfPacket != null ? !typeOfPacket.equals(that.typeOfPacket) : that.typeOfPacket != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = shomarePaygiry;
        result = 31 * result + (nameCostomer != null ? nameCostomer.hashCode() : 0);
        result = 31 * result + (typeOgHaml != null ? typeOgHaml.hashCode() : 0);
        result = 31 * result + (firstAdress != null ? firstAdress.hashCode() : 0);
        result = 31 * result + (endAddress != null ? endAddress.hashCode() : 0);
        temp = Double.doubleToLongBits(waighte);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (typeOfPacket != null ? typeOfPacket.hashCode() : 0);
        return result;
    }
}
