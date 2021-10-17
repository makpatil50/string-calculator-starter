package calculator;

class StringCalculator {

    public int add(String input) {
    	
    	String [] arr = input.split(",|\n");
    	
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
    		if(stringToInt(numbers[index])<=1000) {
    			sum = Integer.parseInt(numbers[index]) + sum;
    		}
    		
    	}
    	
    	return sum;
    }
    private int stringToInt(String number) {
        int num = Integer.parseInt(number);
        if (num < 0) {
            throw new IllegalArgumentException("Negative no not allowed");
        } else {
            return num;
        }
    }

}