
class StartUp2 {
	public static void main(String[] args){
	
		try{
			int  sum = 0;
			int[] array = new int[3];

			array[0]= 100;
			array[1]= 200;
			array[2]= 300;
			array[3]= 400;


			for(int i =0;i < array.length;i++){
				sum = sum + array[i];
			}

			System.out.println("‡Œv:"+sum);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}



