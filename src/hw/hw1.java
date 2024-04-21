package hw;

public class hw1 {
	public static void main(String[] args) {
		// 1.請設計一隻java程式計算12、6兩個數值的和與積
		int num1 = 12, num2 = 6;
		int num3 = num1 + num2;
		int num4 = num1 * num2;
		System.out.println(num1 + "和" + num2 + "和是" + num3);
		System.out.println(num1 + "和" + num2 + "積是" + num4);
		System.out.println("**************************************************");
		// 2.請設計一隻java程式計算200顆蛋共是幾打幾顆
		int egg = 200;
		int dozen = egg / 12; // 200/12 =幾打
		int remainder = egg % 12; // 取餘12 = 剩下幾顆
		System.out.println(egg + "顆雞蛋是" + dozen + "打又" + remainder + "顆");
		System.out.println("**************************************************");
		// 3.請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		int sum = 256559; //
		int days = sum / 24 / 60 / 60; // 計算天數
		int hours = (sum / 3600) % 24; // 總秒數/60*60 = 總時數，總時數取餘24，為幾個小時
		int minute = (sum / 60) % 60; // 總秒數/60 =總分鐘數，總分鐘取餘60，為幾分鐘
		int seconds = sum % 60; // 總秒數取餘60，為剩下幾秒
		System.out.println(sum + "秒是" + days + "天又" + hours + "小時又" + minute + "分又" + seconds + "秒");
		System.out.println("**************************************************");
		// 4.請定義一個常數3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
		final double PI = 3.1415;
		int radius = 5;
		double circle = radius * radius * PI;
		double circumference = radius * 2 * PI;
		System.out.println("半徑為" + radius + "則圓面積為" + circle + "圓周長為" + circumference);
		System.out.println("**************************************************");

		// 5.某人在銀行存150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請用程式計算10年後，本金加利息共有多少錢?
		int capital = 1_500_000;
		double s = capital * (Math.pow(1.02, 10));// 使用Math.pow()方法計算次方運算
		System.out.println("10年後本金加利息是" + (int) s);// 存款沒有小數點，強制轉換int類型
		System.out.println("**************************************************");
		/*
		 * 6.請寫程式，利用System.out.println()印出下列三個運算式結果 5 + 5 5 + '5' 5 + "5"
		 */
		System.out.println(5 + 5); // 5+5為兩個int類型相加，數字+數字為相加
		System.out.println(5 + '5'); // int+char，char值'5'對應ACSII碼為53，5+53=58
		System.out.println(5 + "5");// int+字串，為連接意思，打印出來會是55。
		System.out.println("**************************************************");
	}

}
