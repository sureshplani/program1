package prog1;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,30,40,50};
		int key=10;
	        int pos=0;
		for(int i:arr) {
			pos++;
			if(i==key)
			System.out.println("possion:"+pos);
			}
		}

	}


