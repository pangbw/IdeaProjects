import java.util.Arrays;
import java.util.Scanner;

class Dishes {
    static String[] name = {"辣子鸡丁", "水煮肉片", "糖醋里脊", "干锅牛肉", "干锅排骨"};
    int[] number = {1, 2, 3, 4, 5};
    static float[] price = {38, 22, 18, 38, 29};

    public void getdishes() {
        for (int i = 0; i < name.length; i++) {
            System.out.println(number[i] + "." + name[i] + "  " + price[i] + "元");
        }
    }
}

public class HYTime1Lv4 {
    public static void main(String[] args) {
        String[] stname = new String[5];
        float[] stprice = new float[5];
        int con = 1;
        Scanner sc = new Scanner(System.in);
        Dishes dishes = new Dishes();
        System.out.println("欢迎来到国民饭店，这是今天的菜单：");
        for (int i = 0; i < con; i++) {
            float sum = 0;
            dishes.getdishes();
            System.out.println("请输入想要点的菜的序号");
            int num = sc.nextInt() - 1;
            for (int j = 0; j < con; j++) {
                stname[con - 1] = Dishes.name[num];
                stprice[con - 1] = Dishes.price[num];
            }
            System.out.println("您一共点了：");
            for (int k = 0; k < con; k++) {
                System.out.println(stname[k] + "  ");
                System.out.println(stprice[k] + "元");
                sum = sum + stprice[k];
            }

            System.out.println("共计：" + sum +"元");
            System.out.println("还有需要点的菜吗？(请输入”有“或”没有“)");
            String more = sc.next();
            if (more.equalsIgnoreCase("有")) {
                con++;
            }
        }
        System.out.println("请选择支付方式：（“1” 支付宝；“2” 微信；“3” 人脸识别）");
        int payway = sc.nextInt();
        if(payway == 1 || payway == 2){
            System.out.println("请出示付款码。");
        }
        else{
            System.out.println("请平视摄像头。");
        }
        System.out.println("支付成功。"+"\n"+"感谢您的光临！");
    }
}
