import java.awt.*;

public class Ball {
	//your code here!
	
	//don't forget you need instance variables:
	private int Ypos;
	private int Size;
	private int Xpos;
	private int Yvelocity;
	private int Xvelocity;

	
	
	//constructor(s):
	Ball(int xPos, int yPos, int size){
		this.Ypos = yPos;
		this.Xpos = xPos;
		this.Size = size;
		Yvelocity = 1;
		Xvelocity = 1;
		
	} 
	Color kirbPink =new Color (223,109,169);	
	//methods:
		//getters and setters
		public int getYpos() {
			return Ypos;
		}
	
		public void setY(int Ypos) {
			this.Ypos = Ypos;
		}
	
		public int getXpos() {
			return Xpos;
		}
	
		public void setX(int Xpos) {
			this.Xpos = Xpos;
		}
	
		public int getSize() {
			return Size;
		}
	
		public void setSize(int size) {
			this.Size = Size;
		}

		public int getYvelocity(){
			return Yvelocity;

		}
		public void setYVelocity(int Yvelocity){
			this.Yvelocity += Yvelocity;
		
		}
		public int getXvelocity(){
			return Xvelocity;

		}
		public void setXVelocity(int Xvelocity){
			this.Xvelocity += Xvelocity ;

		}
		public void reverseX(){
			this.Xvelocity *= -1;
		}
		public void reverseY(){
			this.Yvelocity *= -1;
		}
		//move:
		public int  move (){
			Xpos += Xvelocity;
			Ypos +=Yvelocity;
			return 0;
		}
		//precondition: 
		//postcondition: the brick is drawn using the color corresponding to its HP value.
		public void draw(Graphics g) {
			g.setColor(kirbPink); // call first to set the desired color
			g.fillOval(Xpos, Ypos, Size, Size); // draws a circle (Ball)
		}
		

		
		
	
	
	
}


