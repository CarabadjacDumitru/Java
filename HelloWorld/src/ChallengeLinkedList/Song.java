package ChallengeLinkedList;

public class Song {
    private String nameSong;
    private Double durationSong;
    private boolean isPaused = false;

    public Song(String nameSong, Double durationSong) {
        this.nameSong = nameSong;
        this.durationSong = durationSong;
    }

    public String getNameSong() {
        return nameSong;
    }
    public Double getDurationSong() {
        return durationSong;
    }

    public void PlaySong() {
        if (!isPaused)
            System.out.println("Singing song:" + getNameSong());
    }

    public void PauseSong(){
        if (!isPaused)
            System.out.println("Paused song:" + getNameSong());
        else
            PlaySong();
    }

    public void StopSong(){
        System.out.println("Stoped song:" + getNameSong());
        isPaused=true;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.toString().equals(getNameSong()))
            return true;
        else
            return false;
    }
}
