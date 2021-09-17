package edu.albany.cruise;

import edu.albany.problem1.Ship;

public class CruiseShip extends Ship{
    
    private int maxpassengers;

    public CruiseShip(String newshipname, String newyearbuilt, int newmaxpassengers){

        super(newshipname, newyearbuilt);

        setmaxpassengers(newmaxpassengers);
    }

    public int getmaxpassengers(){

        return this.maxpassengers;

    }

    public void setmaxpassengers(int newmaxpassengers){

        this.maxpassengers = newmaxpassengers;

    }

    @Override
    public String toString(){
        return "Ship name: " + this.getshipname() + "\nMaximum passengers: " + this.getmaxpassengers();
    }
}
