package Interface;

public class InterfaceExercise {

	public static void main(String[] args) {
		Bounceable b = new Ball("Burgandi");
		b.SetBounceFactor(5);
		b.bounce();
		Tyre t = new Tyre("White");
		t.SetBounceFactor(10);
		t.bounce();
	}
}
