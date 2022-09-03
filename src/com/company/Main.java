package com.company;

public class Main{

    public static void main(String[] args) {
        Boss boss = new Boss(50, "cool", 200);
        System.out.println("Boss:" + " damage:" + boss.getDamage() + " cool:" + boss.getProtection() + " health:" + boss.getHealth());

    }
}