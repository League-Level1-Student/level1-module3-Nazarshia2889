package _05_netflix;

public class MainClass {
	public static void main(String[] args) {
		Movie i = new Movie("Inception", 4);
		Movie k = new Movie("Kung Fu Panda", 5);
		Movie a = new Movie("Avengers", 4);
		Movie s = new Movie("Star Wars", 4);
		Movie n = new Movie("1917", 5);
		n.getTicketPrice();
		NetflixQueue q = new NetflixQueue();
		q.addMovie(i);
		q.addMovie(k);
		q.addMovie(a);
		q.addMovie(s);
		q.addMovie(n);
		q.printMovies();
		q.getBestMovie();
		q.sortMoviesByRating();
		System.out.println("The best movie is " + q.getBestMovie());
		System.out.println("The second best movie is " + q.getMovie(4));
		}

}
