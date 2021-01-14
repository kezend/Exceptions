import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream file1 = new FileInputStream("file1.txt.txt"), file2 = new FileInputStream("file2.txt.txt");
        Scanner sc = new Scanner(file1), sc1 = new Scanner(file2);

        int symbolsFile1, symbolsFile2;

        while((symbolsFile1 = file1.read()) != - 1 && (symbolsFile2 = file2.read()) != - 1){
            if (symbolsFile1 != symbolsFile2){
                System.out.println((char) symbolsFile1 + "!=" + (char) symbolsFile2);
            }
        }

        file1.close();
        file2.close();
    }

}
