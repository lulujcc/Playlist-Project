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

        System.out.println("Adding \"Doo Wop (That Thing)\" by Ms Lauryn Hill...");
        Song dooWop = new Song("Doo Wop (That Thing)", "Ms Lauryn Hill", true, 5, 20);
        set.addSong(dooWop);

        System.out.println("Adding \"Billy Jean\" by Michael Jackson...");
        Song billyJean = new Song("Billy Jean", "Michael Jackson", false, 4, 55);
        set.addSong(billyJean);

        System.out.println("Adding \"Princes of the Universe\" by Queen");
        Song princes = new Song("Princes of the Universe", "Queen", false, 3, 32);
        set.addSong(princes);

        System.out.println("Let's print the songs!");
        set.showSongs();

        System.out.println("Now let's show their duration...");
        set.totalDuration();

        System.out.println("Let's remove Princes of the Universe. A Kind of Magic was not their best era.");
        set.removeSong(4);

        System.out.println("Let's see how our playlist looks now.");
        set.showSongs();

        System.out.println("Let's like \"Billy Jean\" - that's a good song!");
        set.likeSong(3);
        System.out.println("Let's unlike \"Bad Romance\"...");
        set.removeLike(1);
        System.out.println("Now let's see what songs we have liked.");
        set.showLikedSongs();

        System.out.println("Now let's remove all liked songs.");
        set.removeLikedSongs();
        System.out.println("Now let's see what songs we have left...");
        set.showSongs();
        System.out.println("This is kind of a sad playlist now, but that's okay!");
        

        
        


        

    }
    
}
