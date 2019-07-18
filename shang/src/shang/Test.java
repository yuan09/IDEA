package shang;
import java.util.Scanner;
import java.util.Random;

public class Test {
	public static void main(String[] args){
		for(int i = 1; i<=100; i++){
			System.out.println("I Love You");//ѭ��100��I Love You
		}
	}

}
//测试是否上传成功
//你已经上传成功 同意
//分支
class Test1{
	public static void main(String[] args){
		int sum = 0;
		for(int i=1;i<=100;i++){
			sum = sum +i;
			System.out.println(sum);//ÿһ�ε��㷨����ʾ����
		}
		System.out.println(sum);//ֻ��ʾ���Ľ��
	}
}
class Test2{
	public static void main(String[]srgs){
		int sum = 0;
		for(int i =1;i<=100;i++){
			if(i%2==0){
				System.out.print(i+ "\t");//��ż����ӡ���� ������
				sum++;
			}
			if(sum%10==0){
				System.out.println();//һ��10���� 10����һ��
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
		 int b = i/10%10;//ȡ��Ľ����5.5 ���Ǽ�������Զ�ת��int��������������5
		 System.out.println(b);
		 
	 }
 }
 //˫��ѭ��
 //����ѭ��һ�� ����ѭ��Ҫѭ����� 
 class Test7{
	 public static void main(String[] args){
		 Scanner input = new Scanner(System.in);
		 System.out.println("������һ������");
		 int age = input.nextInt();
		 for(int i = 1; i<=age;i++){
			 for(int j = 1; j<=i; j++){
				 System.out.print("*");
			 }
			 System.out.println();
		 }
		 
	 }
 }
 class Test8{ //�˷���
	 public static void main(String[] args){
		 Scanner input = new Scanner(System.in);
		 System.out.println("������һ������");
		 int age = input.nextInt();
		 for(int i = 1; i<=age;i++){
			 for(int j = 1; j<=i;j++){
				 System.out.print(j+"*"+i+"="+j*i+"\t");
			 }
			 System.out.println();
		 }
	 }
 }
 class Test9{//һ��ֻ���һ�����֣���ͬ������
	 public static void main(String[] args){
		 Scanner input = new Scanner(System.in);
		 System.out.println("������һ������");
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
		 System.out.println("������һ������");
		 int age = input.nextInt();
		 do{
			 if(age<=0){
				 System.out.println("������һ������0������");
			 }
			 
		 }while(age<=0);
		 int j =1;
		 for(int i = age; i>=1;i--){
			 
			 j=j*i;
		 }
		 System.out.print(age+"�Ľ׳�Ϊ"+j);
	 }
 }
 class Test11{
	 public static void main(String[] args){
		 Scanner input = new Scanner(System.in);
		 System.out.println("������һ������");
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
 class Test12{ //ʵ������
	 public static void main(String[] args){
			//�ϰ벿��
			for(int i=1; i<=5; i++){
				//ÿһ�У�1����ӡ�����ո�2����ӡ����*��3����ӡ����
				//��1����ӡ�����ո�
				/*
				��i=1����ӡ4���ո�j=1,2,3,4
				��i=2����ӡ3���ո�j=2,3,4
				��i=3����ӡ2���ո�j=3,4
				��i=4����ӡ1���ո�j=4
				��i=5����ӡ0���ո�j=��
				*/
				for(int j=i; j<=4; j++){
					System.out.print(" ");
				}
				
				//��ӡ����*
				/*
				��i=1����ӡ1��*��k=1             		k<=2*i-1
				��i=2����ӡ3��*��k=1,2,3
				��i=3����ӡ5��*��k=1,2,3,4,5
				��i=4����ӡ7��*��k=1,2,3,4,5,6,7
				��i=5����ӡ9��*��k=1,2,3,4,5,6,7,8,9
				*/
				for(int k=1; k<=2*i-1; k++){
					System.out.print("*");
				}
				
				//��3����ӡ����
				System.out.println();
			}
			
			//�°벿�֣�4��
		 for(int i=1; i<=4; i++){
				//ÿһ�У���1����ӡ�����ո�2����ӡ����*��3����ӡ����
				//��1����ӡ�����ո�
				/*
				��i=1,1���ո�j=1
				��i=2,2���ո�j=1,2
				��i=3,3���ո�j=1,2,3
				��i=4,4���ո�j=1,2,3,4
				*/
				for(int j=1; j<=i; j++){
					System.out.print(" ");
				}
				
				//��2����ӡ����*
				/*
				��i=1,7��*, j=1,2,3,4,5,6,7    j<=2*(4-i)+1
				��i=2,5��*, j=1,2,3,4,5
				��i=3,3��*, j=1,2,3
				��i=4,1��*, j=1
				*/
				for(int j=1;j<=2*(4-i)+1; j++){
					System.out.print("*");
				}
				
				//��3����ӡ����
				System.out.println();
	 }
	 }
 }
 class test13{ //��������
	 public static void main(String[] args){
			//�ϰ벿��
			for(int i=1; i<=5; i++){
				//ÿһ�У�1����ӡ�����ո�2����ӡ����*��3����ӡ����
				//��1����ӡ�����ո�
				/*
				��i=1����ӡ4���ո�j=1,2,3,4
				��i=2����ӡ3���ո�j=2,3,4
				��i=3����ӡ2���ո�j=3,4
				��i=4����ӡ1���ո�j=4
				��i=5����ӡ0���ո�j=��
				*/
				for(int j=i; j<=4; j++){
					System.out.print(" ");
				}
				
				//��ӡ����*
				/*
				��i=1����ӡ1��*+�ո�k=1             		k<=2*i-1
				��i=2����ӡ3��*+�ո�k=1,2,3
				��i=3����ӡ5��*+�ո�k=1,2,3,4,5
				��i=4����ӡ7��*+�ո�k=1,2,3,4,5,6,7
				��i=5����ӡ9��*+�ո�k=1,2,3,4,5,6,7,8,9
				*/
				for(int k=1; k<=2*i-1; k++){
					if(k==1 || k==2*i-1){//��ͷ��β��*
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}
				
				//��3����ӡ����
				System.out.println();
			}
			
			//�°벿�֣�4��
			for(int i=1; i<=4; i++){
				//ÿһ�У���1����ӡ�����ո�2����ӡ����*��3����ӡ����
				//��1����ӡ�����ո�
				/*
				��i=1,1���ո�j=1
				��i=2,2���ո�j=1,2
				��i=3,3���ո�j=1,2,3
				��i=4,4���ո�j=1,2,3,4
				*/
				for(int j=1; j<=i; j++){
					System.out.print(" ");
				}
				
				//��2����ӡ����*
				/*
				��i=1,7��*+�ո�, j=1,2,3,4,5,6,7    j<=2*(4-i)+1
				��i=2,5��*+�ո�, j=1,2,3,4,5
				��i=3,3��*+�ո�, j=1,2,3
				��i=4,1��*+�ո�, j=1
				*/
				for(int j=1;j<=2*(4-i)+1; j++){
					if(j==1 || j==2*(4-i)+1){//��ͷ��β��*
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}
				
				//��3����ӡ����
				System.out.println();
			}
		}
	 
 }
	 
 
