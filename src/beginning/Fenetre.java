package beginning;

import java.awt.Color;

import javax.swing.JFrame;

public class Fenetre extends JFrame {
	
	Vue vue=new Vue(10,10);
	
	public Fenetre() {
		

		setTitle("We aint quitting");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		setBackground(Color.cyan);
		add(vue);
		pack();
		setLocation(10,10);
		setVisible(true);
		
		go();
		
		
		
		
		
	}
	
	
	public void go() {
		  
		  boolean backy=false;
		  int x=vue.getPosx();
		  int y=vue.getPosy();
		  
		  while(true){
			  
			 if(y<=10) {
				 
				backy=false; 
				try {
			        Thread.sleep(100);
			      } catch (InterruptedException e) {
			        e.printStackTrace();
			      }  
			 }
			  if(y>=vue.getHeight()-50) {
				  
				  try {
				        Thread.sleep(100);
				      } catch (InterruptedException e) {
				        e.printStackTrace();
				      }  
				  backy=true;
				 
			  }
			  
			  
			  if(backy) {
				  
				  
				  x--;
				  y--;
				  
				  
			  }else {
				  
				  x++;
				  y++;
			  }
 
	  vue.setPosx(x);
	  vue.setPosy(y);
	  vue.repaint();
	  try {
	        Thread.sleep(2);
	      } catch (InterruptedException e) {
	        e.printStackTrace();
	      } 
  
		  }
  }
		
		
		
		
	
	}


