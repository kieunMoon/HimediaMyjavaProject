package test.test_graphic;


class SpeedingException extends RuntimeException {
	
	SpeedingException() {}
	SpeedingException(String s) {
		super(s);
	}
	
}


class Car {
	
	final int MAX_SPEED = 100;
	
	int speed;
	
	void speedUp() {
		this.speed++;
		if(this.speed >= MAX_SPEED) {
			SpeedingException se = new SpeedingException("제한속도 초과");
			throw se;
		}
	}
	
	void speedDown() {
		this.speed -= 10;
		System.out.println("감속");
	}
	
	
}

public class Main2 {

	public static void main(String[] args) {
		
		Car c = new Car();
		while(true)
		{	try {
			c.speedUp();
			
		} catch(SpeedingException se) {
			System.out.println(se.getMessage());
			c.speedDown();
		}
		}
	}

}
