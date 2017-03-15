package ChallengeLinkedList;
import Mobile.Contact;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;


public class ListSongs {
    private static  Scanner scanner = new Scanner(System.in);
    private LinkedList<Song> listSongs;
    private ListIterator<Song> listIterator;


    public ListSongs() {
        CreateList();
    }

    public void CreateList() {
        listSongs = new LinkedList<>();
        Album album1 = new Album("First");
        Album album2 = new Album("Second");
        Album album3 = new Album("Third");

        Song song1 = new Song("Song1", 2.0);
        Song song2 = new Song("Song2", 2.1);
        Song song3 = new Song("Song3", 2.2);
        Song song4 = new Song("Song4", 2.3);
        Song song5 = new Song("Song5", 2.4);
        Song song6 = new Song("Song6", 2.5);
        Song song7 = new Song("Song7", 2.6);
        Song song8 = new Song("Song8", 2.7);
        Song song9 = new Song("Song9", 2.8);
        Song song10 = new Song("Song10", 3.1);
        Song song11 = new Song("Song11", 3.2);
        Song song12 = new Song("Song12", 3.3);
        Song song13 = new Song("Song13", 3.4);
        Song song14 = new Song("Song14", 3.5);
        Song song15 = new Song("Song15", 3.6);
        Song song16 = new Song("Song16", 3.7);
        Song song17 = new Song("Song17", 3.8);
        Song song18 = new Song("Song18", 3.9);
        Song song19 = new Song("Song19", 4.0);
        Song song20 = new Song("Song20", 4.1);

        album1.AddSong(song1);
        album1.AddSong(song2);
        album1.AddSong(song3);
        album1.AddSong(song4);
        album1.AddSong(song5);
        album1.AddSong(song6);
        album1.AddSong(song7);
        album1.AddSong(song8);
        album1.AddSong(song9);
        album2.AddSong(song10);
        album2.AddSong(song11);
        album2.AddSong(song12);
        album2.AddSong(song13);
        album2.AddSong(song14);
        album2.AddSong(song15);
        album2.AddSong(song16);
        album2.AddSong(song17);
        album2.AddSong(song18);
        album2.AddSong(song19);
        album3.AddSong(song20);

        AddAlbum(album1);
        AddAlbum(album3);
        AddAlbum(album2);

        listIterator = listSongs.listIterator();
    }

    public void AddAlbum(Album toAdd) {
        for (Song sa : toAdd.getListSongs()) {
            AddSong(sa);
        }
    }

    public void AddSong(Song toAdd) {
        if (listSongs.contains(toAdd)) {
            System.out.println("This list already contains song:" + toAdd.getNameSong());
        } else
            listSongs.add(toAdd);
    }

    public void PrintInstructions() {
        System.out.println("\n Press ");
        System.out.println("\t 0 - Play");
        System.out.println("\t 1 - Pause");
        System.out.println("\t 2 - Next Song");
        System.out.println("\t 3 - Previous Song");
        System.out.println("\t 4 - Stop Play");
        System.out.println("\t 5 - Show Full list");
        System.out.println("\t 8 - Print Instructions");
        System.out.println("\t 9 - Exit");
    }

    public static void main(String[] args) {

        ListSongs myNewList = new ListSongs();
        boolean quit = false;
        int choise = 0;

        myNewList.PrintInstructions();

        while (!quit) {
            System.out.println("Enter your choise");
            choise = scanner.nextInt();
            switch (choise) {
                case 0:
                    myNewList.Play();
                    break;
                case 1:
                    myNewList.Pause();
                    break;
                case 2:
                    myNewList.Next();
                    break;
                case 3:
                    myNewList.Previous();
                    break;
                case 4:
                    myNewList.Stop();
                    break;
                case 5:
                    myNewList.ShowListSongs();
                    break;
                case 8:
                    myNewList.PrintInstructions();
                    break;
                case 9:
                    quit = true;
                    break;
            }

        }
    }

    public void Play(){
        //System.out.println("Playing + " + listIterator.wait(););
    }

    public void Stop(){
        System.out.println("Stop");
    }

    public void Pause(){
        System.out.println("Pause");
    }

    public void Next(){
        if (listIterator.hasNext())
            listIterator.next().PlaySong();
    }

    public void Previous(){
        if (listIterator.hasPrevious())
            listIterator.previous().PlaySong();
    }


    public void ShowListSongs(){
        for (Song al:listSongs) {
            System.out.println("Song name "+ al.getNameSong());
        }
    }
}