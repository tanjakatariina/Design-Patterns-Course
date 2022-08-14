package tehtävä12;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	/**
	 * Test method
	 */
	public static void main(final String[] arguments) {
		ArrayList<Image> photoAlbum = new ArrayList<Image>();
		Scanner scanner = new Scanner(System.in);
		int input;
		
		Image image1 = new ProxyImage("HiRes_10MB_Photo1", "06.04.2022");
		Image image2 = new ProxyImage("HiRes_10MB_Photo2", "04.04.2022");
		Image image3 = new ProxyImage("HiRes_10MB_Photo3", "01.04.2022");

		photoAlbum.add(image1);
		photoAlbum.add(image2);
		photoAlbum.add(image3);
		
		System.out.println("Photo album content: ");
		// Show metadata
		for (int i = 0; i < photoAlbum.size(); i++) {
			System.out.print("Photo " + (i+1) + " - ");
			photoAlbum.get(i).showData();
		}
		
		// Display selected photo.
		do {
			System.out.print("\nSelect photo with numbers 1-3 to display the photo and quit with 4: ");
			input = scanner.nextInt();
			if (input >= 1 && input <= 3) {
				photoAlbum.get(input - 1).displayImage();
			}
		} while (input != 4);
		System.out.println("Clsoed photo album.");
	}
}