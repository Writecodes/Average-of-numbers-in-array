//..........................find the average of the numbers in the array list..................

public class Main
{
	public static void main(String[] args) {
		double[] B = { 45.3, 67.5, -45.6, 20.34, 33.0, 45.6 };
        double sum=0;
        int i;
        System.out.print("Array list : ");
        for (i=0;i<B.length;i++)
        System.out.print(B[i]+",");
        for (i=0;i<B.length;i++)
            sum=sum+B[i];
        System.out.println("\nAverage : "+sum/6);
	}
}

