/* Accept 5 doubles from user (scanner)
Print it's average.*/

import java.util.Scanner;
class Average{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter 5 double values: ");
double arr[] = new double[5]; 
double sum=0, avg=0;
for(int i=0; i<5; i++){
arr[i]=sc.nextDouble();
}
for(int i=0; i<5; i++){
sum=sum+arr[i];
}
avg = sum/5;
System.out.println("Average of 5 double values = "+avg);
}
}

*/OUTPOT*/
