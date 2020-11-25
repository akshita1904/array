import java.util.*;

class OdEvn4{
  public static void main(String[] args) {
    int zero=0;
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter length");
    int l=sc.nextInt();
    System.out.println("Enter "+l+" numbers");
    int even=0, odd=0, four=0;
    int a[] = new int[l];
    for(int i=0; i<l; i++){
      a[i] = sc.nextInt();
    }
    for (int j=0; j<l; j++){
      int x=a[j];
      if(x%2==0){
        even+=1;
      }
      else if(x==0){
        zero=1;
      }
      if(x%2==1){
        odd+=1;
      }
      else if(x==0){
        zero=1;
      }
      if(x%4==0){
        four+=1;
      }
      else if(x==0){
        zero=1;
      }
    }
    if(zero==1){
      System.out.println("error: 0 is divisible by all the numbers and not counted!!");
    }
    System.out.println("Odd numbers : "+odd);
    System.out.println("Even numbers : "+even);
    System.out.println("Numbers divisible by 4 : "+four);
  }
}
