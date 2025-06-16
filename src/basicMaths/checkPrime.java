package basicMaths;

public class checkPrime {

        static boolean isPrime(int n) {
            // code here
            int temp = 0;

            if(n<=1){
                return false;
            }

            for(int i=2; i<=Math.sqrt(n); i++){
                if(n%i == 0){
                    temp++;
                }
            }
            if(temp == 0){
                return true;
            }
            else{
                return false;
            }
        }
    }

