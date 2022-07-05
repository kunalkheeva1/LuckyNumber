public class LuckyNumber {


    //get a boolean function to call it in the actual function
    public static boolean recursiveCheck(int n, int count){

        // if my index is smaller than the count to be deleted,then its true as no deletion will take place
        if(n<count){
            return true;

            //if the count is divisible by index then return false as deletion will take place
        }if(n%count ==0){
            return false;
        }
        //recursively call the same process by updating the value of index and count.
        return recursiveCheck(n-n/2,count +1);
    }

    public boolean luckyNumber(int n){
        //then just start the count with two ACT
        return recursiveCheck(n,2);

    }

    public static void main(String[] args) {

    }
}
