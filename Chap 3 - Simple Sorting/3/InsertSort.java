import java.util.*;
 

// demonstrates insertion sort
// to run this program: C>java InsertSortApp
//--------------------------------------------------------------
class ArrayIns
   {
   private Long[] a;                 // ref to array a
   private int nElems;               // number of data items
//--------------------------------------------------------------
   public ArrayIns(int max)          // constructor
      {
      a = new Long[max];                 // create the array
      nElems = 0;                        // no items yet
      }
//--------------------------------------------------------------
   public void insert(long value)    // put element into array
      {
      a[nElems] = value;             // insert it
      nElems++;                      // increment size
      }
//--------------------------------------------------------------
   public void display()             // displays array contents
      {
      for(int j=0; j<nElems; j++)       // for each element,
         System.out.print(a[j] + " ");  // display it
      System.out.println("");
      }
   public double median() {
      if(nElems%2 !=0) {
      	 return a[nElems/2];
      }
      else {
         return 0.5*(a[nElems/2] + a[nElems/2-1]);
      }
   }
   public void noDups(){
      int l = 0;
      for(int j=0; j<nElems; j++) {
          List<Long> newList = Arrays.asList(a);
          while(newList.contains(a[j])){
              newList.remove(a[j]);
          }
          if(l>1) {
              
          }
          
      }
   }
   public void noDups2(){
      int l = 0;
      int m = 0;
      List<Long> newList = new ArrayList<>();
      for(int j=0; j<nElems-1; j++) {
          while((j+l < nElems-1) && a[j + ++l] == a[j]) {
             a[j+l] = null; 
          }
          l=0;
      }
      for(Long i:a) {
          if(i != null) {
              newList.add(i);
          }
      }
      nElems = newList.size();
      a = new Long[nElems];
      Long[] ar =  newList.toArray(a);
      a= ar;
      
   }
//--------------------------------------------------------------
   public void insertionSort()
      {
      int in, out;

      for(out=1; out<nElems; out++)     // out is dividing line
         {
         long temp = a[out];            // remove marked item
         in = out;                      // start shifts at out
         while(in>0 && a[in-1] >= temp) // until one is smaller,
            {
            a[in] = a[in-1];            // shift item to right
            --in;                       // go left one position
            }
         a[in] = temp;                  // insert marked item
         }  // end for
      }  // end insertionSort()
//--------------------------------------------------------------
   }  // end class ArrayIns
////////////////////////////////////////////////////////////////
public class InsertSort 
   {
   public static void main(String[] args)
      {
           // array size
      ArrayIns arr;                 // reference to array
      arr = new ArrayIns(43);  // create the array
      
      int value = 0;   
      
      arr.insert(1);
      arr.insert(1);
      arr.insert(1);
      arr.insert(1);
      arr.insert(2);
      arr.insert(2);
      arr.insert(2);
      arr.insert(2);
      arr.insert(22);
      arr.insert(22);
      arr.insert(0);
      arr.insert(0);
      arr.insertionSort();
      arr.noDups2();
      arr.display();                // display items

      }  // end main()
   }  // end class InsertSortApp