package model;

public class Credit {
	private int movieId;
	private int actorId;
	public Credit(int movieId, int actorId) {
		super();
		this.movieId = movieId;
		this.actorId = actorId;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public int getActorId() {
		return actorId;
	}
	public void setActorId(int actorId) {
		this.actorId = actorId;
	}
	@Override
	public String toString() {
		return "Credit [movieId=" + movieId + ", actorId=" + actorId + "]";
	}
	
	
}
