package training.lesson4.homework.level5;

public class LightColorDetector {
    //тест программы
    //метод main
    public static void main(String[] args) {
        int lightWave = 800;
        String detectColor = detect(lightWave);
        System.out.println(detectColor);
    }
    //логика определения цвета
    //убрать static
    public static String detect(int wavelength) {
        if (wavelength >= 380 && wavelength <= 449) {
            return "Violet";
        } else if (wavelength > 450 && wavelength <= 494) {
            return "Blue";
        } else if (wavelength > 495 && wavelength <= 569) {
            return "Green";
        } else if (wavelength > 570 && wavelength <= 589) {
            return "Yellow";
        } else if (wavelength > 590 && wavelength <= 619) {
            return "Orange";
        } else if (wavelength > 620 && wavelength <= 750) {

            return "Red";
        } else {
            return "Number is not in a wave length range";
        }
    }
}
