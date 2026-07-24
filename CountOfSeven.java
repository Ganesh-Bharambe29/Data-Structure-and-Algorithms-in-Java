public class CountOfSeven {

    public static void countOfSeven(int arr[][]){
        int count=0;

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==7){
                    count++;
                }
            }
        }

        System.out.println("The count of Seven in the given array is = "+count);
        return;
    }
    public static void main(String[] args) {
        int arr[][]={
            {1,2,7},
            {7,8,9},
            {3,7,9}
        };

        countOfSeven(arr);
    }
}
