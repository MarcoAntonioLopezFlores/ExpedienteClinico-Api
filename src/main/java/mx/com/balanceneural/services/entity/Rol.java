package mx.com.balanceneural.services.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String rolName;

    @Override
    public String toString() {
        return "Rol{" +
                "id=" + id +
                ", rolName='" + rolName + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRolName() {
        return rolName;
    }

    public void setRolName(String rolName) {
        this.rolName = rolName;
    }

    /*@Override
    public String toString() {
        return "Rol{" +
                "id=" + id +
                ", rolName='" + rolName + '\'' +
                '}';
    }*/
}
