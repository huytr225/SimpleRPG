package game;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

/**
 *
 * @author Huy
 */
public class SimpleRPG extends StateBasedGame{
    public static final String GAMENAME = "SimpleRPG";
    public static final int STARTMENUSTATE = 0;
    public static final int GAMEPLAYSTATE = 1;

    public static final int WIDTH = 1376;
    public static final int HEIGHT = 768;
    public static final boolean FULLSCREEN = false;
	
    public SimpleRPG (){
        super(GAMENAME);
        addState(new StartMenuState(STARTMENUSTATE));
        addState(new GamePlayState(GAMEPLAYSTATE));
    }

    public void initStatesList(GameContainer gc) throws SlickException {
        getState(STARTMENUSTATE).init(gc, this);
        getState(GAMEPLAYSTATE).init(gc, this);
        this.enterState(STARTMENUSTATE);
    }
	
    public static void main(String[] args) {
            AppGameContainer app;
            try{
                app = new AppGameContainer(new SimpleRPG());
                app.setDisplayMode(WIDTH, HEIGHT, FULLSCREEN);
                app.start();
            } catch(SlickException e) {
                    e.printStackTrace();
            }
    }

}
