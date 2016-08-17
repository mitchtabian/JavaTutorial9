package JavaTests;

public class FizzBuzz {

	public static void main(String[] args) {
		for(int i = 1; i<101; i++){
			if(FizzBuzz(i, 15) == 0){
				System.out.println(i + ": FizzBuzz.");
			}
			else if(FizzBuzz(i,3) == 0){
				System.out.println(i + ": Fizz.");
			}
			else if(FizzBuzz(i,5) == 0){
				System.out.println(i + ": Buzz.");
			}
			
		}

	}
	
	static public int FizzBuzz(int a, int b){
		return a%b;
	}

}
