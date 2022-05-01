import java.util.ArrayList;

public class AI {
    static ArrayList<String> XIndexes = new ArrayList<String>();
    static ArrayList<String> OIndexes = new ArrayList<String>();
    public static void checkForCriticalPoint(){




        int nextMove=1000;
             if(XIndexes.contains(Field.numberOfFieldIndex[1])&&XIndexes.contains(Field.numberOfFieldIndex[2])&&Field.defaultField.charAt(13)=='3'){nextMove=3;}
        else if(XIndexes.contains(Field.numberOfFieldIndex[3])&&XIndexes.contains(Field.numberOfFieldIndex[2])&&Field.defaultField.charAt(2)=='1'){nextMove=1;}
        else if(XIndexes.contains(Field.numberOfFieldIndex[3])&&XIndexes.contains(Field.numberOfFieldIndex[1])&&Field.defaultField.charAt(8)=='2'){nextMove=2;}

        else if(XIndexes.contains(Field.numberOfFieldIndex[4])&&XIndexes.contains(Field.numberOfFieldIndex[5])&&Field.defaultField.charAt(42)=='6'){nextMove=6;}
        else if(XIndexes.contains(Field.numberOfFieldIndex[4])&&XIndexes.contains(Field.numberOfFieldIndex[6])&&Field.defaultField.charAt(37)=='5'){nextMove=5;}
        else if(XIndexes.contains(Field.numberOfFieldIndex[5])&&XIndexes.contains(Field.numberOfFieldIndex[6])&&Field.defaultField.charAt(31)=='4'){nextMove=4;}

        else if(XIndexes.contains(Field.numberOfFieldIndex[7])&&XIndexes.contains(Field.numberOfFieldIndex[8])&&Field.defaultField.charAt(71)=='9'){nextMove=9;}
        else if(XIndexes.contains(Field.numberOfFieldIndex[8])&&XIndexes.contains(Field.numberOfFieldIndex[9])&&Field.defaultField.charAt(60)=='7'){nextMove=7;}
        else if(XIndexes.contains(Field.numberOfFieldIndex[7])&&XIndexes.contains(Field.numberOfFieldIndex[9])&&Field.defaultField.charAt(66)=='8'){nextMove=8;}

        else if(XIndexes.contains(Field.numberOfFieldIndex[1])&&XIndexes.contains(Field.numberOfFieldIndex[4])&&Field.defaultField.charAt(60)=='7'){nextMove=7;}
        else if(XIndexes.contains(Field.numberOfFieldIndex[7])&&XIndexes.contains(Field.numberOfFieldIndex[1])&&Field.defaultField.charAt(31)=='4'){nextMove=4;}
        else if(XIndexes.contains(Field.numberOfFieldIndex[4])&&XIndexes.contains(Field.numberOfFieldIndex[7])&&Field.defaultField.charAt(2)=='1'){nextMove=1;}

        else if(XIndexes.contains(Field.numberOfFieldIndex[2])&&XIndexes.contains(Field.numberOfFieldIndex[5])&&Field.defaultField.charAt(66)=='8'){nextMove=8;}
        else if(XIndexes.contains(Field.numberOfFieldIndex[8])&&XIndexes.contains(Field.numberOfFieldIndex[2])&&Field.defaultField.charAt(37)=='5'){nextMove=5;}
        else if(XIndexes.contains(Field.numberOfFieldIndex[8])&&XIndexes.contains(Field.numberOfFieldIndex[5])&&Field.defaultField.charAt(8)=='2'){nextMove=2;}


        else if(XIndexes.contains(Field.numberOfFieldIndex[3])&&XIndexes.contains(Field.numberOfFieldIndex[6])&&Field.defaultField.charAt(70)=='9'){nextMove=9;}
        else if(XIndexes.contains(Field.numberOfFieldIndex[3])&&XIndexes.contains(Field.numberOfFieldIndex[9])&&Field.defaultField.charAt(42)=='6'){nextMove=6;}
        else if(XIndexes.contains(Field.numberOfFieldIndex[9])&&XIndexes.contains(Field.numberOfFieldIndex[6])&&Field.defaultField.charAt(13)=='3'){nextMove=3;}


        else if(XIndexes.contains(Field.numberOfFieldIndex[1])&&XIndexes.contains(Field.numberOfFieldIndex[5])&&Field.defaultField.charAt(71)=='9'){nextMove=9;}
        else if(XIndexes.contains(Field.numberOfFieldIndex[1])&&XIndexes.contains(Field.numberOfFieldIndex[9])&&Field.defaultField.charAt(37)=='5'){nextMove=5;}
        else if(XIndexes.contains(Field.numberOfFieldIndex[5])&&XIndexes.contains(Field.numberOfFieldIndex[9])&&Field.defaultField.charAt(2)=='1'){nextMove=1;}

        else if(XIndexes.contains(Field.numberOfFieldIndex[7])&&XIndexes.contains(Field.numberOfFieldIndex[5])&&Field.defaultField.charAt(13)=='3'){nextMove=3;}
        else if(XIndexes.contains(Field.numberOfFieldIndex[5])&&XIndexes.contains(Field.numberOfFieldIndex[3])&&Field.defaultField.charAt(60)=='7'){nextMove=7;}
        else if(XIndexes.contains(Field.numberOfFieldIndex[7])&&XIndexes.contains(Field.numberOfFieldIndex[3])&&Field.defaultField.charAt(37)=='5'){nextMove=5;}

        else{findGoodMove();}

        //PUT ROUND TO BLOCK PLAYER
        Field.defaultField = Field.defaultField.replace(Integer.toString(nextMove),"O")   ;
        System.out.println(Field.defaultField);
        Game.checkForThreeInARow();
        Game.askForMove();
    }

