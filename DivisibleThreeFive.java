import java.util.*;

class DivisibleThreeFive{
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int three=0, five=0;
    System.out.println("enter length");
    int l=sc.nextInt();
    System.out.println("Enter "+l+" numbers");
    int a[] = new int[l];
    for(int i=0; i<l; i++){
      a[i] = sc.nextInt();
    }
    for(int i=0; i<l; i++){
      int x=a[i];
      if(x%3==0){
        three+=x;
      }
      if(x%5==0){
        five+=x;
      }
    }
    System.out.println("Sum of numbers divisible by 3 :");
    System.out.println(three);
    System.out.println("Sum of numbers divisible by 5 :");
    System.out.println(five);
  }
}
