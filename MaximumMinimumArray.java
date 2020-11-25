import java.util.*;

class MaximumMinimumArray{
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter length");
    int l=sc.nextInt();
    System.out.println("Enter "+l+" numbers");
    int a[] = new int[l];
    int max=0, min=0;

    for(int i=0; i<a.length; i++){
      a[i]=sc.nextInt();
    }
    max=a[0];
    min=a[0];
    for(int q=0; q<a.length; q++){
        int x=a[q];
        if(x<min){
          min=x;
        }
        else if(x>max){
          max=x;
        }
    }
    System.out.println("Maximum number ::");
    System.out.println(max);
    System.out.println("Minimum number ::");
    System.out.println(min);
  }
}
