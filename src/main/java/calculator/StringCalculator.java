package calculator;

class StringCalculator {

    public int add(String input) {
    	
    	String [] arr = input.split(",");
    	
        if(input.isEmpty()) {
        	return 0;
        }else if(arr.length == 1) {
    		return Integer.parseInt(arr[0]);
    	}
    	else  {
    		return getSum(arr);
    	}
    }
    
    private int getSum(String[] numbers)  {
    	int sum = 0;
    	for(int index = 0; index < numbers.length;index++) {
    		sum = Integer.parseInt(numbers[index]) + sum;
    		
    	}
    	
    	return sum;
    }

}