
public class TestHomework04 {

	public static void main(String[] args) {
		// 编程输出1-100之间不能被5整除的数 每5个一行 
		/* 1,需要同for循环来遍历1-100之间的数 
		 * 2，通过条件判断来求取不能被5整除的数字 即if（num % 5 ！= 0）
		 * 3，每行输出5个 同样也是通过判断 if（i % 5 == 0）{system.out.println();//换行}
		 * 4：代码实现;
		 * */
		int count = 0;//计数器记录个数
         for(int num = 1;num<=100;num++) {
        	 if(num % 5 !=0) {
//        		 System.out.print(num);
        		count++;
        		System.out.print(num+"\t");
        	 }
        	 if(count % 5 == 0) {
     			System.out.println();
         	 }
        	
         }
	}

}
