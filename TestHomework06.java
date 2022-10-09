
public class TestHomework06 {

	public static void main(String[] args) {
       /* 输出 1-（1/2）+(1/3)-(1/4)...+(1/100)的值
        分析：其等价于（1/1)-（1/2）+(1/3)-(1/4)...+(1/100)
            1,分子为1 固定不变 分子为奇数是为正；分子为偶数时为负
            2，使用for循环和if条件判断 计算机计算时只要一个变量不出其作用域该值每运算一次
            计算机会记录一次结果 直到程序结束才会保留最后一次计算的结果
            3，代码实现：
        */
		double sum = 0;
		for(int i = 1;i <= 100;i++) {
			if(i % 2 != 0) {
				sum += 1.0 / i;
			}else if(i % 2 == 0){
				sum -= 1.0 / i;
			}
		}
		System.out.println("sum = "+sum);
//runresult:		sum = 0.688172179310195
	}

}
