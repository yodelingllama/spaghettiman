package gameMembers;

/**
 * This class is used to represent a bullet in the game. <br>
 * It defines a constant velocity, and given where the mouse pointer is, creates a trajectory for itself across the screen.
 * @author Hughes
 */
public class Bullet extends EnvironmentMember {
	
	private float xVel, yVel;//These velocity variables represent the Cartesian slope values of the float. This is needed because the screen rendering is done in a Cartesian coordinate system.
	
	/**
	 * The constructor for the class takes two sets of coordinates: The player(or other bullet origin)'s location (px, py) and the cursor (or destination of the bullet)'s coordinates (cx, cy) and converts them into a vector that the bullet travels along.
	 * @param vel  the new velocity of the bullet
	 * @param px  the x coordinate origin of the bullet
	 * @param py  the y coordinate origin of the bullet
	 * @param cx  the x coordinate destination of the bullet
	 * @param cy  the y coordinate destination of the bullet
	 */
	public Bullet(float vel, float px, float py, float cx, float cy) {
		super(px, py, "assets/Bullet.png", .025f);//super constructor
		//now, triangles
		double theta = Math.atan2(cx-px, cy-py);//find the angle that the cursor is at relative to the origin
		xVel = (float)(vel*Math.sin(theta));//turn this into x and y components of a vector with length SPEED
		yVel = (float)(vel*Math.cos(theta));
	}
	
	
	/**
	 * updateLoc<br>
	 * This method updates the location of the bullet based on its velocity. This is meant to be called from an update method in a state class.
	 */
	public void updateLoc() {
		setX(getX()+xVel);
		setY(getY()+yVel);
	}
}
