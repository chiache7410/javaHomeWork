import java.util.Arrays;

public class hw5 {
    public static void main(String[] args){
        //新牌
        int[] poker = new int[52];
        for(int i=0;i<poker.length;i++) poker[i]=i;
        for(int v:poker) System.out.print(v + "\t");    //show
        System.out.println();
        System.out.println("------------------------------");
        //洗牌
        for(int i=0;i<poker.length;i++){
            int key = (int)(Math.random()*(poker.length-i))+i;
            int temp = poker[i];
            poker[i] = poker[key];
            poker[key] = temp;
            }
        }
        for (int v:poker) System.out.print(v + "\t");   //show
        System.out.println();
        System.out.println("------------------------------");
        //發牌
        int[][] players = new int[4][13];
        for(int i=0;i<poker.length;i++){
            players[i%4][i/4] = poker[i];
        }
        //攤牌
        for(int[] player:players){
            String[] suits = {"黑桃","紅心","方塊","梅花"};
            String[] values = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
            Arrays.sort(player);    //排序
            for(int card:player){
                System.out.print(suits[card/13] + values[card%13] + "\t");      //除13>>花色,%13>>牌值
            }
            System.out.println();
        }
    }
}