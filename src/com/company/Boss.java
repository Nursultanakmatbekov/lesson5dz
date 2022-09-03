package com.company;

public class Boss {
    private int damage;
    private String protection;
    private int Health;

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getProtection() {
        return protection;
    }

    public void setProtection(String protection) {
        this.protection = protection;
    }

    public int getHealth() {
        return Health;
    }

    public void setHealth(int health) {
        this.Health = health;
    }

    public void setHealth() {
        this.Health = Health;
    }

    public Boss(int damage, String protection, int Health) {
        this.damage = damage;
        this.protection = protection;
        this.Health = Health;
    }
}

