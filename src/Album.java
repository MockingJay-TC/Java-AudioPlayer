import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name, artist;
    private ArrayList<Song> songs;
    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        songs = new ArrayList<>();
    }
    public boolean addSong(String titleOfSong, double durationOfSong){
        Song newSong= new Song(titleOfSong, durationOfSong);
        if(findSong(titleOfSong) == null){
            songs.add(newSong);
            return true;
        }
        else return false;
    }
    private Song findSong(String titleOfSong){
        for (Song song : songs) {
            if (song.getTitle().equals(titleOfSong)) {
                return song;
            }
        }
        return null;
    }
    public boolean addToPlayList(int trackSong, LinkedList<Song> playlist){
        if(trackSong < songs.size() && trackSong > -1){
            playlist.add(songs.get(trackSong));
            return true;
        }
        return false;
    }
    public boolean addToPlayList(String titleOfSong, LinkedList<Song> playlist){
        if(findSong(titleOfSong) != null){
            playlist.add(findSong(titleOfSong));
            return true;
        }
        return false;
    }
}
//Victor.Aremu