
public class TestHmoework07 {

	public static void main(String[] args) {
		// 求1+（1+2）+（1+2+3）+(1+2+3+4)+...+(1+2+3+...+100)
		/*明显的双重for循环
		 原式中每一项都在增加 并且每一项第一位都是1 
		 使用sum来接收总和
		 代码演示：
		 */
		int sum = 0;
		for(int i = 1;i<=100;i++) {
			for(int j = 1;j <= i;j++){
				sum += j;//在内循环中实现题目要求并计算出结果
			}
		}
		System.out.println("sum= "+sum);

	}

}
