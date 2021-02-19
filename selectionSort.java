public class selectionSort{
    public static void main(String a[])
	{  
		int[] myArray = {5,8,6,1,7,9}; 
		
		System.out.println("------Before Selection Sort-----");
		printArray(myArray);
 
 
		selection(myArray);//sorting array using selection sort  
		System.out.println("-----After Selection Sort-----");  
 
		printArray(myArray); 
	} 
	
		public static void selection(int[] array)
	{  
		for (int i = 0; i < array.length - 1; i++)  
		{  
			System.out.println("Sort Pass Number "+(i+1));
			int index = i;  //0
			for (int j = i + 1; j < array.length; j++)//1
			{   
			    System.out.println("Comparing "+ array[index]  + " and " + array[j]);  //0 ,1
				if (array[j] < array[index]){ //0<1
				System.out.println(array[index]  + " is greater than " + array[j] );
					index = j;
				
				
				}  
			}  
			
 
			int smallerNumber = array[index];   
			array[index] = array[i]; 
			array[i] = smallerNumber;  
			System.out.println("Swapping Elements: New Array After Swap");
			printArray(array);
		}  
	}  
	static void printArray(int[] array){
	    
	    for(int i=0; i < array.length; i++)
		{  
			System.out.print(array[i] + " ");  
		} 
	    System.out.println();
	    
	}
 

}