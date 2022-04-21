package com.pbl.teamproject.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Setter
@Entity
@Getter
@NoArgsConstructor
public class Like extends Timestamped{

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long like_id;

    //FK
    private Long post_no;

    //FK
    private Long user_no;

}
