public class VideoGame{
	private String title;
	private String rating;
	private int year;
	private String[] platforms;

	public VideoGame(){
		// intentionally empty
	}

	public VideoGame(String title, String rating, int year, String[] platforms){
		this.title = title;
		this.rating = rating;
		this.year = year;
		this.platforms = platforms;
	}
}