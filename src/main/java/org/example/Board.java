package org.example;
// Esta clase representa el tablero que tendrán ambos jugadores
public class Board {
    private char[][] board;

    public Board(){
    }
    //En el constructor, dependiendo de la dificultad que se le pase por parámetro,
    //también cambiará el tamaño de la matriz.
    //La matriz también se llenará con A para cada posición, que indica que hay Agua
    public Board(int difficultyBoard){
        if (difficultyBoard ==1){
            board=new char[8][8];
            for(int f=0;f<8;f++){

                for(int c=0;c<8;c++){
                    board[f][c]='A';
                }
            }
        }
        else if (difficultyBoard ==2){
            board=new char[12][12];
            for(int f=0;f<12;f++){

                for(int c=0;c<12;c++){
                    board[f][c]='A';
                }
            }
        }
        else if (difficultyBoard ==3){
            board=new char[16][16];
            for(int f=0;f<16;f++){

                for(int c=0;c<16;c++){
                    board[f][c]='A';
                }
            }
        }
    }
}

