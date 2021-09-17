package edu.albany.cargo;

import edu.albany.problem1.Ship;

public class CargoShip extends Ship{
    
    private int cargocapacity;

    public CargoShip(String newshipname, String newyearbuilt, int newcargocapacity){

        super(newshipname, newyearbuilt);

        setcargocapacity(newcargocapacity);

    }

   
    public int getcargocapacity(){

        return this.cargocapacity;

    }

    public void setcargocapacity(int newcargocapacity){

        this.cargocapacity = newcargocapacity;

    }

    @Override
    public String toString(){
        return "Ship name " + this.getshipname() + "\nCargo capacity " + this.getcargocapacity();
    }
}
