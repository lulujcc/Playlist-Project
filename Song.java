//@authors Lucia Colwell and Vivian Heller
//@date 1/11/22
public class Song{
    private boolean isLiked;
    private int min;
    private int sec;
    private String name;
    private String artist;

    public Song(String title, String musician, boolean like, int minutes, int seconds){
        name = title;
        musician = artist;
        isLiked = like;
        min = minutes;
        sec = seconds;
    }

    public boolean findStatus(){
        return isLiked;
    }
    public int getTotalSeconds(){
        int duration = (int) min*60 + sec;
        return duration;
    }
    public String getName(){
        return name;
    }
    public String getArtist(){
        return artist;
    }

}