
import java.util.Arrays;
public class Main
{
 
  public static void main (String[]args)
  {
	int[] x = { 38, 40, 47, 38, 37, 87, 94, 56 };
	System.out.println ("array");
	for (int i = 0; i < x.length - 1; i++)
	  {
		for (int j = 0; j < x.length - i - 1; j++)
		  {
			if (x[j] < x[j + 1])
			  {
				int temp = x[j];
				x[j] = x[j+1];
				x[j+1] = temp;

			  }
		  }
	} for (int i = 0; i < x.length; i++)
	  System.out.print (" " + x[i]);
  }
}

