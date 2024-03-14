package model;

public class GuestUser {

    private double generatedID;

    private static long counter = 0;


    public double getGeneratedID() {
        return generatedID;
    }

    public void setGeneratedID() {
        this.generatedID = counter;
        counter++;
    }

    public GuestUser(){
        setGeneratedID();
    }

    @Override
    public String toString() {
        return " " + generatedID;
    }

    
}
