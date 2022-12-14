package ua.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope("singleton")
public class MusicPlayer {
    List<Music> musicList = new ArrayList<>();
    private Music music;
    @Value("Some sound")
    private String name;
    @Value("10")
    private int volume;

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer() {
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public List<Music> getMusicList() {
        return musicList;
    }

    @Autowired
    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusic() {
        if (musicList.size() == 0) {
            System.out.println("Play song : " + music.getSong());
        } else {
            for (Music music : musicList) {
                System.out.println("Play Song : " + music.getSong() +
                        " : " + "Name: " + name + " Volume: " + volume);
            }
        }
    }
}
