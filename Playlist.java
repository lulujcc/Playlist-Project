import java.util.*;
public class Playlist {
    private ArrayList<Song> playlist;
    public Playlist(){
        playlist = new ArrayList<Song>();
    }

    public void addSong(Song song){
        playlist.add(song);
        System.out.println("Added: " + song.toString());
    }
    public void likeSong(int position){
        Song s = playlist.get(position);
        s.changeStatus();
        if(s.findStatus() == true){
            System.out.println(s.toString() + " is now liked.");
        } else{
            System.out.println(s.toString() + " is unliked.");
        }

        }
        public void removeSong(int position){
            playlist.remove(position);
            System.out.println(playlist.get(position).toString() + " is now removed.");
        }
        public void showLikedSongs(){
            for(int i = 0; i < playlist.size(); i++){
                if(playlist.get(i).findStatus() == true){
                    System.out.println(playlist.get(i).toString());
                }

            }
        }
        


    }
    
