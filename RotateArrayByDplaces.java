class RotateArrayByDplaces {
    static void rotateArr(int arr[], int d) {
        // code here
        int n=arr.length;
        if(n<=1) return;
        d=d%n;
        if(n==0) return;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
        
    }
    static void reverse(int arr[],int start, int end){
        while(start<end){
           int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}