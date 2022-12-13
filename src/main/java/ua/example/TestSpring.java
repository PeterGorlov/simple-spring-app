package ua.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicPlayer firstMusicPlayer = context.getBean("musicPlayerBean", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayerBean", MusicPlayer.class);

        boolean comparison = firstMusicPlayer == secondMusicPlayer;

        System.out.println(comparison);
        System.out.println(firstMusicPlayer);
        System.out.println(secondMusicPlayer);

        firstMusicPlayer.setVolume(10);

        System.out.println(firstMusicPlayer.getVolume());
        System.out.println(secondMusicPlayer.getVolume());

        MusicPlayer musicPlayer = context.getBean("musicPlayerBean", MusicPlayer.class);

        musicPlayer.playMusic();

        System.out.println("Name: " + musicPlayer.getName() + ", Volume: " + musicPlayer.getVolume());

        context.close();
    }
}
