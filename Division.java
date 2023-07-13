class Division 
{
 
 public static void main(String division[]){
 
 div(56,3);
 div(90,10);
 div(900,70);
 div(678,78);
 div(1000,1);
 div(869,90);
 div(789,88);
 div(1890,89);
 div(65,9);
 div(800,8);
 System.out.println(" ");
 
 div(56,3,8);
 div(90,10,77);
 div(900,70,89);
 div(678,78,78);
 div(1000,1,76);
 div(869,90,70);
 div(789,88,99);
 div(1890,89,7);
 div(65,9,679);
 div(800,8,8);
 
 }
 public static void div(int c , int d) {
 System.out.println(c/d);
 }
 public static void div(int c , int d , int e) {
 System.out.println((c/d)/e);
 }
 
}