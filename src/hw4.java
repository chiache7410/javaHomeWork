public class hw4 {
    public static void main(String[] args){
        for(int i=1;i<=100;i++){
            boolean flag = false;
            for(int j=i-1;j>1;j--){
                if(i%j==0){
                    flag = true;
                    break;
                }
            }
            if( flag ) System.out.print(i + "\t");
            else System.out.print("[" + i + "]" + "\t");
            if(i%10 == 0) System.out.println();
        }
    }
}
