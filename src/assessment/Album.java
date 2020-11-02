package assessment;

//Album.java
//Neil Sebbey (T00198203) - OOP CA1 - 02/11/2020

import javax.swing.*;

public class Album {
    private String name;
    private Song [] = new Song[s];
    private String producer;
    private int releaseYear;
    private Object tracks;

    public Album(String name, tracks[], String producer, int releaseYear){
        name = "No name specified";
        producer = "No producer specified";
        releaseYear = 0;
    }

    public String toString() {
        return "Name: " + name + '\'' +
                ", Producer: '" + producer + '\'' +
                ", Year: " + releaseYear +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTracks(Song[]) {
        //this.tracks = int Song.trackID;

    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setReleaseYear(String name) {
        this.releaseYear = releaseYear;
    }

    public String getName() {
        return name;
    }

    public Song[] getTracks() {
        return tracks;
    }

    public String getProducer() {
        return producer;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String getNumberOfTracks() {
        return numberOfTracks;
    }

    public String getPlayingTime() {
        Song[] += Song.getDuration;
    }

    public static void playTrack(int) {
        String trackNoInput = JOptionPane.showInputDialog(null,"Which track number would you like to play?","Input",JOptionPane.OK_CANCEL_OPTION);
        int trackNo = Integer.parseInt(String trackNoInput);
        trackNo = Song.getTrackNumber();

        String playingT = "Now playing track - details are as follows: " + "\n\n" + "Track number: " + trackNo + "\t" + "Title: " + Song[].getTitle() + "\t" +
                "Artist: " + Song[].getArtist() + "\t" + "Genre: " + Song[].getGenre() + "\t" + "Release year: " + Song[].getReleaseYear() + "\t" +
                "Duration: " + Song[].getDuration();

        JOptionPane.showMessageDialog(null,playingT,"Playing Track",JOptionPane.INFORMATION_MESSAGE);
    }

    public static void shuffle() {
        String shuffleYN = JOptionPane.showInputDialog(null,"Would you like to shuffle the playlist?","Shuffle Playlist",JOptionPane.YES_NO_OPTION)
        for(Song[s];s <= 0;s++) {
            String shufflePL = "Shuffled playlist is as follows: \n\n" + "Track Number: "
        }
    }

    //public String output

}
