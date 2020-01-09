package beginning;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;


public class Vue extends JPanel {
	
	private int posx;
	private int posy;
	
	
	
	public Vue (int posx,int posy) {
		
		super();
	   this. posx=posx;
	   this. posy=posy;
		setPreferredSize(new Dimension(600,400));
		
		
	}
	
	
	
		
		  public void paintComponent(Graphics g){
			  Graphics2D g2d=(Graphics2D) g;
			 
			  g2d.setColor(Color.white);
			  g2d.fillOval(posx,posy, 50, 50);
			  g2d.setColor(Color.green);
			  g2d.fillRect(40,40,this.getWidth()-100,this.getHeight()-100);
			  
			  g2d.setColor(Color.white);
			  g2d.fillOval(posx,posy, 50, 50);
			  g2d.setFont(new Font("Georgia", Font.ITALIC, 12));
			  g2d.drawString("lentino is the best human alive man no chill", 60,60);
		
		
		
	}




		public int getPosx() {
			return posx;
		}




		public void setPosx(int posx) {
			this.posx = posx;
		}




		public int getPosy() {
			return posy;
		}




		public void setPosy(int posy) {
			this.posy = posy;
		}

}
