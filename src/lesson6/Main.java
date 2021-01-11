package lesson6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.sql.Struct;

public class Main {
public static void main (String[] args) {
    try {
        FileOutputStream fos1 = new FileOutputStream("text1.txt");
        PrintStream ps1 = new PrintStream(fos1);
        ps1.println("Это текст первого файла, который необходимо склеить со вторым...");
        ps1.close();
    } catch (IOException e) {
        e.printStackTrace();
    }


    try {
        FileOutputStream fos2 = new FileOutputStream("text2.txt");
        PrintStream ps2 = new PrintStream(fos2);
        ps2.println("А это текст второго файла, который необходимо склеить с первым...");
        ps2.close();
    } catch (IOException e) {
        e.printStackTrace();
    }





        try {
            FileInputStream fis1 = new FileInputStream("text1.txt");
            FileInputStream fis2 = new FileInputStream("text2.txt");
            FileOutputStream fos3 = new FileOutputStream("text3.txt");
            PrintStream ps3 = new PrintStream(fos3);

            int outbox1;
            int outbox2;

            while ((outbox1 = fis1.read()) != -1 )
            {
                ps3.write((char) outbox1);
            }
            fis1.close();


            while ((outbox2 = fis2.read()) != -1)
            {
                ps3.write((char) outbox2);
            }
            fis2.close();

            ps3.close();


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

