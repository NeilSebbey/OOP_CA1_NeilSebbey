package assessment;

//TestAlbum.java
/*This test program stores information about songs and albums*/

//Neil Sebbey (T00198203) - OOP CA1 - 02/11/2020

import javax.swing.*;

public class TestAlbum {
    public static void main(String[] args) {

        Song s1 = new Song("Sugar Baby Love", "Rubettes", "Pop", 136, 1977);
        Song s2 = new Song("Living on a Prayer", "Bon Jovi", "Rock", 184, 1985);
        Song s3 = new Song("Blue Suede Shoes", "Elvis Presley", "Pop", 157, 1963);
        Song s4 = new Song("Someone Like You", "Adele", "Pop", 223, 2013);
        Song s5 = new Song("House of Fun", "Madness", "Pop", 178, 1984);

        Album a1 = new Album("Now that’s what I call music 98", <array of songs>, "Universal Music", 2016);

        String output = "Name: " + a1.getName() + "\n\n" + "Producer: " + a1.getProducer() + "\n\n" +
                "Release Year " + a1.getReleaseYear() + "\n\n" + "Number of tracks: " + a1.getNumberOfTracks() +
                "\n\n" + "Total Playing Time: " + a1.getPlayingTime() + "\n\n" +
                "\t\t\t\t\tAlbum Tracks" + "\n\n" +
                "Track Number" + "\t\t\t" + "Title" + "\t\t\t" + "Artist" + "\n\n" +
                a1.getTracks() + "\t\t\t" + a1.getArtist();

        JOptionPane.showMessageDialog(null,output,"Album Information",JOptionPane.INFORMATION_MESSAGE);

        Album.playTrack();

        Album.shuffle();

        System.exit(0);

    }
}
