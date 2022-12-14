package ua.example;

public class ClassicalMusic implements Music {
    private ClassicalMusic() {
    }

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    public void doMyInit() {
        System.out.println("DoMyInit");
    }

    public void doMyDestroy() {
        System.out.println("doMyDestroy");
    }

    @Override
    public String getSong() {
        return "ClassicalMusic";
    }
}
