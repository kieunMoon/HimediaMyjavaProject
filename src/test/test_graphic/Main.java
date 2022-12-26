package test.test_graphic;

class MinusException extends RuntimeException {
	MinusException() {
	}

	MinusException(String s) {
		super(s);
	}

}

class OverException extends RuntimeException {
	OverException() {
	}

	OverException(String s) {
		super(s);
	}
}

class Score {
	void check(int score) throws MinusException, OverException {
		if (score < 0) {
			
			throw new MinusException("음수");
		}
		if (score > 100) {
			
			throw new OverException("초과");
		}
	}
}

public class Main {
	public static void main(String[] args) {
		Score score = new Score();
		try {
			score.check(-10);
		} catch (Exception me) {
			System.out.println(me.getMessage());
		}
		try {
			score.check(200);
		} catch (Exception oe) {
			System.out.println(oe.getMessage());
		}

	}
}
