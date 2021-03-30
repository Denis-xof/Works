import java.util.Scanner;

public class MinAvMax {
    public void minAaMax(){
        double[] array= new double[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }
        double min =array[0];
        double max =array[0];
        double avg =0;
        for (int numOfArray=0;numOfArray<array.length;numOfArray++){
            if(min>array[numOfArray]){
                min=array[numOfArray];
            }
            if (max<array[numOfArray]){
                max=array[numOfArray];
            }
            avg+=array[numOfArray]/array.length;
        }
        System.out.printf("min= " + min + " max= " + max +" avg= "+avg);
    }
}
