import java.util.Scanner;



public class Game {
    static Scanner scanner = new Scanner(System.in);

    static void start(){
        System.out.println(Field.defaultField);
        askForMove();
        //random start

        //make AI block player if player have already 2 in a row
        //check best decision for AI.    Random if field is empty at the begining
        //check if there is 3 in a row for either player and AI
    }
    static void askForMove(){

        System.out.println("Wpisz numer w który chcesz wstawić X: ");
        checkIfSelectedFieldIsEmpty(scanner.nextInt());


        checkForThreeInARow();
        AI.checkForCriticalPoint();
        System.out.println(Field.defaultField);

    }

    private static void checkIfSelectedFieldIsEmpty(int Selected) {


        for(int i=1;i<=AI.XIndexes.size();i++){

            if (Integer.toString(Selected).contains(AI.XIndexes.get(i))) {
                System.out.println("Pole jest zajete!");askForMove();
            } else Field.update(Selected,true);
        }
        for(int i=1;i<=AI.OIndexes.size();i++){

            if (Integer.toString(Selected).contains(AI.OIndexes.get(i))) {
                System.out.println("Pole jest zajete!");askForMove();
            } else Field.update(Selected,true);
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
        String x ="X";
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
