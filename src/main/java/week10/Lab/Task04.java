package week10.Lab;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

class Song {
    private String title;
    private String artist;
    private String genre;

    public Song(String title, String artist, String genre) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public String toString() {
        return "Song: " + this.title;
    }
}

class GenreFilterGenerator implements Iterator<Song> {
    private String genre;
    private ArrayList<Song> playlist = new ArrayList<>();
    private int index;

    public GenreFilterGenerator(String genre, ArrayList<Song> playlist) {
        this.genre = genre;
        this.playlist = playlist;
        this.index = 0;
    }

    public boolean hasNextV0() { // RADI, ALI NA KRAJU IZBACUJE ERROR
        while(!(this.playlist.get(index).getGenre().equals(this.genre))) {
            index++; // skip over different genre songs
        }
        return index < this.playlist.size();
    }
    public boolean hasNext() {
        while(index < playlist.size()) {
            if(this.playlist.get(index).getGenre().equals(this.genre)) {
//                index++;
                return true;
            }
            index++;
        }
        return false;
    }

    public Song next() {
        if(!hasNext()) {
            throw new NoSuchElementException();
        }
        return this.playlist.get(index++);
    }
}

class Task04 {
    public static void main(String[] args) {
        Song song1 = new Song("Trife Life", "Mobb Deep", "Rap");
        Song song2 = new Song("Good kid", "Kendrick Lamar", "Rap");
        Song song3 = new Song("Push up", "Creeds", "Techno");
        Song song4 = new Song("Word play", "A Tribe Called Quest", "Hip-hop");
        Song song5 = new Song("u", "Kendrick Lamar", "Rap");

        ArrayList<Song> songList = new ArrayList<>();
        songList.add(song1);
        songList.add(song2);
        songList.add(song3);
        songList.add(song4);
        songList.add(song5);

        GenreFilterGenerator generator = new GenreFilterGenerator("Rap", songList);
        while(generator.hasNext()) {
            System.out.println(generator.next());
        }
    }
}
