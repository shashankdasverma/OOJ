import java.util.*;
import java.lang.*;


abstract class Shape {
	Scanner in = new Scanner(System.in);
	int a1, a2;
	Shape() {
		System.out.println("Input 2 integer values: ");
		a1 = in.nextInt();
		a2 = in.nextInt();
	}
	abstract void printArea();
}


class Rectangle extends Shape {
	void printArea() {
		System.out.println("Rectangle : " + a1*a2);
	}
}


class Triangle extends Shape {
	void printArea() {
		System.out.println("Triangle : " + (a1*a2)/2);
	}
}


class Circle extends Shape {
	void printArea() {
		System.out.println("Circle 1: " + (3.14 * a1 * a1));
		System.out.println("Circle 2: " + (3.14 * a2 * a2));
	}
}


class testAbstract {
	public static void main(String[] args) {
		Shape s;

		s = new Rectangle();
		s.printArea();

		s = new Triangle();
		s.printArea();

		s = new Circle();
		s.printArea();	
	}
}
