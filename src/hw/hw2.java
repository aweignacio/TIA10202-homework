package hw;

public class hw2 {

	// 1.請建立一個TestNineNine.java程式，可輸出九九乘法表

	public static void main(String[] args) {
		// 一、使用for+while迴圈

		for (int i = 1; i <= 9; i++) {
			int j = 1;
			while (j <= 9) {

				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j++;
			}
			System.out.println();
		}
		System.out.println("******************************************");
		// 二、使用for+do while迴圈
		for (int i = 1; i <= 9; i++) {
			int j = 1;
			do {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j++;
			} while (j <= 9);
			System.out.println();
		}
		System.out.println("******************************************");
		// 三、使用while迴圈+do while迴圈
		int i = 1; // 先前變數i再for循環當區域變數，所以可以再main()方法主程式中再次宣告一次
		while (i <= 9) {
			int j = 1;
			do {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j++;
			} while (j <= 9);
			i++;
			System.out.println();
		}
		System.out.println("******************************************");
		// 2.請設計一隻java程式，計算1~1000的偶數和(2+4+6...+1000)
		int sum = 0;
		for (int num = 2; num <= 1000; num += 2) {
			sum += num;
		}
		System.out.println("1~1000的偶數和是" + sum);
		System.out.println("******************************************");
		// 3.請設計一隻java程式，計算1~10的連乘積(1*2*3..*10)(用for迴圈)
		int sum2 = 1;
		for (int num = 2; num <= 10; num++) {
			sum2 *= num;
		}
		System.out.println("1~10的連乘積是" + sum2);
		System.out.println("******************************************");
		// 4.請設計一隻java程式，計算1~10的連乘積(1*2*3..*10)(用while迴圈)
		int sum3 = 1;
		int num = 2;
		while (num <= 10) {
			sum3 *= num;
			num++;
		}
		System.out.println("1~10的連乘積是" + sum3);
		System.out.println("******************************************");
		// 5.請設計一隻java程式，輸出結果如下：1 4 9 16 25 36 49 64 81 100
		// 規律：1*1 2*2 3*3 4*4........10*10
		int m = 1;
		while (m <= 10) {
			System.out.print((int) Math.pow(m, 2) + " ");
			m++;
		}
		System.out.println();
		System.out.println("******************************************");
		/*
		 6.阿文很迷大熱透(1-49)，但他不喜歡有4的數字，不論是十位數或個位數。
		 請設計一隻程式，並輸出阿文可以選擇的數字有哪些?總共有幾個?
		 */
		int count = 0;
		for (int num2 = 1; num2 <= 49; num2++) {
			int digit = num2 % 10, tendigit = num2 / 10; // 提取1-49中的個位數和百位數
			if (digit != 4 && tendigit != 4) {
				count++;
				System.out.print(num2 + " ");
			}
		}
		System.out.println("");
		System.out.println("阿文可以選擇的數字總共有" + count + "個");
		System.out.println("******************************************");

		/*
		 7.請設計一隻java程式，輸出結果如以下 
		 1 2 3 4 5 6 7 8 9 10 
		 1 2 3 4 5 6 7 8 9 
		 1 2 3 4 5 6 7 8
		 1 2 3 4 5 6 7 
		 1 2 3 4 5 
		 1 2 3 4 
		 1 2 3 
		 1 2 
		 1
		 */
		int a = 1;
		while (a <= 10) {
			int b = 1;
			while (b <= 11 - a) { //找出行,列的關係  a+b=11 >> b=11-a
				System.out.print(b + " ");
				b++;
			}
			a++;
			System.out.println();
		}
		System.out.println("******************************************");
		/*
		 8.請設計一隻JAVA程式，輸出結果為以下(使用迴圈) 
		  A 
		  BB 
		  CCC 
		  DDDD 
		  EEEEE 
		  FFFFFF 
		 */
		char q = 'A'; 
		while (q <= 70) {//利用ASCII碼解題,第一行為65 對應'A'，找出行列關係式 q = w.
			char w = 'A';
			while (w <= q) {
				System.out.print(q); //q為'A'
				w++;
			}
			q++;
			System.out.println();
		}
		System.out.println("******************************************");
	}

}
