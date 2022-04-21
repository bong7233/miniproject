package com.pbl.teamproject.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class User extends Timestamped{

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long user_no;

    @Column(nullable = false, unique = true)
    private String user_id;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false, unique = true)
    private String nickname;

    @Column(nullable = false)
    private String password;

    public User(String user_id, String email, String nickname, String password) {
        this.user_id = user_id;
        this.email = email;
        this.nickname = nickname;
        this.password = password;
    }
}
