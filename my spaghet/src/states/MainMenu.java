package states;
/**
 * MainMenu
 * The main menu class. Should implement a main menu later on in the project.
 * @author Hughes
 * EDITS:
 * 1/4/18: created the class, commented (Hughes)
 */

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer; //imports
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class MainMenu extends BasicGameState{
	StateBasedGame game;


	@Override
	/**
	 * init
	 * @author Hughes
	 * runs when the class is created inside a window, use this to initialize the variables and everything needed for the game
	 */
	public void init(GameContainer gc, StateBasedGame game) throws SlickException {
		this.game = game;//don't touch this line
	}

	@Override
	/**
	 * render
	 * @author Hughes
	 * runs as fast as the computer can handle it, drawing everything to the screen (actually, locked to 60FPS for the moment)
	 */
	public void render(GameContainer gc, StateBasedGame game, Graphics g) throws SlickException {
		g.setColor(Color.blue);
		g.fillRect(-1, -1, gc.getScreenWidth(), gc.getScreenHeight());
		g.setColor(Color.black);
		g.drawString("State 1", gc.getScreenWidth()/2, gc.getScreenHeight()/2);
	}

	@Override
	/**
	 * update
	 * @author Hughes
	 * runs in parallel with the render method. Use this to actually update the game and use render to draw it all.
	 */
	public void update(GameContainer gc, StateBasedGame game, int i) throws SlickException {

	}

	@Override
	/**
	 * keyPressed
	 * @author Hughes
	 * This method is run whenever a key is pressed. Use this to handle input.
	 */
	public void keyPressed(int key, char c){
		switch(key){
		case Input.KEY_2:
			game.enterState(2);
			break;
		case Input.KEY_3:
			game.enterState(3);
			break;
		}
	}

	@Override
	/**
	 * getId
	 * @author Hughes
	 * this method returns the numerical id of the class. Used to show the "state-ness" of this class.
	 */
	public int getID() {
		return 1; 
	}
}
