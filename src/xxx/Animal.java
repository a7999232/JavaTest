package xxx;

public class Animal {

	public int age;
	public float weight;

	public Animal(int age, float weight) {

		this.age = age;
		this.weight = weight;

	}

	public void speak() {
		System.out.println(age);
		System.out.println(weight);
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}
}
