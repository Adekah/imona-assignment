package com.adekah.imonaassignment.entity;

import javax.persistence.*;

@Entity
@Table(name = "game")
public class Game {

    @Id
    @GeneratedValue(generator = "game", strategy = GenerationType.SEQUENCE) //GenerationType.AUTO verilebilir.
    @SequenceGenerator(name = "game", sequenceName = "GAME_ID_SEQ")
    private Long id;

    @Column(name = "name", length = 100)
    private String name;

    @Column(name = "description", length = 1000)
    private String description;

    @Column(name = "logo", length = 1000)
    private String logo;

    public Game() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getLogo() {
        return logo;
    }

}
