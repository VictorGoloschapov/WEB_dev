package training.lesson_9.lesson_code;

public class GermanLanguage implements Language {
    @Override
    public void getLanguageName(String name) {
        System.out.println("Sprache name ist: " + name);
    }

    @Override
    public int getAmountOfPeopleWhoSpeaks(String languageName) {
        if (languageName.equalsIgnoreCase("German")) {
            return 1_000_000;
        } else if (languageName.equalsIgnoreCase("Latvian")) {
            return 200000;
        } else if (languageName.equalsIgnoreCase("English")) {
            return 40000;
        } else {
            return 0;
        }
    }
}
