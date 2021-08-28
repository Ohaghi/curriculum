abstract class Animal {
	protected String name = "";
	protected int weight = 0;
	protected String voice = "";

	Animal(String name, int weight, String voice) {
		this.name = name;
		this.weight = weight;
		this.voice = voice;
	}

	abstract int getWeight();

	abstract void setWeight(int weight);

	abstract String getName();

	abstract void setName(String name);

	abstract void talk();
}

class Cat extends Animal {
	public Cat(String name, int weight, String voice) {
		super(name, weight, voice);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void talk() {
		System.out.println(this.voice);
	}

	@Override
	int getWeight() {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	void setWeight(int weight) {
		// TODO 自動生成されたメソッド・スタブ

	}
}

class Dog extends Animal {

	public Dog(String name, int weight, String voice) {
		super(name, weight, voice);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void talk() {
		System.out.println(this.voice);
	}

	@Override
	int getWeight() {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	void setWeight(int weight) {
		// TODO 自動生成されたメソッド・スタブ

	}
}

class Elephant extends Animal {
	public Elephant(String name, int weight, String voice) {
		super(name, weight, voice);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void talk() {
		System.out.println(this.voice);
	}

	@Override
	int getWeight() {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	void setWeight(int weight) {
		// TODO 自動生成されたメソッド・スタブ

	}
}
