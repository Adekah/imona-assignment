package com.adekah.imonaassignment.entity;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "player")
public class Player {

    @Id
    @GeneratedValue(generator = "player", strategy = GenerationType.SEQUENCE) //GenerationType.AUTO verilebilir.
    @SequenceGenerator(name = "player", sequenceName = "PLAYER_ID_SEQ")
    private Long id;

    @Column(name = "name", length = 60)
    private String name;

    @Column(name = "surname", length = 60)
    private String surname;

    @Column(name = "gender", length = 6)
    private String gender;

    @Temporal(TemporalType.DATE)
    @Column(name = "birth_date")
    private Date birthDate;

    @Column(name = "birth_city", length = 20)
    private String birthCity;

    @Column(name = "is_active", columnDefinition = "TINYINT(1)")
    private Boolean isActive;

    @JoinColumn(name = "player_action_id")
    @ManyToOne(fetch = FetchType.EAGER)// kullanıcının action'u olması gerektiği için EAGER kullanıyorum. Optional bir alan olsaydı LAZY kullanmamız daha doğru olurdu.
    private Action playerAction;

    public Player() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getBirthCity() {
        return birthCity;
    }

    public void setBirthCity(String birthCity) {
        this.birthCity = birthCity;
    }

    public String getPlayerAction() {
        return playerAction.getName();
    }

    public void setPlayerAction(Action playerAction) {
        this.playerAction = playerAction;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
       this.isActive = isActive;
    }
}
