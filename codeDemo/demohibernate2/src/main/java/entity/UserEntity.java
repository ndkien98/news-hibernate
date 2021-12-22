package entity;


import javax.persistence.*;

@Table(name = "USER")
@Entity
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    private String fullName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
