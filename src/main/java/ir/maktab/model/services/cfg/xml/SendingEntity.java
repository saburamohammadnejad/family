package ir.maktab.model.services.cfg.xml;

import javax.persistence.*;

@Entity
@Table(name = "sending", schema = "services", catalog = "")
public class SendingEntity {
    private int password;
    private String usernameCostomer;
    private int shomarePeygiry;

    @Basic
    @Column(name = "password", nullable = false, precision = 0)
    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    @Basic
    @Column(name = "username_costomer", nullable = false, length = 50)
    public String getUsernameCostomer() {
        return usernameCostomer;
    }

    public void setUsernameCostomer(String usernameCostomer) {
        this.usernameCostomer = usernameCostomer;
    }

    @Id
    @Column(name = "shomare peygiry", nullable = false)
    public int getShomarePeygiry() {
        return shomarePeygiry;
    }

    public void setShomarePeygiry(int shomarePeygiry) {
        this.shomarePeygiry = shomarePeygiry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SendingEntity that = (SendingEntity) o;

        if (password != that.password) return false;
        if (shomarePeygiry != that.shomarePeygiry) return false;
        if (usernameCostomer != null ? !usernameCostomer.equals(that.usernameCostomer) : that.usernameCostomer != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = password;
        result = 31 * result + (usernameCostomer != null ? usernameCostomer.hashCode() : 0);
        result = 31 * result + shomarePeygiry;
        return result;
    }
}
