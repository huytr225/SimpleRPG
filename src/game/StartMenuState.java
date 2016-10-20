/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author Huy
 */

import java.awt.Font;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class StartMenuState extends BasicGameState {

    private static final int NUMBEROFCHOICES = 2;
    private static final int START = 0;
    private static final int QUIT = 1;
    private String[] playersOptions = new String[NUMBEROFCHOICES];
    private Font menuFont, creditsFont;
    private TrueTypeFont playersOptionsTTF, creditsTTF;
    private int playersChoice, stateid;
    private Color notChosen = new Color(153, 204, 255);

    public StartMenuState(int id) {
        stateid = id;
    }

    @Override
    public int getID() {
        return stateid;
    }
    
    @Override
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        menuFont = new Font("Verdana", Font.BOLD, 40);
        playersOptionsTTF = new TrueTypeFont(menuFont, true);
        playersOptions[0] = "Start";
        playersOptions[1] = "Quit";
    }

    @Override
    public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
        Input input = gc.getInput();
        if (input.isKeyPressed(Input.KEY_DOWN)) {
            if (playersChoice == (NUMBEROFCHOICES - 1)) {
                playersChoice = 0;
            } else {
                playersChoice++;
            }
        }
        if (input.isKeyPressed(Input.KEY_UP)) {
            if (playersChoice == 0) {
                playersChoice = NUMBEROFCHOICES - 1;
            } else {
                playersChoice--;
            }
        }
        if (input.isKeyPressed(Input.KEY_ENTER)) {
            switch (playersChoice) {
                case START:
                    sbg.enterState(1);
                    break;
                case QUIT:
                    gc.exit();
                    break;
            }
        }
    }

    @Override
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
        renderPlayersOptions();
    }

    private void renderPlayersOptions() {
        for (int i = 0; i < NUMBEROFCHOICES; i++) {
            if (playersChoice == i) {
                playersOptionsTTF.drawString(100, i * 50 + 200, playersOptions[i]);
            } else {
                playersOptionsTTF.drawString(100, i * 50 + 200, playersOptions[i], notChosen);
            }
        }
    }
}