import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;



public class Game {
    static Scanner scanner = new Scanner(System.in);

    static void start(){
        Field.putNumberOfFieldIndexIntoList();

        askForMove();
        //random start

        //make AI block player if player have already 2 in a row
        //check best decision for AI.    Random if field is empty at the begining
        //check if there is 3 in a row for either player and AI
    }
    static void askForMove(){
        updateIndexes();
        System.out.println(Field.defaultField);
        System.out.println("Wpisz numer w który chcesz wstawić X: ");
        checkIfSelectedFieldIsEmpty(scanner.nextInt());

        checkForThreeInARow();
        AI.checkForCriticalPoint();
        System.out.println(Field.defaultField);

    }

    private static void checkIfSelectedFieldIsEmpty(int Selected) {


        updateIndexes();


        System.out.println("Wielkosc listy X,O :"+AI.XIndexes.size() + ", " + AI.OIndexes.size());
        System.out.println("XIndexes:");
        System.out.println(AI.XIndexes);
        System.out.println("OIndexes:");
        System.out.println(AI.OIndexes);

        int i=0;
        do{
            if(AI.XIndexes.size()==0){System.out.println("Wolne "); Field.update(Selected,true);}

            else if (Integer.toString(Selected).contains(AI.XIndexes.get(i))) {
                System.out.println("Pole jest zajete!");askForMove();
            } else {
                System.out.println(Integer.toString(Selected));
                System.out.println("X:"+i+AI.XIndexes.get(i));
                System.out.println("Wolne "); Field.update(Selected,true);            }

        i++;
        }while(i<AI.XIndexes.size());


        i=0;
        do{
            if(AI.OIndexes.size()==0){System.out.println("Wolne "); Field.update(Selected,true);}

            else if (Integer.toString(Selected).contains(AI.OIndexes.get(i))) {
                System.out.println("Pole jest zajete!");askForMove();
            } else {
               // System.out.println(Integer.toString(Selected));

                 Field.update(Selected,true);            }

            i++;
        }while(i<AI.OIndexes.size());

    }

    public static void updateIndexes() {
        AI.OIndexes.clear();
        AI.XIndexes.clear();

        for (int i=1;i<=9;i++)
        {
            System.out.println(Field.defaultField.charAt(  Integer.parseInt(   Field.numberOfFieldIndex[i] )  ));
            if (Field.defaultField.charAt(  Integer.parseInt(   Field.numberOfFieldIndex[i] )  )=='X')     {
                AI.XIndexes.add(Integer.toString(i));}
            if (Field.defaultField.charAt(  Integer.parseInt(   Field.numberOfFieldIndex[i])  )=='O')     {
                AI.OIndexes.add(Integer.toString(i));}
        }
    }

    static void checkForThreeInARow()
    {

        if (((Field.defaultField.charAt(2)=='X')&&Field.defaultField.charAt(8)=='X')&&Field.defaultField.charAt(13)=='X'){gameOver("X");}
        if (((Field.defaultField.charAt(31)=='X')&&Field.defaultField.charAt(37)=='X')&&Field.defaultField.charAt(42)=='X'){gameOver("X");}
        if (((Field.defaultField.charAt(60)=='X')&&Field.defaultField.charAt(66)=='X')&&Field.defaultField.charAt(71)=='X'){gameOver("X");}
        if (((Field.defaultField.charAt(2)=='X')&&Field.defaultField.charAt(37)=='X')&&Field.defaultField.charAt(71)=='X'){gameOver("X");}
        if (((Field.defaultField.charAt(60)=='X')&&Field.defaultField.charAt(37)=='X')&&Field.defaultField.charAt(13)=='X'){gameOver("X");}

        if (((Field.defaultField.charAt(2)=='O')&&Field.defaultField.charAt(8)=='O')&&Field.defaultField.charAt(13)=='O'){gameOver("O");}
        if (((Field.defaultField.charAt(31)=='O')&&Field.defaultField.charAt(37)=='O')&&Field.defaultField.charAt(42)=='O'){gameOver("O");}
        if (((Field.defaultField.charAt(60)=='O')&&Field.defaultField.charAt(66)=='O')&&Field.defaultField.charAt(71)=='O'){gameOver("O");}
        if (((Field.defaultField.charAt(2)=='O')&&Field.defaultField.charAt(37)=='O')&&Field.defaultField.charAt(71)=='O'){gameOver("O");}
        if (((Field.defaultField.charAt(60)=='O')&&Field.defaultField.charAt(37)=='O')&&Field.defaultField.charAt(13)=='O'){gameOver("O");}

        checkForFreeSpace();
    }

    private static void checkForFreeSpace() {
        int busyFields=0;
        for (int i=1;i<=9;i++)
        {
            if (Character.toString(Field.defaultField.charAt(  Integer.parseInt(Field.numberOfFieldIndex[i])   )).contains("X") ||


                    Character.toString(Field.defaultField.charAt(  Integer.parseInt(Field.numberOfFieldIndex[i])   )).contains("O")){
                busyFields++;}
        }

        if(busyFields==9) { gameOver("Nikt nie");}
    }

    private static void gameOver(String winner) {
        System.out.println(winner +" wygrywa");
       // scanner.next();
        AI.OIndexes.clear();
        AI.XIndexes.clear();
        Field.defaultField = "\n" +
                " 1  |  2  | 3\n" +
                "----|-----|---\n" +
                " 4  |  5  | 6\n" +
                "----|-----|---\n" +
                " 7  |  8  | 9";
        System.out.println(Field.defaultField);
    }
}
