public class Main{
    static int [] nums ={9,5,6,58,8,6,7,};
    static int minIndex = -1;
    static int temp = 0;
    static int size= nums.length;
    public static void selectionSort(){
        for(int i=0;i<size;i++) {
            minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
                }
                temp = nums[minIndex];
                nums[minIndex] = nums[i];
                nums[i] = temp;
            }
        }

    public  static  void main(String[] args){
        selectionSort();
        System.out.println("sorted");
        for(int num :nums){
        System.out.println(num +" " );
    }
        System.out.println();
}}