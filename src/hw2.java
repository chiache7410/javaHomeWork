public class hw2 {
    public static void main(String[] args){
        int year, month, day;
        year = 400;
        //17520902(wed
        //17520914(Thursday
        if(year%4==0){
            if(year%100==0 && year%400!=0){
                //不潤
                System.out.println("yes100,no400,不閏年");
            }
            else {
                System.out.println("閏年");
            }
        }
        else {
            //不潤
            System.out.println("NO閏年");
        }
    }
}
