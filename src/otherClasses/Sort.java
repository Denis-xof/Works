public class Sort {
    double[] sort(double[] array){
        double[] sortedArray=new double[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        sortedArray=array;
        return sortedArray;
    }
}
