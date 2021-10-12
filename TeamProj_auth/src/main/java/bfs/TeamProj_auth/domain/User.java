package bfs.TeamProj_auth.domain;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
public class User {

    private Integer id;
    private String userName;
    private String email;
    private String password;

}
