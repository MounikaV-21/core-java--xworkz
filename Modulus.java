class Modulus{
public static void main(String mod[]){
mod(45 , 78);
mod(23 , 56);
mod(56 , 12);
mod(21 , 89);
mod(43 , 98);
mod(12 , 67);
mod(13 , 45);
mod(32 , 19);
mod(56 , 67);
mod(39 , 90);
System.out.println(" ");
 
mod(56,3,8);
mod(90,10,77);
mod(900,70,89);
mod(678,78,78);
mod(1000,1,76);
mod(869,90,70);
mod(789,88,99);
mod(1890,89,7);
mod(65,9,679);
mod(800,8,8);
}
public static void mod(int a, int b){
System.out.println(a%b);
}
public static void mod(int a , int b , int c) {
 System.out.println((a%b)%c);
 }
}