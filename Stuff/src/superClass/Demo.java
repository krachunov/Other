package superClass;

import playTech.SubClassOtherPack;

public class Demo {

	public static void main(String[] args) {
		SubClass1 subClass1 = new SubClass1();
		subClass1.someMethod();
		SubClassOtherPack subClassPtherPack = new SubClassOtherPack();
		subClassPtherPack.someMethod();

	}

}
