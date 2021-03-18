package ir.maktab.model;

import javax.persistence.*;
import java.sql.Timestamp;
@Entity
public class AplicationPake {
    @Column
    private String name;
    @Column
    private String ManagerName;
    @Column
    private int employeeid;
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int shomarepaygiri;
    @Column
    private Timestamp tarikhetahvil;

    public AplicationPake() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManagerName() {
        return ManagerName;
    }

    public void setManagerName(String managerName) {
        ManagerName = managerName;
    }

    public int getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }

    public int getShomarepaygiri() {
        return shomarepaygiri;
    }

    public void setShomarepaygiri(int shomarepaygiri) {
        this.shomarepaygiri = shomarepaygiri;
    }

    public Timestamp getTarikhetahvil() {
        return tarikhetahvil;
    }

    public void setTarikhetahvil(Timestamp tarikhetahvil) {
        this.tarikhetahvil = tarikhetahvil;
    }

public static class AplicationPakeBuilder()
}

