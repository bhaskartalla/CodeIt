package hackerearth;

import java.util.Scanner;

class ArmyAnts
{
   int nb,na=0;
   int b[][];
  Scanner sc=new Scanner(System.in);
  
  ArmyAnts()
  {
   nb=sc.nextInt();
   b=new int[nb][3];
   
    for(int i=0;i<nb;i++)
    {
      for(int j=0;j<3;j++)
      {
       b[i][j]=sc.nextInt();
      }
    }
  }
 
  void perform()
  {
   for(int i=0;i<nb;i++)
   {
      na=na+(((b[i][0]+b[i][2])-b[i][0])+1);
      
      System.out.println("b["+i+"][0] : "+b[i][0]);
      System.out.println("b["+i+"][2] : "+b[i][2]);
      System.out.println("na : "+na);
   }
 }  
 public static void main(String z[])
 {
   ArmyAnts A1=new ArmyAnts();
   A1.perform();
   System.out.println(A1.na);
 }
}


