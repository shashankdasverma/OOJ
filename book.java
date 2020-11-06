import java.util.*;
import java.lang.*;
class Book {
	String name, author;
	double price;
	int num_pages;
	Scanner in = new Scanner(System.in);

	Book() {
		System.out.println("Enter name of book: ");
		name = in.nextLine();

		System.out.println("Enter name of author: ");
		author = in.nextLine();

		System.out.println("Enter price of book in Rs: ");
		price = in.nextDouble();

		System.out.println("Enter number of pages in the book: ");
		num_pages = in.nextInt();
	}

	void show() {
		System.out.println("Name: " + name);
		System.out.println("Author: " + author);
		System.out.println("Price: " + price);
		System.out.println("Number of pages: " + num_pages);
	}

	public String toString() {
		return name + ", By " + author + " for Rs." + price + " and has " + num_pages + " pages";
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int n, x;
		
		System.out.println("Enter number of books to be created: ");
		n = in.nextInt();

		Book B[] = new Book[n];

		for(int i = 0; i < n; i++) {
			System.out.println("Book " + (i+1));
			B[i] = new Book();
			System.out.println();
		}

		for(int i = 0; i < n; i++) {
			System.out.println("Book " + (i+1));
			System.out.println(B[i]);
			System.out.println();
		}
		do {
			System.out.println("Enter the book number whose details you want to display: ");
			x = in.nextInt();
		} while(x < 1 && x > n);
		B[x-1].show();

	}
}