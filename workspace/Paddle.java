import java.awt.Color;
import java.awt.Graphics;
//
//  Class author:  Chase Walker
//  Date created:  12/4/2024
//  General description:Creates a block that makes the ball bounce to hit bricks
//


public class Paddle {

	//your code here!
	
	//don't forget you need instance variables:
	private int x;
	private int y;
	private int width;
	private int height;
	private int velocity;

	//constructor(s): 
	public Paddle(int x, int y, int width, int height){
		this.width = width;
		this.height =height;
		this.x = x;
		this.y = y;
	}
	Color metaKnightPurp =new Color (61,0,124);
	
	//methods:
		//getters and setters
		public int getWidth() {
			return width;
		}
	
		public void setWidth(int width) {
			this.width = width;
		}
	
		public int getHeight() {
			return height;
		}
	
		public void setHeight(int height) {
			this.height = height;
		}
	
		public int getX() {
			return x;
		}
	
		public void setX(int x) {
			this.x = x;
		}
	
		public int getY() {
			return y;
		}
	
		public void setY(int y) {
			this.y = y;
		}
		public int getVelocity(int velocity){
			return velocity;

		}
		public void addVelocity(int velocity){
			this.velocity += velocity;
		
		}
		public void setVelocity(int velocity){
			this.velocity = velocity ;

		}
		//precondition: 
		//postcondition: the brick is drawn using the color corresponding to its HP value.
		public void draw(Graphics g) {

		}
		

		
		
	
	
	
}
