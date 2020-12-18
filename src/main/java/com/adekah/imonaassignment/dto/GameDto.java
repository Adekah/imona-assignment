package com.adekah.imonaassignment.dto;

import javax.persistence.Column;

public class GameDto {

    private Long id;
    private String name;
    private String description;
    private String logo;

    public GameDto() {
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


