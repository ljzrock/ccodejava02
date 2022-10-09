
public class TestHomework05 {

	public static void main(String[] args) {
		// 输出小写a-z 以及大写Z-A
        /*定义char 字符 
         * 知识点 1 char字符本质是一个unicode值 是可以赋值和运算的
         *      2，a-z和A-Z都是从小到大顺序的
         *    利用for循环来输出
         * 
         * 代码演示*/
		for(char c1 = 'a';c1 <= 'z';c1++) {
			System.out.print(c1+" ");
		}
		System.out.println();
		System.out.println("+++++++++++++++++");
		for(char c2 = 'Z';c2 >= 'A';c2--) {
			System.out.print(c2+" ");
		}
//runresult:		a b c d e f g h i j k l m n o p q r s t u v w x y z 
//		             +++++++++++++++++
//		            Z Y X W V U T S R Q P O N M L K J I H G F E D C B A 
	}

}
