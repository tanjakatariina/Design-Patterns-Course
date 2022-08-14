package tehtävä12;

//On System B
class ProxyImage implements Image {
	private final String filename;
	private final String createdDate;
	private RealImage image;

	/**
	 * Constructor
	 * 
	 * @param filename
	 */
	public ProxyImage(String filename, String createdDate) {
		this.filename = filename;
		this.createdDate = createdDate;
	}

	/**
	 * Displays the image
	 */
	@Override
	public void displayImage() {
		if (image == null) {
			image = new RealImage(filename, createdDate);
		}
		image.displayImage();
	}

	/**
	 * Displays the image's metadata.
	 */
	@Override
	public void showData() {
		System.out.println("file name: " + filename + ", Created date: " + createdDate);
		
	}
}