package org.example;

public abstract class Player {
    protected String name;
    protected String playerType;
    protected int turnsNumber=0; //Este es el número de turnos que lleva el jugador que inicia en 0.
    protected boolean itIsMyTurn=false; //Este atributo bool, permite saber si es el turno del jugador o no.
    protected Board myBoard;
    public Player(){}
    public Player(String name,String playerType,int turnsNumber,boolean itIsMyTurn, Board myBoard){
        this.name=name;
        this.playerType=playerType;
        this.turnsNumber=turnsNumber;
        this.itIsMyTurn=itIsMyTurn;
        this.myBoard=myBoard;
    }
}