    private static void findGoodMove() {
        int nextMove=1000;
        System.out.println(XIndexes.size());
        if(XIndexes.size()<2&&Field.defaultField.charAt(37)=='5'){
            Field.defaultField = Field.defaultField.replace("5","O");
            System.out.println(Field.defaultField);
            Game.checkForThreeInARow();
            Game.askForMove();
        }














         if(OIndexes.contains(Field.numberOfFieldIndex[1])&&OIndexes.contains(Field.numberOfFieldIndex[2])&&Field.defaultField.charAt(13)=='3'){nextMove=3;}
        else if(OIndexes.contains(Field.numberOfFieldIndex[3])&&OIndexes.contains(Field.numberOfFieldIndex[2])&&Field.defaultField.charAt(2)=='1'){nextMove=1;}
        else if(OIndexes.contains(Field.numberOfFieldIndex[3])&&OIndexes.contains(Field.numberOfFieldIndex[1])&&Field.defaultField.charAt(8)=='2'){nextMove=2;}

        else if(OIndexes.contains(Field.numberOfFieldIndex[4])&&OIndexes.contains(Field.numberOfFieldIndex[5])&&Field.defaultField.charAt(42)=='6'){nextMove=6;}
        else if(OIndexes.contains(Field.numberOfFieldIndex[4])&&OIndexes.contains(Field.numberOfFieldIndex[6])&&Field.defaultField.charAt(37)=='5'){nextMove=5;}
        else if(OIndexes.contains(Field.numberOfFieldIndex[5])&&OIndexes.contains(Field.numberOfFieldIndex[6])&&Field.defaultField.charAt(31)=='4'){nextMove=4;}

        else if(OIndexes.contains(Field.numberOfFieldIndex[7])&&OIndexes.contains(Field.numberOfFieldIndex[8])&&Field.defaultField.charAt(71)=='9'){nextMove=9;}
        else if(OIndexes.contains(Field.numberOfFieldIndex[8])&&OIndexes.contains(Field.numberOfFieldIndex[9])&&Field.defaultField.charAt(60)=='7'){nextMove=7;}
        else if(OIndexes.contains(Field.numberOfFieldIndex[7])&&OIndexes.contains(Field.numberOfFieldIndex[9])&&Field.defaultField.charAt(66)=='8'){nextMove=8;}

        else if(OIndexes.contains(Field.numberOfFieldIndex[1])&&OIndexes.contains(Field.numberOfFieldIndex[4])&&Field.defaultField.charAt(60)=='7'){nextMove=7;}
        else if(OIndexes.contains(Field.numberOfFieldIndex[7])&&OIndexes.contains(Field.numberOfFieldIndex[1])&&Field.defaultField.charAt(31)=='4'){nextMove=4;}
        else if(OIndexes.contains(Field.numberOfFieldIndex[4])&&OIndexes.contains(Field.numberOfFieldIndex[7])&&Field.defaultField.charAt(2)=='1'){nextMove=1;}

        else if(OIndexes.contains(Field.numberOfFieldIndex[2])&&OIndexes.contains(Field.numberOfFieldIndex[5])&&Field.defaultField.charAt(66)=='8'){nextMove=8;}
        else if(OIndexes.contains(Field.numberOfFieldIndex[8])&&OIndexes.contains(Field.numberOfFieldIndex[2])&&Field.defaultField.charAt(37)=='5'){nextMove=5;}
        else if(OIndexes.contains(Field.numberOfFieldIndex[8])&&OIndexes.contains(Field.numberOfFieldIndex[5])&&Field.defaultField.charAt(8)=='2'){nextMove=2;}


        else if(OIndexes.contains(Field.numberOfFieldIndex[3])&&OIndexes.contains(Field.numberOfFieldIndex[6])&&Field.defaultField.charAt(70)=='9'){nextMove=9;}
        else if(OIndexes.contains(Field.numberOfFieldIndex[3])&&OIndexes.contains(Field.numberOfFieldIndex[9])&&Field.defaultField.charAt(42)=='6'){nextMove=6;}
        else if(OIndexes.contains(Field.numberOfFieldIndex[9])&&OIndexes.contains(Field.numberOfFieldIndex[6])&&Field.defaultField.charAt(13)=='3'){nextMove=3;}


        else if(OIndexes.contains(Field.numberOfFieldIndex[1])&&OIndexes.contains(Field.numberOfFieldIndex[5])&&Field.defaultField.charAt(71)=='9'){nextMove=9;}
        else if(OIndexes.contains(Field.numberOfFieldIndex[1])&&OIndexes.contains(Field.numberOfFieldIndex[9])&&Field.defaultField.charAt(37)=='5'){nextMove=5;}
        else if(OIndexes.contains(Field.numberOfFieldIndex[5])&&OIndexes.contains(Field.numberOfFieldIndex[9])&&Field.defaultField.charAt(2)=='1'){nextMove=1;}

        else if(OIndexes.contains(Field.numberOfFieldIndex[7])&&OIndexes.contains(Field.numberOfFieldIndex[5])&&Field.defaultField.charAt(13)=='3'){nextMove=3;}
        else if(OIndexes.contains(Field.numberOfFieldIndex[5])&&OIndexes.contains(Field.numberOfFieldIndex[3])&&Field.defaultField.charAt(60)=='7'){nextMove=7;}
        else if(OIndexes.contains(Field.numberOfFieldIndex[7])&&OIndexes.contains(Field.numberOfFieldIndex[3])&&Field.defaultField.charAt(37)=='5'){nextMove=5;}

            for(int i=1;i<=9;i++)                                                                                                                                                                                                 
            {                                                                                                                                                                                                                     
                     if(Field.defaultField.charAt(2)=='1'){Field.defaultField = Field.defaultField.replace("1","O");System.out.println(Field.defaultField);Game.checkForThreeInARow();Game.askForMove();  }                       
                else if(Field.defaultField.charAt(8)=='2'){Field.defaultField = Field.defaultField.replace("2","O");System.out.println(Field.defaultField);Game.checkForThreeInARow();Game.askForMove();  }                       
               else if(Field.defaultField.charAt(13)=='3'){Field.defaultField = Field.defaultField.replace("3","O");System.out.println(Field.defaultField);Game.checkForThreeInARow();Game.askForMove();  }                       
               else if(Field.defaultField.charAt(31)=='4'){Field.defaultField = Field.defaultField.replace("4","O");System.out.println(Field.defaultField);Game.checkForThreeInARow();Game.askForMove();  }                       
               else if(Field.defaultField.charAt(42)=='6'){Field.defaultField = Field.defaultField.replace("6","O");System.out.println(Field.defaultField);Game.checkForThreeInARow();Game.askForMove();  }                       
               else if(Field.defaultField.charAt(60)=='7'){Field.defaultField = Field.defaultField.replace("7","O");System.out.println(Field.defaultField);Game.checkForThreeInARow();Game.askForMove();  }                       
               else if(Field.defaultField.charAt(66)=='8'){Field.defaultField = Field.defaultField.replace("8","O");System.out.println(Field.defaultField);Game.checkForThreeInARow();Game.askForMove();  }                       
               else if(Field.defaultField.charAt(71)=='9'){Field.defaultField = Field.defaultField.replace("9","O");System.out.println(Field.defaultField);Game.checkForThreeInARow();Game.askForMove();  }                       
            }                                                                                                                                                                                                                     
                                                                                                                                                                                                                                  
              Field.defaultField = Field.defaultField.replace(Integer.toString(nextMove),"O")   ;
              System.out.println(Field.defaultField);
              Game.checkForThreeInARow();
              Game.askForMove();
    }
}
