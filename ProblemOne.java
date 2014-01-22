class ProblemOne {
	public static void main(String[] args) {
	int j = 0;
	for (int i = 0; i < 1000; i++){
		if (i%15 == 0){
			j = j + i;
		}
		else if (i% 5 == 0){
			j = j + i;
		}
		else if (i% 3 == 0){
			j = j + i;
		}
	}
	
	
	System.out.println(j);
	}
}
