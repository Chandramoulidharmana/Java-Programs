public class Move_0_S {
    static void move_0s(int[]arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            boolean flag = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] == 0 && arr[j + 1] != 0) {
                    // Swap arr[j],arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                return;
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={0,5,0,3,4};
        move_0s(arr);
        for(int i:arr){
            System.out.println(""+ i);
        }
    }

    }


