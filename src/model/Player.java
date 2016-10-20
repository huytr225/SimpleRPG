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

import org.newdawn.slick.*;

public class Player extends LivingThing  {
    SpriteSheet spritePlayer;
    Animation player, movingUp,movingDown,movingLeft,movingRight;
    Image[] walkUp,walkDown,walkLeft,walkRight;
    int[] duration = {100,100,100,100};
    private int level;
    private int exp;

    private int[] exp_limit = {100,200,500,1000,2000,5000,10000,20000,50000};

    public Player () throws SlickException{
            spritePlayer = new SpriteSheet("res/player.png",32,48);
            
            this.walkUp = new Image[4];
            this.walkDown = new Image[4];
            this.walkLeft = new Image[4];
            this.walkRight = new Image[4];
            
            for(int i = 0; i < 4; i++){
                this.walkUp[i] = spritePlayer.getSprite(i, 3);
                this.walkDown[i] = spritePlayer.getSprite(i, 0);
                this.walkLeft[i] = spritePlayer.getSprite(i, 1);
                this.walkRight[i] = spritePlayer.getSprite(i, 2);
            }
            
            movingUp = new Animation(walkUp, duration, true);
            movingDown = new Animation(walkDown, duration, true);
            movingLeft = new Animation(walkLeft, duration, true);
            movingRight = new Animation(walkRight, duration, true);
            
            player = movingDown;
            
            setLevel(1);
//            setExp(0);
    }
    
    public Animation getMovingUp() {
        return movingUp;
    }
        
    public Animation getMovingDown() {
        return movingDown;
    }

    public Animation getMovingLeft() {
        return movingLeft;
    }

    public Animation getMovingRight() {
        return movingRight;
    }
    
    public int getLevel() {
            return level;
    }
    public void setLevel(int level) {
            this.level = level;
    }
    public Animation getPlayer() {
        return player;
    }

    public void setPlayer(Animation player) {
        this.player = player;
    }

    @Override
    public void move() {
        
    }
	
}

