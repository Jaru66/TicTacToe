public class Field {
    public static String defaultField = "\n" +
            " 1  |  2  | 3\n" +
            "----|-----|---\n" +
            " 4  |  5  | 6\n" +
            "----|-----|---\n" +
            " 7  |  8  | 9";
    public static String[] numberOfFieldIndex = new String[10];
    static void update(int fieldNumber, boolean isX) {
        //String[] numberOfFieldIndex = new String[9];
        numberOfFieldIndex[1] = "2";
        numberOfFieldIndex[2] = "8";
        numberOfFieldIndex[3] = "13";
        numberOfFieldIndex[4] = "31";
        numberOfFieldIndex[5] = "37";
        numberOfFieldIndex[6] = "42";
        numberOfFieldIndex[7] = "60";
        numberOfFieldIndex[8] = "66";
        numberOfFieldIndex[9] = "71";

        String givenSign;
        if (isX) {
            givenSign = "X";
        } else givenSign = "O";
        String stringOfFieldNumber = Integer.toString(fieldNumber);
        defaultField = defaultField.replace(stringOfFieldNumber,givenSign);

    }
}


//int nextMove=99;
//     if(Field.numberOfFieldIndex[1].equals("X")&&Field.numberOfFieldIndex[2].equals("X")&&Field.numberOfFieldIndex[3].equals("13)")){nextMove=3;}
//else if(Field.numberOfFieldIndex[3].equals("X")&&Field.numberOfFieldIndex[2].equals("X")&&Field.numberOfFieldIndex[1].equals("2")){nextMove=1;}
//else if(Field.numberOfFieldIndex[3].equals("X")&&Field.numberOfFieldIndex[1].equals("X")&&Field.numberOfFieldIndex[2].equals("8")){nextMove=2;}
//
//else if(Field.numberOfFieldIndex[4].equals("X")&&Field.numberOfFieldIndex[5].equals("X")&&Field.numberOfFieldIndex[6].equals("42)")){nextMove=6;}
//else if(Field.numberOfFieldIndex[4].equals("X")&&Field.numberOfFieldIndex[6].equals("X")&&Field.numberOfFieldIndex[5].equals("37)")){nextMove=5;}
//else if(Field.numberOfFieldIndex[5].equals("X")&&Field.numberOfFieldIndex[6].equals("X")&&Field.numberOfFieldIndex[4].equals("37)")){nextMove=4;}
//
//else if(Field.numberOfFieldIndex[7].equals("X")&&Field.numberOfFieldIndex[8].equals("X")&&Field.numberOfFieldIndex[9].equals("71)")){nextMove=9;}
//else if(Field.numberOfFieldIndex[8].equals("X")&&Field.numberOfFieldIndex[9].equals("X")&&Field.numberOfFieldIndex[7].equals("60)")){nextMove=7;}
//else if(Field.numberOfFieldIndex[7].equals("X")&&Field.numberOfFieldIndex[9].equals("X")&&Field.numberOfFieldIndex[8].equals("66)")){nextMove=8;}
//
//else if(Field.numberOfFieldIndex[1].equals("X")&&Field.numberOfFieldIndex[4].equals("X")&&Field.numberOfFieldIndex[7].equals("60)")){nextMove=7;}
//else if(Field.numberOfFieldIndex[7].equals("X")&&Field.numberOfFieldIndex[1].equals("X")&&Field.numberOfFieldIndex[4].equals("31)")){nextMove=4;}
//else if(Field.numberOfFieldIndex[4].equals("X")&&Field.numberOfFieldIndex[7].equals("X")&&Field.numberOfFieldIndex[1].equals("2")){nextMove=1;}
//
//else if(Field.numberOfFieldIndex[2].equals("X")&&Field.numberOfFieldIndex[5].equals("X")&&Field.numberOfFieldIndex[8].equals("66)")){nextMove=8;}
//else if(Field.numberOfFieldIndex[8].equals("X")&&Field.numberOfFieldIndex[2].equals("X")&&Field.numberOfFieldIndex[5].equals("37)")){nextMove=5;}
//else if(Field.numberOfFieldIndex[8].equals("X")&&Field.numberOfFieldIndex[5].equals("X")&&Field.numberOfFieldIndex[2].equals("8")){nextMove=2;}
//
//
//else if(Field.numberOfFieldIndex[3].equals("X")&&Field.numberOfFieldIndex[6].equals("X")&&Field.numberOfFieldIndex[9].equals("70)")){nextMove=9;}
//else if(Field.numberOfFieldIndex[3].equals("X")&&Field.numberOfFieldIndex[9].equals("X")&&Field.numberOfFieldIndex[6].equals("42)")){nextMove=6;}
//else if(Field.numberOfFieldIndex[9].equals("X")&&Field.numberOfFieldIndex[6].equals("X")&&Field.numberOfFieldIndex[3].equals("13)")){nextMove=3;}
//
//
//else if(Field.numberOfFieldIndex[1].equals("X")&&Field.numberOfFieldIndex[5].equals("X")&&Field.numberOfFieldIndex[9].equals("71)")){nextMove=9;}
//else if(Field.numberOfFieldIndex[1].equals("X")&&Field.numberOfFieldIndex[9].equals("X")&&Field.numberOfFieldIndex[5].equals("37)")){nextMove=5;}
//else if(Field.numberOfFieldIndex[5].equals("X")&&Field.numberOfFieldIndex[9].equals("X")&&Field.numberOfFieldIndex[1].equals("2")){nextMove=1;}
//
//else if(Field.numberOfFieldIndex[7].equals("X")&&Field.numberOfFieldIndex[5].equals("X")&&Field.numberOfFieldIndex[3].equals("13)")){nextMove=3;}
//else if(Field.numberOfFieldIndex[5].equals("X")&&Field.numberOfFieldIndex[3].equals("X")&&Field.numberOfFieldIndex[7].equals("60)")){nextMove=7;}
//else if(Field.numberOfFieldIndex[7].equals("X")&&Field.numberOfFieldIndex[3].equals("X")&&Field.numberOfFieldIndex[5].equals("37)")){nextMove=5;}