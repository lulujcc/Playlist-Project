public class PlaylistTester {
    public static void main(String[] args) {
        System.out.println("Welcome to your playlist.");
        System.out.println("Adding \"Friday I'm in love\" by The Cure...");
        Song friday = new Song("Friday I'm in Love", "The Cure", true, 3, 35);
        Playlist set = new Playlist();
        set.addSong(friday);

        System.out.println("Adding \"Bad Romance\" by LADY GAGA...");
        Song gaga = new Song("Bad Romance", "LADY GAGA", true, 4, 53);
        set.addSong(gaga);
        
        


        

    }
    
}
