package com.Factory;

/**
 * @author khalil el maghraoui <khalil.elmaghraoui.1@gmail.com>
 * @created 12/20/2020.
 */
public class Mario {

    private String name;
    private int health = 100;
    private int jumpAttack = 10;
    private int mushroomAttack = 20;

    public Mario(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getJumpAttack() {
        return jumpAttack;
    }

    public int getMushroomAttack() {
        return mushroomAttack;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }
}
