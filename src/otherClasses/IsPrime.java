public class IsPrime {
    void allPrime(){
        for ( int i = 0 ; i <= 100 ; i++ ){
            boolean isPrime =true;
            for (int j = 2 ; j<i;j++){
                if(i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime)
                System.out.println(i);

        }

    }

}
