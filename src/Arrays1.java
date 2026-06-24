import java.util.*;
public class Arrays1 {

 public static void main(String[] args) {
  Integer iArr[] = { 2, 1, 9, 6, 4, 54, 7, 89 };
  // let us print all the elements available in list
  
  System.out.println(Arrays.toString(iArr));
  
  
  for (int number : iArr) {
   System.out.println("Number = " + number);
  }
  
  
  
  Arrays.sort(iArr); //complete array
  //Arrays.sort(iArr, 1, 5); range
  //Arrays.sort(iArr, Collections.reverseOrder()); 
  System.out.println("after sorting");
  for (int number : iArr) {
   System.out.println("Number = " + number);
  }
  
  String names[]= {"Amit","Zoya","Ankit","Riya"};
  
  Arrays.sort(names);
 // System.out.println("Sras");
  for (String n : names) {
   System.out.println("Name = " + n);
  }
  
  int arr1[]= {10,20,30,40,50};
  
  int pos = Arrays.binarySearch(arr1, 30);
  
  System.out.println(pos);
  
  int arr2[] = new int[10];
  System.out.println(Arrays.toString(arr2));
  
  Arrays.fill(arr2,100);
  
  System.out.println(Arrays.toString(arr2));
  
  Arrays.fill(arr1,1,3,900);
  
  System.out.println(Arrays.toString(arr1));
  
  
  int arr4[] = {10,20,30,50};
  int arr5[] = {10,20,40,60};
  
  if(Arrays.equals(arr4, arr5))     //if(arr4==arr5)
  {
   System.out.println("both are equal");
  }
  else
  {
   System.out.println("both are not equal");
  }
  
  System.out.println("mismatch pos :"+Arrays.mismatch(arr4, arr5));     //if(arr4==arr5)
  
  System.out.println("compare "+Arrays.compare(arr4, arr5));
  //0 -->equal
  //-1---> not equal
  
  
  int a[][]= {{1,2},{3,4}};
  int b[][]= {{1,2},{3,4}};
  if(Arrays.deepEquals(a, b))    //if(arr4==arr5)
  {
   System.out.println("both are equal");
  }
  else
  {
   System.out.println("both are not equal");
  }
  int arr6[] = {10,20,30};
  int arr7[] = arr6;//pass be reference
  
  int copy[] = Arrays.copyOf(arr6, 4);
  System.out.println(Arrays.toString(copy));
  
  /*1. sort student marks
   * 
   * 2. Search roll number
   * 
   * 3. compare exam result
   * 
   * 
   * 4. copy employee id
   * 
   * 5. fill attendence array
   * 
   * Project
   * 
   * Student Result Analyzer
   * sort/highest/lowest/average/search
   * 
   * 
   */
 
 }

}


/*
 * 
 * Utility class in java
 * 
 * contains static methods
 * 
 * no object required
 * 
 */