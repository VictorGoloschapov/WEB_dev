package Java_training_projects.library_visitors;

import java.util.Scanner;
import java.util.Random;
public class Reader {
    private String fullName;
    private int readerID;
    private String faculty;
    private int dateOfBirth;
    private int phoneNumber;

    public Reader(String fullName, int readerID, String faculty, int dateOfBirth, int phoneNumber) {
        this.fullName = fullName;
        this.readerID = readerID;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getReaderID() {
        return readerID;
    }

    public void setReaderID(int readerID) {
        this.readerID = readerID;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Reader { " +
                "fullName='" + fullName + '\'' +
                ", readerID=" + readerID +
                ", faculty='" + faculty + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
