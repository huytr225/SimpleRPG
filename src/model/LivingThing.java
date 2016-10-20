/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Huy
 */
public abstract class LivingThing {
    private String name;
    private float playerPositionX = 0;
    private float playerPositionY = 0;
    private int attack;
    private int defense;
    private int speed;
    private int HP;

    public String getName() {
            return name;
    }
    public void setName(String name) {
            this.name = name;
    }

    public float getPlayerPositionX() {
            return playerPositionX;
    }
    public void setPlayerPositionX(float playerPositionX) {
            this.playerPositionX = playerPositionX;
    }
    public float getPlayerPositionY() {
            return playerPositionY;
    }
    public void setPlayerPositionY(float playerPositionY) {
            this.playerPositionY = playerPositionY;
    }
    public int getAttack() {
            return attack;
    }
    public void setAttack(int attack) {
            this.attack = attack;
    }
    public int getDefense() {
            return defense;
    }
    public void setDefense(int defense) {
            this.defense = defense;
    }
    public int getSpeed() {
            return speed;
    }
    public void setSpeed(int speed) {
            this.speed = speed;
    }
    public int getHP() {
            return HP;
    }
    public void setHP(int hP) {
            HP = hP;
    }
    public abstract void move();

}

