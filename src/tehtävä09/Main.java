package tehtävä09;

public class Main {

	public static void main(String[] args) {
		ListConverter converterEvery = new EveryElement();
		ListConverter converterEverySecond = new EverySecondElement();
		ListConverter converterEveryThird = new EveryThirdElement();

		System.out.println("Line break after each list element:");
		Context context = new Context(converterEvery);
		context.convert();

		System.out.println("\n\nLine break after every other list element:");
		context.setConverter(converterEverySecond);
		context.convert();

		System.out.println("\n\nLine break after every third list element:");
		context.setConverter(converterEveryThird);
		context.convert();
	}
}