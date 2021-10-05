package edu.citytech.cst.tictactoe.model;

import java.util.Arrays;

public class WinnerStatus {
    private boolean winner;
    private int[] position;
    private String whoWon;

    public WinnerStatus() {

    }

    public WinnerStatus(boolean winner, int[] position, String whoWon) {
        this.winner = winner;
        this.position = position;
        this.whoWon = whoWon;
    }

    public boolean isWinner() {
        return winner;
    }

    public void setWinner(boolean winner) {
        this.winner = winner;
    }

    public int[] getPosition() {
        return position;
    }

    public void setPosition(int[] position) {
        this.position = position;
    }

    public String getWhoWon() {
        return whoWon;
    }

    public void setWhoWon(String whoWon) {
        this.whoWon = whoWon;
    }

    @Override
    public String toString() {
        return "WinnerStatus{" +
                "winner=" + winner +
                ", position=" + Arrays.toString(position) +
                ", whoWon='" + whoWon + '\'' +
                '}';
    }
}