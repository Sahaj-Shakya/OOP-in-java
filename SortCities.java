import java.util.Arrays;

class Inputs{
    public Inputs(){

        String[] cities = {"Kathmandu", "Lalitpur", "Delhi", "Georgia", "Karachi"};

        System.out.println("Unsorted list:");
        for(int i=0;i<5;i++){
            System.out.println((i + 1) + ". " + cities[i]);
        }
    }

    public void Sorted(){
        String[] cities = {"Kathmandu", "Lalitpur", "Delhi", "Georgia", "Karachi"};
        Arrays.sort(cities);
        
        System.out.println("\nSorted List: ");
        for(int i = 0; i < 5; i++){
            System.out.println((i + 1) + ". " + cities[i]);
        }
    }
}

public class SortCities {
    public static void main(String[] args) {
        Inputs A = new Inputs();
        A.Sorted();
    }
}