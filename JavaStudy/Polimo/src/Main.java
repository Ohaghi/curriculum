public class Main {
	public static void main(String[] args) {
		Animal cat = new Cat("ねこ", 10, "にゃあ");
		Animal dog = new Dog("いぬ", 16, "わん");
		Animal ele = new Elephant("ぞう", 500, "ぱおん");

		measure(cat);
		measure(dog);
		measure(ele);

		cat.talk();
		dog.talk();
		ele.talk();

	}

	public static void measure(Animal a) {
		System.out.println(a.getName() + "の体重は" + a.getWeight() + "kgです");
	}
}
