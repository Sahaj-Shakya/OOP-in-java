import java.util.*;

class Inputs{
    public Inputs(){

        String[] cities = {"Kathmandu", "Lalitpur", "Delhi", "Georgia", "Karachi"};

        System.out.println("Unsorted list:\n");
        for(int i=0;i<5;i++){
            System.out.println(cities[i] + "\n");
        }
    }

    public void Sorted(){
        
    }
}

public class SortCities {
    public static void main(String[] args) {
        Inputs A = new Inputs();
        A.Sorted();
    }
}