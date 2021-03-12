package p3;

abstract class MediaItem extends Item {

	public MediaItem(int id, String title, int numCopy) {
		super(id, title, numCopy);
		// TODO Auto-generated constructor stub
	}

	private int runtime;

	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}

	public int getIdNum() {
		return super.getIdNum();
	}

	public String getTitle() {
		return super.getTitle();
	}

	public int getNumCopies() {
		return super.getNumCopies();
	}

	public void print() {
		System.out.println("Display info about a MediaItem: ");
		super.print();
	}

	public void checkIn() {
		super.checkIn();
	}

	public void checkOut() {
		super.checkOut();
	}

}
