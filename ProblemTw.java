class ProblemTw {
	public static void main(String[] args) {

	int i = 1;	
	int j = 1;
	int k = 2;
	int sum = 0;
	while (k < 4000000){
		int number = j + k;
		if (number%2 == 0){
			sum = sum + number;
		}
		j = k;
		k = number;
		
		
	}
	sum = sum + 2;
	
	System.out.println(sum);
	}
	
}