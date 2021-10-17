package edu.citytech.cst.tictactoe.game.businessobject;

import edu.citytech.cst.tictactoe.game.model.WinnerStatus;

public class Winner {
    public WinnerStatus getWinnerStatus(String moves){
        int pos[];
        boolean win;
        String letterWinner = "";


//        String data[] = moves.split("");
//
//
//        if(data[0].equals(data[1]) && data[0].equals(data[2]) && !data[0].equals("N")){
//            win = true;
//            pos= new int[]{0, 1, 2};
//            letterWinner = data[0];
//        }else if(data[3].equals(data[4]) && data[3].equals(data[5]) && !data[3].equals("N")){
//            win = true;
//            pos= new int[]{3, 4, 5};
//            letterWinner = data[3];
//        }else if(data[6].equals(data[7]) && data[6].equals(data[8]) && !data[6].equals("N")){
//            win = true;
//            pos= new int[]{6, 7, 8};
//            letterWinner = data[6];
//        }else if(data[0].equals(data[3]) && data[0].equals(data[6]) && !data[0].equals("N")){
//            win = true;
//            pos= new int[]{6, 7, 8};
//            letterWinner = data[6];
//        }
//        else if(data[1].equals(data[4]) && data[1].equals(data[7]) && !data[1].equals("N")){
//            win = true;
//            pos= new int[]{1, 4, 7};
//            letterWinner = data[6];
//        }else {
//            win = false;
//            pos = new int[]{};
//            letterWinner = null;
//        }
//        0,1,2
//        3,4,5
//        6,7,8
//
//        0,3,6
//        1,4,7
//        2,5,8
//
//        0,4,8
//        2,4,6
//
//
//        var winner = new WinnerStatus();
//        winner = new WinnerStatus(win, pos,letterWinner);
//        return winner;























        String data[] = moves.split("");

        if(checkMoves(0,1,2, data)){
            win = true;
            pos = new int[]{0, 1, 2};
            letterWinner = data[0];
        }else if(checkMoves(3,4,5, data)){
            win = true;
            pos = new int[]{3,4,5};
            letterWinner = data[3];
        }else if(checkMoves(6,7,8, data)){
            win = true;
            pos = new int[]{6,7,8};
            letterWinner = data[6];
        }else if(checkMoves(0,3,6, data)){
            win = true;
            pos = new int[]{0,3,6};
            letterWinner = data[0];
        }else if(checkMoves(1,4,7, data)){
            win = true;
            pos = new int[]{1,4,7};
            letterWinner = data[1];
        }else if(checkMoves(2,5,8, data)){
            win = true;
            pos = new int[]{2,5,8};
            letterWinner = data[2];
        }else if(checkMoves(0,4,8, data)){
            win = true;
            pos = new int[]{0,4,8};
            letterWinner = data[0];
        }else if(checkMoves(2,4,6, data)){
            win = true;
            pos = new int[]{2,4,6};
            letterWinner = data[2];
        }else {
            win = false;
            pos = new int[]{};
            letterWinner = "No Winner";
        }









        var winner = new WinnerStatus();
        winner = new WinnerStatus(win, pos,letterWinner);
        return winner;

    }


















    static boolean checkMoves (int p1, int p2, int p3, String[] data){
        boolean result;
        if (data[p1].equals(data[p2]) && data[p1].equals(data[p3]) && !data[p1].equals("N")){
            result = true;
        }else {
            result = false;
        }
        return result;
    }
}
