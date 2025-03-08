package org.example;

public class Destroyer extends Vessel {
    private VesselPart[] vesselPart= new VesselPart[2];

    public Destroyer(){
    }
    public Destroyer(int lifePart){
        for(int i=0;i<2;i++) {
            vesselPart[i].setLife(lifePart);
        }
    }
    //Esta función actualiza el estado de la embarcación, si está hundido o no
    public void updateState(){
        int counter=0;
        for(int i=0;i<1;i++) {
            if(vesselPart[i].getIsDamaged()==true){
                counter=counter+1;
            }
        }
        if(counter==2){
            isFallen=true;
        }
    }
    //Esta función busca la parte de la embarcación que fue atacada mediante coordenadas y si coinciden
    //el barco recibirá el daño y retornará false, pero si también se detecta que el barco está hundido se retornará true.
    //Esto permite que luego se pueda ajustar la vida de las partes de los barcos y funcione perfectamente.
    @Override
    public boolean searchAttackedPart(int x, int y){
        for(int i=0;i<1;i++){
            if (vesselPart[i].getX()==x && vesselPart[i].getY()==y){
                vesselPart[i].receiveAttack(1);
                if(vesselPart[i].getIsDamaged()==true) {
                    return true;
                }
            }
        }
        return false;
    }
}
