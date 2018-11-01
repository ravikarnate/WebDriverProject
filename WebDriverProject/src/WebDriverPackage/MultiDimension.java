package WebDriverPackage;

public class MultiDimension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int apples [][] = {{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}};
		
		othermethod(apples);
	}

	
	public static void othermethod(int dummy[][])
	{
		for(int r=0; r<dummy.length;r++)
		{
			for(int c=0; c<dummy[r].length; c++)
			{
				System.out.print(dummy[r][c] + "\t");
			}

			System.out.println();
		}
	}

}
