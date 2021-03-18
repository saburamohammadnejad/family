package ir.maktab.model.services.cfg.xml;

import javax.persistence.*;

@Entity
@Table(name = "cosromer", schema = "services", catalog = "")
@IdClass(CosromerEntityPK.class)
public class CosromerEntity {
    private String name;
    private String lastName;
    private long phone;
    private int email;
    private String address;
    private int password;
    private String userName;

    @Basic
    @Column(name = "name", nullable = false, length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "Last-Name", nullable = false, length = 50)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "phone", nullable = false)
    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "email", nullable = false, precision = 0)
    public int getEmail() {
        return email;
    }

    public void setEmail(int email) {
        this.email = email;
    }

    @Basic
    @Column(name = "address", nullable = false, length = 100)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Id
    @Column(name = "password", nullable = false, precision = 0)
    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    @Id
    @Column(name = "userName", nullable = false, length = 100)
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

        CosromerEntity that = (CosromerEntity) o;

        if (phone != that.phone) return false;
        if (email != that.email) return false;
        if (password != that.password) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (userName != null ? !userName.equals(that.userName) : that.userName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (int) (phone ^ (phone >>> 32));
        result = 31 * result + email;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + password;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        return result;
    }
}
