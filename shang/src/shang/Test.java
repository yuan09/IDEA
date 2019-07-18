package shang;
import java.util.Scanner;
import java.util.Random;

public class Test {
	public static void main(String[] args){
		for(int i = 1; i<=100; i++){
			System.out.println("I Love You");//循环100次I Love You
		}
	}

}

class Test1{
	public static void main(String[] args){
		int sum = 0;
		for(int i=1;i<=100;i++){
			sum = sum +i;
			System.out.println(sum);//每一次的算法都显示出来
		}
		System.out.println(sum);//只显示最后的结果
	}
}
class Test2{
	public static void main(String[]srgs){
		int sum = 0;
		for(int i =1;i<=100;i++){
			if(i%2==0){
				System.out.print(i+ "\t");//把偶数打印出来 不换行
				sum++;
			}
			if(sum%10==0){
				System.out.println();//一行10个数 10个换一行
			}
			
		}
	}
}
 class Test3{
	 public static void main(String[] args){
		 int sum =0;
		 for(;;){
			 System.out.print("\t"+"I Love You");
			 sum++;
			 if(sum%10==0){
				 System.out.println( );
			 }
			 if(sum==100){
				 break;
			 }
		 }
	 }
 }
 class Test4{
	 public static void main(String[] args){
		int sum = 0;
	    int i = 1;
	    while(i<=100){
	    	sum = sum +i;
	    	i++;
	    }
	    System.out.println(sum);
	 }
 }
 class Test5{
	 public static void main(String[] args){
		 int i = 1;
		 int sum =0;
		 do{
			 sum = sum +i;
			 i++;
		 }while(i<=100);
		 System.out.println(sum);
	 
	 }
 }
 class Test6{
	 public static void main(String[] args){
		 int i = 155;
		 int b = i/10%10;//取余的结果是5.5 但是计算过后自动转成int整数类型所以是5
		 System.out.println(b);
		 
	 }
 }
 //双层循环
 //外面循环一次 里面循环要循环完毕 
 class Test7{
	 public static void main(String[] args){
		 Scanner input = new Scanner(System.in);
		 System.out.println("请输入一个数字");
		 int age = input.nextInt();
		 for(int i = 1; i<=age;i++){
			 for(int j = 1; j<=i; j++){
				 System.out.print("*");
			 }
			 System.out.println();
		 }
		 
	 }
 }
 class Test8{ //乘法表
	 public static void main(String[] args){
		 Scanner input = new Scanner(System.in);
		 System.out.println("请输入一个数字");
		 int age = input.nextInt();
		 for(int i = 1; i<=age;i++){
			 for(int j = 1; j<=i;j++){
				 System.out.print(j+"*"+i+"="+j*i+"\t");
			 }
			 System.out.println();
		 }
	 }
 }
 class Test9{//一行只输出一个数字，相同的数字
	 public static void main(String[] args){
		 Scanner input = new Scanner(System.in);
		 System.out.println("请输入一个数字");
		 int age = input.nextInt();
		 for(int i = 1; i<=age; i++){
			 for(int j=1;j<=i;j++){
				 System.out.print(i +"\t");
			 }
			 System.out.println();
		 }
		 
	 }
 }
 class Test10{
	 public static void main(String[] args){
		 Scanner input = new Scanner(System.in);
		 System.out.println("请输入一个数字");
		 int age = input.nextInt();
		 do{
			 if(age<=0){
				 System.out.println("请输入一个大于0的数字");
			 }
			 
		 }while(age<=0);
		 int j =1;
		 for(int i = age; i>=1;i--){
			 
			 j=j*i;
		 }
		 System.out.print(age+"的阶乘为"+j);
	 }
 }
 class Test11{
	 public static void main(String[] args){
		 Scanner input = new Scanner(System.in);
		 System.out.println("请输入一个数字");
		 int age = input.nextInt();
		 for(int i = 1;i<=age;i++){
			 for(int j =i;j<=age-1;j++){
				 System.out.print(" ");
			 }
			 for(int k =1;k<=2*i-1;k++){
				 System.out.print("*");
			 }
			 System.out.println();
		 }
		 for(int i =1;i<=age-1;i++){
			 for(int j = i;i<=i;j++){
				 System.out.print(" ");
			 }
			 for(int k =1;k<=2*(age-1-i)+1;k++){
				 System.out.print("*");
			 }
			 System.out.println();
		 }
	 }
 }
 class Test12{ //实心菱形
	 public static void main(String[] args){
			//上半部分
			for(int i=1; i<=5; i++){
				//每一行（1）打印几个空格（2）打印几个*（3）打印换行
				//（1）打印几个空格
				/*
				当i=1，打印4个空格，j=1,2,3,4
				当i=2，打印3个空格，j=2,3,4
				当i=3，打印2个空格，j=3,4
				当i=4，打印1个空格，j=4
				当i=5，打印0个空格，j=？
				*/
				for(int j=i; j<=4; j++){
					System.out.print(" ");
				}
				
				//打印几个*
				/*
				当i=1，打印1个*，k=1             		k<=2*i-1
				当i=2，打印3个*，k=1,2,3
				当i=3，打印5个*，k=1,2,3,4,5
				当i=4，打印7个*，k=1,2,3,4,5,6,7
				当i=5，打印9个*，k=1,2,3,4,5,6,7,8,9
				*/
				for(int k=1; k<=2*i-1; k++){
					System.out.print("*");
				}
				
				//（3）打印换行
				System.out.println();
			}
			
			//下半部分：4行
		 for(int i=1; i<=4; i++){
				//每一行：（1）打印几个空格（2）打印几个*（3）打印换行
				//（1）打印几个空格
				/*
				当i=1,1个空格，j=1
				当i=2,2个空格，j=1,2
				当i=3,3个空格，j=1,2,3
				当i=4,4个空格，j=1,2,3,4
				*/
				for(int j=1; j<=i; j++){
					System.out.print(" ");
				}
				
				//（2）打印几个*
				/*
				当i=1,7个*, j=1,2,3,4,5,6,7    j<=2*(4-i)+1
				当i=2,5个*, j=1,2,3,4,5
				当i=3,3个*, j=1,2,3
				当i=4,1个*, j=1
				*/
				for(int j=1;j<=2*(4-i)+1; j++){
					System.out.print("*");
				}
				
				//（3）打印换行
				System.out.println();
	 }
	 }
 }
 class test13{ //空心菱形
	 public static void main(String[] args){
			//上半部分
			for(int i=1; i<=5; i++){
				//每一行（1）打印几个空格（2）打印几个*（3）打印换行
				//（1）打印几个空格
				/*
				当i=1，打印4个空格，j=1,2,3,4
				当i=2，打印3个空格，j=2,3,4
				当i=3，打印2个空格，j=3,4
				当i=4，打印1个空格，j=4
				当i=5，打印0个空格，j=？
				*/
				for(int j=i; j<=4; j++){
					System.out.print(" ");
				}
				
				//打印几个*
				/*
				当i=1，打印1个*+空格，k=1             		k<=2*i-1
				当i=2，打印3个*+空格，k=1,2,3
				当i=3，打印5个*+空格，k=1,2,3,4,5
				当i=4，打印7个*+空格，k=1,2,3,4,5,6,7
				当i=5，打印9个*+空格，k=1,2,3,4,5,6,7,8,9
				*/
				for(int k=1; k<=2*i-1; k++){
					if(k==1 || k==2*i-1){//开头结尾是*
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}
				
				//（3）打印换行
				System.out.println();
			}
			
			//下半部分：4行
			for(int i=1; i<=4; i++){
				//每一行：（1）打印几个空格（2）打印几个*（3）打印换行
				//（1）打印几个空格
				/*
				当i=1,1个空格，j=1
				当i=2,2个空格，j=1,2
				当i=3,3个空格，j=1,2,3
				当i=4,4个空格，j=1,2,3,4
				*/
				for(int j=1; j<=i; j++){
					System.out.print(" ");
				}
				
				//（2）打印几个*
				/*
				当i=1,7个*+空格, j=1,2,3,4,5,6,7    j<=2*(4-i)+1
				当i=2,5个*+空格, j=1,2,3,4,5
				当i=3,3个*+空格, j=1,2,3
				当i=4,1个*+空格, j=1
				*/
				for(int j=1;j<=2*(4-i)+1; j++){
					if(j==1 || j==2*(4-i)+1){//开头结尾是*
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}
				
				//（3）打印换行
				System.out.println();
			}
		}
	 
 }
	 
 