package bank;

public class Binary {
    public static void main(String[] args) {
        int[] arr={1,4,5,66,-9,88};
        int target=88;
        int ans=binarySearch(arr,target);
        System.out.println(ans);
    }

    static int binarySearch(int[] arr, int target){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid = start+(end-start)/2;

            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
            return mid;
            }
        }
        return -1;
    }
}
