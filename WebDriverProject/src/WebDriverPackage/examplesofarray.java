package WebDriverPackage;

public class examplesofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int students[] = new int[5];
		
		students[0] = 000;
		students[1] = 100;
		students[2] = 200;
		students[3] = 300;
		students[4] = 400;
        //System.out.println(students[5]);
		
		int sizeofarray = students.length;
		System.out.println(sizeofarray);
		for(int i=0;i<sizeofarray;i++) {
			System.out.println( +students[i]);
		}
	}

}
