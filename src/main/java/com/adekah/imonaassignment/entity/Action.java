package com.adekah.imonaassignment.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "action")
public class Action {

    @Id
    @GeneratedValue(generator = "action", strategy = GenerationType.SEQUENCE) //GenerationType.AUTO verilebilir.
    @SequenceGenerator(name = "action", sequenceName = "ACTION_ID_SEQ")
    private Long id;

    @Column(name = "name", length = 100)
    private String name;

    @Column(name = "description", length = 1000)
    private String description;

    @Column(name = "point")
    private Long point;


    public Action() {
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

    public Long getPoint() {
        return point;
    }

}
