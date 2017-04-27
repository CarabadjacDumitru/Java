package OOP_Part1.ChallengeLinkedList;

import java.util.ArrayList;


public class Album {
    private String nameAlbum;
    private ArrayList<Song> listSongs;

    public String getNameAlbum() {
        return nameAlbum;
    }
    public ArrayList<Song> getListSongs() {
        return listSongs;
    }

    public Album(String nameAlbum) {
        this.nameAlbum = nameAlbum;
        listSongs = new ArrayList<>();
    }

    public void AddSong(Song toAdd){
        if (!listSongs.contains(toAdd)){
            listSongs.add(toAdd);
        }
        else
            System.out.println("The song:" + toAdd.getNameSong() +  " is already in the Album");
    }

    public void RemoveSong(Song toAdd){
        if (listSongs.contains(toAdd)){
            listSongs.remove(listSongs.indexOf(toAdd));
        }
        else
            System.out.println("The song:" + toAdd.getNameSong() +  " is not in the Album");
    }

    public void PlayAlbum(){
        for (Song ss:listSongs) {
            ss.PlaySong();
        }
    }

}
