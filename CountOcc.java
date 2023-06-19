package bank;

public class countOcc {
    public static void main(String[] args){
        int n=12234;
        int count=0;

        while(n>0){
            int rem=n%10;
            if(rem==2){
                count++;
            }
            n/=10;
        }
        System.out.println(count);
    }
}
