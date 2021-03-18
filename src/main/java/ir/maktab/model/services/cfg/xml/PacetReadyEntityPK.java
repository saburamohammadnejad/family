package ir.maktab.model.services.cfg.xml;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class PacetReadyEntityPK implements Serializable {
    private int shomarePaygiry;
    private String nameCostomer;

    @Column(name = "shomare paygiry", nullable = false)
    @Id
    public int getShomarePaygiry() {
        return shomarePaygiry;
    }

    public void setShomarePaygiry(int shomarePaygiry) {
        this.shomarePaygiry = shomarePaygiry;
    }

    @Column(name = "name costomer", nullable = false, length = 50)
    @Id
    public String getNameCostomer() {
        return nameCostomer;
    }

    public void setNameCostomer(String nameCostomer) {
        this.nameCostomer = nameCostomer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PacetReadyEntityPK that = (PacetReadyEntityPK) o;

        if (shomarePaygiry != that.shomarePaygiry) return false;
        if (nameCostomer != null ? !nameCostomer.equals(that.nameCostomer) : that.nameCostomer != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = shomarePaygiry;
        result = 31 * result + (nameCostomer != null ? nameCostomer.hashCode() : 0);
        return result;
    }
}
