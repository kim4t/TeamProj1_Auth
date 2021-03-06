package bfs.TeamProj_auth.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "user")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;
    @Column(name = "userName", nullable = false, length = 250)
    private String userName;
    @Column(name = "email", nullable = false, length = 250)
    private String email;
    @Column(name = "password", nullable = false, length = 250)
    private String password;
    @Column(name = "createDate", nullable = false, length = 250)
    private LocalDate createDate;
    @Column(name = "modificationDate", nullable = false, length = 250)
    private LocalDate modificationDate;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "personId")
    private Person person;

//
//    @OneToOne(mappedBy = "user", fetch = FetchType.LAZY)
//    private UserRole userRole;

}
