package _01_Olympic_Rings;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
	public static void main(String[] args) {
		Robot timmy = new Robot(600, 400);
		Robot tammy = new Robot(850, 400);
		Robot sammy = new Robot(1100, 400);
		Robot tommy = new Robot(725,550);
		Robot mammy = new Robot(975,550);
		
		Thread r1 = new Thread(()->{
			timmy.penDown();
			for(int i =0; i<360;i+=5) {
			timmy.move(10);
			timmy.turn(5);
			}
			
		});
		
		Thread r2 = new Thread(()->{
			tammy.penDown();
			for(int i =0; i<360;i+=5) {
			tammy.move(10);
			tammy.turn(5);
			}
			
		});
		Thread r3 = new Thread(()->{
			sammy.penDown();
			for(int i =0; i<360;i+=5) {
			sammy.move(10);
			sammy.turn(5);
			}
			
		});
		Thread r4= new Thread(()->{
			tommy.penDown();
			for(int i =0; i<360;i+=5) {
			tommy.move(10);
			tommy.turn(5);
			}
			
		});
		
		Thread r5= new Thread(()->{
			mammy.penDown();
			for(int i =0; i<360;i+=5) {
			mammy.move(10);
			mammy.turn(5);
			}
			
		});
		
		r1.start();
	
		r2.start();
		r3.start();
		r4.start();
		r5.start();
		
	}
}

