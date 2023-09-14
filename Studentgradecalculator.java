import java.util.Scanner;



public class Studentgradecalculator {
    public static void main(String[] args) {
calculation();

    }

    public static void calculation() {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println(" Enter all subject marks in Order English -> Maths -> Science -> Hindi -> Social Studies");
        for( int i = 0 ; i<5 ; i++ ){
            arr[i] = sc.nextInt();
        }
        int Totalmarks = arr[0]+arr[1]+arr[2]+arr[3]+arr[4];
        int averagepercentage = Totalmarks / 5  ;
        char Grade ;
     if (averagepercentage <= 100 && averagepercentage >= 90){
         Grade = 'A' ;
     } else if (averagepercentage < 90 && averagepercentage >=80) {
         Grade = 'B';

     } else if (averagepercentage < 80 && averagepercentage >= 70) {
         Grade = 'C';

     }else if(averagepercentage < 70 && averagepercentage >= 60){

     Grade= 'D';

    } else if (averagepercentage < 60 && averagepercentage >=50) {
      Grade = 'E';
     }
     else {
         Grade = 'F';
     }
        System.out.println("The User has Successfully achieved a Total Marks of " + Totalmarks + " , Average Percentage of " + averagepercentage + " , Based on all the given criterias the Grade given to user is " + Grade + " .");
    }
}
