/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.*;

import org.newdawn.slick.state.*;
import model.*;

/**
 *
 * @author Huy
 */
public class GamePlayState extends BasicGameState{
	AreaMap worldMap = null;
	Player player;
	
	public GamePlayState(int state){
		
	}
	
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException{
		player = new Player();
		worldMap = new AreaMap();
	}
	
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException{
		worldMap.drawMap();
		player.getPlayer().draw(player.getPlayerPositionX()+288,player.getPlayerPositionY()+272);
	}
	
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
            Input input = gc.getInput();
            int xpos = Mouse.getX();
	    int ypos = Mouse.getY();
	    //mouse = "Mouse position x: " + player.getPlayerPositionX() + " y: " + player.getPlayerPositionY();
                
            
            if(input.isKeyDown(Input.KEY_UP)){
                player.getPlayer().start();
                player.setPlayer(player.getMovingUp());
                player.setPlayerPositionY(player.getPlayerPositionY() - delta*.1f);
            } else if(input.isKeyDown(Input.KEY_DOWN)){
                player.getPlayer().start();
                player.setPlayer(player.getMovingDown());
                player.setPlayerPositionY(player.getPlayerPositionY() + delta*.1f);
            } else if(input.isKeyDown(Input.KEY_LEFT)){
                player.getPlayer().start();
                player.setPlayer(player.getMovingLeft());
                player.setPlayerPositionX(player.getPlayerPositionX() - delta*.1f);
            } else if(input.isKeyDown(Input.KEY_RIGHT)){
                player.getPlayer().start();
                player.setPlayer(player.getMovingRight());
                player.setPlayerPositionX(player.getPlayerPositionX() + delta*.1f);
            } else {
                player.getPlayer().stop();
            }
                
	}
	
	public int getID(){
		return 1;
	}
}

