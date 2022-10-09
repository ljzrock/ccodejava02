import java.util.Scanner;
public class TestHmoework03 {

	public static void main(String[] args) {
		/*判断一个数是否是水仙花数 （说明：水仙花数是指一个三位数其每个位上数字的立方的和等于它本身）
		 *举例：153  1*1*1 +5*5*5+ 3*3*3 = 153
		 * 难点:三位数每个位上的数字怎么求取（int n 来举例）
		 *   百位：n / 100（ 基本数类型自动转换)
		 *   十位：n % 100 / 10  
		 *   个位：n % 10
		 * 用户输入一个数 创建scanner 对象接收用户输入
		 * 
		 * */
		System.out.print("请输入一个三位数：");
		Scanner myScanner = new Scanner(System.in);
		int num = myScanner.nextInt();
		int n1 = num /100;//百位数字
		int n2 = num % 100 /10;//十位数字
		int n3 = num % 10;//个位数字
        if(n1 * n1 * n1 + n2 * n2 * n2 + n3 * n3 * n3 ==num) {
        	System.out.println("输入的数是水仙花数！");
        }else {
        	System.out.println("输入的数字不是水仙花数！");
        }
	}

}
