import java.util.*;

class MarksClassEightyPercentup{
  public static void main(String[] args) {
    int percent=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter length");
    int l=sc.nextInt();
    int phy[] = new int[l];
    int chem[] = new int[l];
    int bio[] = new int[l];
    int count=0;
    for(int i=0; i<l; i++){
      System.out.println("Enter marks of the child in phy ");
      phy[i] = sc.nextInt();
      System.out.println("Enter marks of the child in chem ");
      chem[i] = sc.nextInt();
      System.out.println("Enter marks of the child in bio ");
      bio[i] = sc.nextInt();
    }
    for (int j=0; j<l; j++) {
      percent=(phy[j]+bio[j]+chem[j])/3;
      if(percent>=80){
        count+=1;
      }
    }
    System.out.println(" the total number of children with marks 80% and up: "+count);
  }
}
