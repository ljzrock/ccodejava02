import java.util.Scanner;
public class TestHomework02 {

	public static void main(String[] args) {
		/* 判断一个年份是否为闰年
		 * 闰年的条件是 :能被4整除和不能被100整除 或者能被400整除
		 * 需要通过用户输入年份来判断 创建scanner对象来接收用户输入
		 * 拘役实现使用if else 来完成判断 
		 * 代码实现：
		 * */
		System.out.print("请输入一个年份:");
		Scanner myScanner = new Scanner(System.in);
		int year = myScanner.nextInt();
		if(year % 4 ==0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("该年份是闰年！");
		}else {
		System.out.println("该年份不是闰年！");	
		}

	}

}
