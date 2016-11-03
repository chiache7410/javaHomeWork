import javax.swing.*;

public class hw2 {
    public static void main(String[] args){
        String[] week = {"星期日","星期一","星期二","星期三","星期四","星期五","星期六"};
        int[] year1752a = {1752,9,2};   //17520902(Wed
        int[] year1752b = {1752,9,14};  //17520914(Thursday
        int[][] monthday=new int[2][];
        monthday[0]=new int[] {31,28,31,30,31,30,31,31,30,31,30,31};
        monthday[1]=new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
        int year, month, day;   //變數 輸入的年月日
        int sumday=0;
        do{ year = Integer.parseInt( JOptionPane.showInputDialog("輸入年份") ); }while(year<1752);
        do{ month = Integer.parseInt( JOptionPane.showInputDialog("輸入月份") ); }while(month>12 || month<1);
        do{ day = Integer.parseInt( JOptionPane.showInputDialog("輸入日期") ); }while(day>31 || day<1);
        for(int i=year;i>=year1752b[0];i--){
            for(int j=month;j>=1;j--){
                for(int k=day;k>0;k--){
                    sumday++;
                }
            }
        }

        System.out.print( week[checkyear(year)] );

    }
    public static int checkyear (int year) {
        //-----檢查是否閏年-----
        if(year%4==0){
            if(year%100==0 && year%400!=0){
                //不閏年
            }
            else {
                return 1;   //閏年
            }
        }
        return 0;   //不閏年
    }
}
