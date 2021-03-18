package ir.maktab.model.services.cfg.xml;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class CosromerEntityPK implements Serializable {
    private int password;
    private String userName;

    @Column(name = "password", nullable = false, precision = 0)
    @Id
    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    @Column(name = "userName", nullable = false, length = 100)
    @Id
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CosromerEntityPK that = (CosromerEntityPK) o;

        if (password != that.password) return false;
        if (userName != null ? !userName.equals(that.userName) : that.userName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = password;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        return result;
    }
}
