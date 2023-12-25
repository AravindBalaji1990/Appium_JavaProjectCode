package Search;

public class LinearSearch {

	/*Linear search or sequential search is a method for finding a particular value in a list, 
	that consists of checking every one of its elements, one at a time and in sequence, until the desired one is found.*/
	
	public static int linerSearch(int[] arr, int key){
        int size = arr.length;
        for(int i=0;i<size;i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
	
	public static void main(String a[]){
        
        int[] arr1= {23,45,21,55,234,1,34,90};
        int searchKey = 34;
        System.out.println("Key "+searchKey+" found at index: "+linerSearch(arr1, searchKey));
        int[] arr2= {123,445,421,595,2134,41,304,190};
        searchKey = 421;
        System.out.println("Key "+searchKey+" found at index: "+linerSearch(arr2, searchKey));
    }
}
