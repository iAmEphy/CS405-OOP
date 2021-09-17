package edu.albany.problem1;


public class Ship{
    
    private String shipname;

    private String yearbuilt;

    public Ship(String newshipname, String newyearbuilt){
        set_ship_name(newshipname);
        set_year_built(newyearbuilt);
    }

    
    public String getshipname(){

        return this.shipname;

    }
    public String getyearbuilt(){

        return this.yearbuilt;

    }

   
    public void setshipname(String newshipname){

        this.shipname = newshipname;

    }
    public void setyearbuilt(String newyearbuilt){

        this.yearbuilt = newyearbuilt;

    }

    public String toString(){
        return "Ship name " + this.getshipname() + "\nYear built " + this.getyearbuilt();
    }
}
