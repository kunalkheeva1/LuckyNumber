public class LuckyNumber {
    public static boolean recursiveCheck(int n, int count){
        if(n<count){
            return true;
        }if(n%count ==0){
            return false;
        }
        return recursiveCheck(n-n/2,count +1)
    }

    public boolean luckyNumber(int n){
        return recursiveCheck(n,2);

    }

    public static void main(String[] args) {

    }
}
