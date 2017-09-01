import java.util.Arrays;

public class yes {

  public static void main(String[] args){
  
    int[] arr = new int[5];
  
    //push
    arr[0] = 4;
    arr[1] = 2;
    arr[2] = 7;
    arr[3] = 1;
    arr[4] = 3;
    
    for (int i=0; i < arr.length; i++){
      for(int j=0; j < arr.length; j++){
        if(arr[i] < arr[j]){
         int temp = arr[i];
         arr[i] = arr[j];
         arr[j] = temp;
        }
      }
    }
  
    //pop
    for(int i=arr.length-1; i >= 0; i--){
      System.out.print(arr[i] + " ");
    }
    
    System.out.println();
   
    //queue pop
    for (int i=0; i <= arr.length - 1; i++){
      System.out.print(arr[i] + " ");
    }
  }
}