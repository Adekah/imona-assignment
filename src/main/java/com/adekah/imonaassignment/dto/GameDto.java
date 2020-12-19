package com.adekah.imonaassignment.dto;

import javax.persistence.Column;

public class GameDto {


    private String name;
    private String description;
    private String logo;

    public GameDto() {
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
}


