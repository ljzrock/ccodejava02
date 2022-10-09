import java.util.Scanner;
public class Testhomewoek01 {

	public static void main(String[] args) {
		//编程实现判断一个整数属于那个范围 大于0，小于0，等于0
		/*1，最好是用户输入 需要创建scanner对象 
		 *2，使用 if ...else if...else 多分支来判断
	 	 *3,代码演示：
		 * */
		System.out.println("请输入一个数：");
		Scanner myScanner = new Scanner(System.in);
		double num = myScanner.nextDouble();
         if(num > 0) {
        	 System.out.println("输入的数大于0");
         }else if(num < 0) {
        	 System.out.println("输入的数小于0");
         }else {
        	 System.out.println("输入的数等于0");
         }
	}

}
