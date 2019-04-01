import java.util.ArrayList;

public class BasicList {

	public static void main(String[] args) {
		
		ArrayList myList = new ArrayList();
		
		int arrayValue = 10;
		boolean isValue = false;
		
		for(int i = 0; i < 10; i++) {
			
			myList.add(i, arrayValue);
			
			arrayValue += 10;
			
		}
		
	    System.out.println(myList.toString());
	    
	    System.out.println("Size of the list is " + myList.size());
	    
	    myList.add(200);
	    
	    myList.set(5, myList.get(10));
	    
	    arrayValue = 60;
	    
	    for(int i = 6; i < myList.size(); i++) {
	    	
	    	myList.set(i, arrayValue);
	    	
	    	arrayValue += 10;
	    	
	    }
	    
	    System.out.println(myList.toString());
		
	    System.out.println("Size of the list is " + myList.size());
	    
	    int counter = 0;
	    
	    while(!isValue) {
		    	
	    	if((int)(myList.get(counter)) == 200) {
	    		
	    		isValue = true;
	    		
	    		System.out.println("Value 200 is located at index " + counter);
	    	}
	    	
	    	counter++;
	    	
	    }
	}
	
}
