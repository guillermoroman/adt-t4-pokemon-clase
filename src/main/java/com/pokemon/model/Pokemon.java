package com.pokemon.model;

import jakarta.persistence.*;
import jdk.jfr.Label;

@Entity
@Table(name = "pokemon")
public class Pokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    private String element;

    @Column(nullable = false)
    private int hp;

    @Column(nullable = false)
    private String rarity;

    @Column(nullable = false)
    private Double attack;

    @Column(name = "evolves_from")
    private Pokemon evolvesFrom;

    public Pokemon() {
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

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public Double getAttack() {
        return attack;
    }

    public void setAttack(Double attack) {
        this.attack = attack;
    }

    public Pokemon getEvolvesFrom() {
        return evolvesFrom;
    }

    public void setEvolvesFrom(Pokemon evolvesFrom) {
        this.evolvesFrom = evolvesFrom;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", element='" + element + '\'' +
                ", hp=" + hp +
                ", rarity='" + rarity + '\'' +
                ", attack=" + attack +
                ", evolvesFrom='" + evolvesFrom + '\'' +
                '}';
    }
}
