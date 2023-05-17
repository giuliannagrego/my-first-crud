package api.giuliana.MyFirstCrud.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "users_top")
@Data
public class NewUser implements Serializable {

    @Id
    @Column(name = "id", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "cpf", nullable = false)
    private String cpf;

    @Column(name = "tellphone", nullable = false)
    private String tellphone;

    @Column(name = "email", nullable = false)
    private String email;
}
