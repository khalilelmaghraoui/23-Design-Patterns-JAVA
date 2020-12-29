package com.Factory;

/**
 * @author khalil el maghraoui <khalil.elmaghraoui.1@gmail.com>
 * @created 12/20/2020.
 */
public abstract class Enemy {

    private String name;
    private int damage;
    private int health;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void showUp() {
        System.out.printf("[%s] is showing up. Damage is [%d] Health is [%d]%n", getName(), getDamage(), getHealth());
    }

    public abstract int attack() ;

    public abstract void takeDamage(int value) ;
}
