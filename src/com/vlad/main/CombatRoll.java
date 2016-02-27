package com.vlad.main;

public class CombatRoll {                    

    private int capacity;
    private int firePower;

    public CombatRoll() {
        this.capacity = 10;
    }

    public CombatRoll(int capacity) {
        this.capacity = capacity;
    }

    public void roll() {
        firePower = (int) (Math.random() * capacity) + 1;
    }

    public int getValue() {
        return firePower;
    }
}