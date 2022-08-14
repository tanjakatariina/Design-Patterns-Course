package tehtävä12;

//On System A
class RealImage implements Image {
	private final String filename;
	private final String createdDate;

	/**
	 * Constructor
	 * 
	 * @param filename
	 */
	public RealImage(String filename, String createdDate) {
		this.filename = filename;
		this.createdDate = createdDate;
		loadImageFromDisk();
	}

	/**
	 * Loads the image from the disk
	 */
	private void loadImageFromDisk() {
		System.out.println("Loading   " + filename);
	}

	/**
	 * Displays the image
	 */
	@Override
	public void displayImage() {
		System.out.println("Displaying " + filename);
	}

	/**
	 * Displays the image's metadata.
	 */
	@Override
	public void showData() {
		System.out.println("file name: " + filename + ", Created date: " + createdDate);
		
	}
}