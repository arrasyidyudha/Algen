/*
* City.java
* Models a city
*/

// Kelas ini digunakan untuk merepresentasikan gen pada masing individu

package tsp;

public class City {
    int x;
    int y;
    String label;
    
    // Constructs a randomly placed city
    public City(){
        this.x = (int)(Math.random()*20);
        this.y = (int)(Math.random()*20);
    }

    public String getLabel(){
        return label;
    }

    public void setLabel(String x){
        label=x;
    }
    
    // Constructs a city at chosen x, y location
    public City(int x, int y, String label){
        this.x = x;
        this.y = y;
        this.label= label;
    }
    
    // Gets city's x coordinate
    public int getX(){
        return this.x;
    }
    
    // Gets city's y coordinate
    public int getY(){
        return this.y;
    }
    
    // Gets the distance to given city
    // Pengukuran jarak menggunakan euclidean distance
    public double distanceTo(City city){
        int xDistance = Math.abs(getX() - city.getX());
        int yDistance = Math.abs(getY() - city.getY());
        double distance = Math.sqrt( (xDistance*xDistance) + (yDistance*yDistance) );
        
        return distance;
    }
    
    @Override
    public String toString() {
        return label;
    }
}