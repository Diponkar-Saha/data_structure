public class insertion{
    	
    public static void main(String a[])
    {    
        int[] myArray  = {5,8,6,1,7,9};  
        
        System.out.println("Before Insertion Sort");  
        
        printArray(myArray);
            
        insertionSort(myArray);//sorting array  
           
        System.out.println("After Insertion Sort");  
        
        printArray(myArray);   
    }    
 public static void insertionSort(int arr[]) 
	{  
        int n = arr.length;  
        
        for (int i = 1; i < n; i++)
        {   System.out.println("Sort Pass Number "+(i));
            int key = arr[i];  
            int j = i-1;  
            
            while ( (j > -1) && ( arr [j] > key ) ) 
            {  
            System.out.println("Comparing "+ key  + " and " + arr [j]); 
                arr [j+1] = arr [j];  
                j--;  
            }  
            arr[j+1] = key; 
            System.out.println("Swapping Elements: New Array After Swap");
            printArray(arr);
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

