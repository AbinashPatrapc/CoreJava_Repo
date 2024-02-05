package Helena;

import java.util.Scanner;

//Create a class Library with a public method checkoutBook(). 
//The method should call a private method updateInventory().
public class BookInventory {
	private int books;

	public BookInventory(int books) {
		this.books = books;
	}

	public int getBooks() {
		return books;
	}

	private void updateInventory(int noOfBook) {
		if (books > noOfBook) {
			books -= noOfBook;
		} else {
			System.out.println("Shortage of Stock In inventory");
		}
	}

	public void checkOutBook(int Book) {
		if (books > Book) {
			updateInventory(Book);
		} else {
			System.out.println("Shortage of Stock In inventory");
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number of Book to Stock:");
		int sno = sc.nextInt();
		BookInventory bi = new BookInventory(sno);
		System.out.print("Enter Number of Books You want to Purchase: ");
		int bno = sc.nextInt();
		bi.checkOutBook(bno);
		System.out.println("Updated Stock: " + bi.getBooks());
	}

}
