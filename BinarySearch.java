public class BinarySearch{
    public static void main(String[] args) {
        int arr[] = new int[]{1,3,4,5};
        
        System.out.println(binarySearch(arr,2));
    }
    public static int binarySearch(int arr[], int key){
        int start = 0, end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(key == arr[mid]) return mid;
            else if(key < arr[mid]) end = mid - 1;
            else start = mid + 1;
        }
        return -1;
    }
}