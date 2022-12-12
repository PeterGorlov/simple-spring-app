package ua.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicPlayer musicPlayer = context.getBean("musicPlayerBean", MusicPlayer.class);

        musicPlayer.playMusic();

        System.out.println("Name: " + musicPlayer.getName() + ", Volume: " + musicPlayer.getVolume());

        context.close();
    }
}
