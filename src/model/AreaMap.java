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


public class AreaMap {
    public static final int WIDTH = 43;
    public static final int HEIGHT = 24;
    
    private int[][] map = new int[WIDTH][HEIGHT];
    Image[] tiles = new Image[1];
    
    public AreaMap() throws SlickException{
        tiles[0] = new Image("res/grass.png");
        setMap();
    }


    public void setMap() {
        for(int i = 0; i < WIDTH; i++)
            for(int j = 0; j < HEIGHT; j++)
                this.map[i][j] = 1;
    }


    public void drawMap(){
        for(int i = 0; i < WIDTH; i++)
            for(int j = 0; j < HEIGHT; j++){
                if(map[i][j] == 1){
                    tiles[0].draw(i*32,j*32);
                }
            }
    }
}

