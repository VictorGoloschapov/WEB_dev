package Java_training_projects.library_visitors;


import java.util.Random;

public class ReaderDemo {
    public static void main(String[] args) {
        Random randomReaderID = new Random();

        Reader[] readers = new Reader[3];
        readers[0] = new Reader("Петров В. В.", randomReaderID.nextInt(10000), "Math", 250590, 25921041);
        readers[1] = new Reader("Иванов А. В.", randomReaderID.nextInt(10000), "Math", 250590, 25921041);
        readers[2] = new Reader("Борзов В. В.", randomReaderID.nextInt(10000), "Math", 250590, 25921041);


        for (Reader reader : readers) {
            System.out.println(reader);
        }
    }
}
