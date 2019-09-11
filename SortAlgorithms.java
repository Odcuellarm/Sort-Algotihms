import java.util.Random;
import java. util. Arrays;

public class SortAlgorithms{

     public static void main(String []args){
    
    
        //For n = 10
        int arrayLength = 10;
        fill(arrayLength);
        
        // For n = 100
        arrayLength = 100;
        fill(arrayLength);
        
        // For n = 1,000
        arrayLength = 1000;
        fill(arrayLength);
        
        // For n = 10,000
        arrayLength = 10000;
        fill(arrayLength);
        
        // For n = 100,000
        arrayLength = 100000;
        fill(arrayLength);
        
        // For n = 1'000,000
        arrayLength = 1000000;
        fill(arrayLength);
        
        // For n = 10'000,000
        arrayLength = 10000000;
        fill(arrayLength);
     
        // For n = 100'000,000
        arrayLength = 100000000;
        fill(arrayLength);
     
    }
     
    public static double[] fill(int length){
         
        double[] myArray = new double [length];
        
        int elementsInArray = myArray.length;
        
        for(int i=0; i<elementsInArray; i++){
            myArray[i] = randomFill(); // Assigns random numbers to the array
        }
        /////////////////// FIRST SORT - BUILT IN /////////////////////////
        
        long startTime = System.nanoTime(); //starting time of processs
        
        sortArray(myArray); //Sort the array in the built in way
        
        long endTime   = System.nanoTime(); //Ending time of process
        
        long totalTime = endTime - startTime;
        System.out.println("Built-In: " + "[" + elementsInArray + ", " + totalTime + "]");
        
        ////////////// SECOND SORT - PARALLEL /////////////////////////////////
        
        startTime = System.nanoTime();
        
        sortParallelArray(myArray); //Sort the array in the built in way
        
        endTime   = System.nanoTime();
        
        totalTime = endTime - startTime;
        System.out.println("Parallel: " + "[" + elementsInArray + ", " + totalTime + "]");
        
    return myArray;     
    }
    
    
    public static double randomFill(){

        Random rand = new Random();
        double randomNum = rand.nextDouble();
        
        return randomNum;
    }
    
    public static double[] sortArray(double[]randomArray){
        
        Arrays.sort(randomArray);
        
        return randomArray;
        
    }
    
    public static double[] sortParallelArray(double[]randomArray){
        
        Arrays.parallelSort(randomArray);
        
        return randomArray;
        
    }

    
     
} 
