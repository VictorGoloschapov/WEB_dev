package training.lesson_9.lesson_code;

public class LanguageApp {
    public static void main(String[] args) {
        GermanLanguage german = new GermanLanguage();
        EnglishLanguage english = new EnglishLanguage();

        english.getLanguageName("English");
        german.getLanguageName("German");

    }
}
