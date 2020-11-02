package assessment;

//Song.java
//Neil Sebbey (T00198203) - OOP CA1 - 02/11/2020

public class Song {
    private int trackID;
    private int trackNumber;
    private String title;
    private String artist;
    private String genre;
    private int duration;
    private int releaseYear;

    public Song(String title, String artist, String genre, int duration, int releaseYear) {
        title = "No title specified";
        artist = "No artist specified";
        genre = "No genre specified";
        duration = 0;
        releaseYear = 0;
    }

    public String toString() {
        return  "Title: '" + title + '\'' +
                ", Artist: '" + artist + '\'' +
                ", Genre: '" + genre + '\'' +
                ", Duration: " + duration +
                ", Year: " + releaseYear;
    }

    public void setTrackNumber() {
        this.trackNumber = trackNumber;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getTrackNumber() {
        return trackNumber;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist(){
        return artist;
    }

    public String getGenre() {
        return genre;
    }

    public int getDuration() {
        return duration;
    }

    public int getReleaseYear() {
        return releaseYear;
    }
}
