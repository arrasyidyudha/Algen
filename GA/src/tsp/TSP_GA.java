/*
* TSP_GA.java
* Create a tour and evolve a solution
* 
*/



package tsp;


import java.util.Scanner;  

public class TSP_GA {

    public static void main(String[] args) throws InterruptedException {

        // parameter
        
        int generationCount;
        int popSize;

      
        Scanner sc=new Scanner(System.in);  
    
        System.out.println("Jumlah Generasi : ");  
       generationCount=sc.nextInt(); 
       System.out.println("Ukuran Populasi : ");  
       popSize=sc.nextInt();

        // Create and add our cities
        City city = new City(5, 1,"1");
        TourManager.addCity(city);
        City city2 = new City(7, 1,"2");
        TourManager.addCity(city2);
        City city3 = new City(11, 2,"3");
        TourManager.addCity(city3);
        City city4 = new City(10, 3,"4");
        TourManager.addCity(city4);
        City city5 = new City(7, 3,"5");
        TourManager.addCity(city5);
        City city6 = new City(3, 2,"6");
        TourManager.addCity(city6);
        City city7 = new City(16, 3,"7");
        TourManager.addCity(city7);
        City city8 = new City(14, 4,"8");
        TourManager.addCity(city8);
        City city9 = new City(15, 6,"9");
        TourManager.addCity(city9);
        City city10 = new City(9, 7,"10");
        TourManager.addCity(city10);
        City city11 = new City(14, 8,"11");
        TourManager.addCity(city11);
        City city12 = new City(12, 10,"12");
        TourManager.addCity(city12);
        City city13 = new City(10, 9,"13");
        TourManager.addCity(city13);
        City city14 = new City(7, 9,"14");
        TourManager.addCity(city14);
        City city15 = new City(6, 8,"15");
        TourManager.addCity(city15);
        City city16 = new City(5, 6,"16");
        TourManager.addCity(city16);
        City city17 = new City(4, 5,"17");
        TourManager.addCity(city17);
        City city18 = new City(4, 9,"18");
        TourManager.addCity(city18);
        City city19 = new City(3, 8,"19");
        TourManager.addCity(city19);
        City city20 = new City(1, 7,"20");
        TourManager.addCity(city20);
        City city21 = new City(1, 3,"21");
        TourManager.addCity(city21);
        City city22 = new City(2, 4,"22");
        TourManager.addCity(city22);
        
        // Initialize population
        Population pop = new Population(popSize, true);
        System.out.println("Initial distance: " + pop.getFittest().getDistance());

        // Evolve population for n generations
        pop = GA.evolvePopulation(pop);
        for (int i = 0; i < generationCount; i++) {
            System.out.print("Generasi Ke :");
            System.out.print(i);
            System.out.print("\n");
            pop.printPopulation();
            pop = GA.evolvePopulation(pop);
            Thread.sleep(1000);
             
    
            System.out.println("Nilai Fitness : " + pop.getFittest().getFitness());
            System.out.println("Jarak : " + pop.getFittest().getDistance());
            System.out.print("\n");
        }

        // Print final results
        System.out.println("Hasil Akhir");
        System.out.println("Jarak final : " + pop.getFittest().getDistance());
        System.out.println("Nilai fitness : " + pop.getFittest().getFitness());
        System.out.println("Solution terbaik:");
        System.out.println(pop.getFittest());
        
    }
}