package lesson3;

import java.util.Random;
import java.util.Scanner;

public class HW3 {
    public static final char GAMER = 'Х';
    public static final Scanner scanGamer= new Scanner(System.in);

    public static final char COMP = '0';
    public static final Random RANDOM= new Random();

    public static final char NOTHING = '_';

    public static char[][] desk;
    public static int deskX;
    public static int deskY;


    public static void createDesk() {
        deskY = 3;
        deskX = 3;
        desk = new char[deskY][deskX];

        for (int y = 0; y < deskY; y++) {
            for (int x = 0; x < deskX; x++) {
                desk[y][x] = NOTHING;
            }
        }
    }

    public static void showDesk() {
        for (int y = 0; y < deskY; y++) {
            for (int x = 0; x < deskX; x++) {
                System.out.print (desk[y][x] + "| ");
            }
            System.out.println ();
        }
        System.out.println ();

 }



    public static boolean checkDesk(int y,int x)
    {
        return x>=0 && x<deskX && y>=0 && y<deskY;
    }
    public static boolean checkSymbol (int y, int x)
    {
        return desk[y][x]==NOTHING;
    }



    public static void gamerStep ()
    {
        int x;
        int y;

        do {
            System.out.println("Введи координаты X:");
            x = scanGamer.nextInt()-1;
            System.out.println("Введи координаты Y:");
            y = scanGamer.nextInt()-1;
        } while (!checkDesk(y,x) || !checkSymbol(y,x));

        desk[y][x]=GAMER;
    }

    public static void compStep ()
    {
        int x;
        int y;

        do {
            x=RANDOM.nextInt(deskX);
            y=RANDOM.nextInt(deskY);
        } while (!checkSymbol(y,x));

        desk[y][x]=COMP;
    }

    public static boolean isWin (char inboxChar) {
        if (desk[0][0] == inboxChar && desk[0][1] == inboxChar && desk[0][2] == inboxChar) return true;
        if (desk[1][0] == inboxChar && desk[1][1] == inboxChar && desk[1][2] == inboxChar) return true;
        if (desk[2][0] == inboxChar && desk[2][1] == inboxChar && desk[2][2] == inboxChar) return true;

        if (desk[0][0] == inboxChar && desk[1][0] == inboxChar && desk[2][0] == inboxChar) return true;
        if (desk[0][1] == inboxChar && desk[1][1] == inboxChar && desk[2][1] == inboxChar) return true;
        if (desk[0][2] == inboxChar && desk[1][2] == inboxChar && desk[2][2] == inboxChar) return true;

        if (desk[0][0] == inboxChar && desk[1][1] == inboxChar && desk[2][2] == inboxChar) return true;
        if (desk[0][2] == inboxChar && desk[1][1] == inboxChar && desk[2][0] == inboxChar) return true;
        return false;
    }

    public static boolean isDeskFull ()
    {
        for (int y = 0; y < deskY; y++)
        {
            for (int x = 0; x < deskX; x++)
            {
                if (desk[y][x]==NOTHING) return false;

            }
        }
        return true;
    }


    public static void main(String[] args) {

        createDesk();
        showDesk();

        while (true) {
            gamerStep();
            showDesk();
            if (isWin(GAMER))
            {
                System.out.println("Ты победил! Возьми с полки пирожок;)");
            break;}
            if (isDeskFull()){
                System.out.println("Ничья!");
            break;}
            compStep();
            showDesk();
            if (isWin(COMP))
            {
                System.out.println("Ты проиграл. ПечалькО:(");
                break;}
            if (isDeskFull()){
                System.out.println("Ничья!");
                break;}
        }
    }




}



