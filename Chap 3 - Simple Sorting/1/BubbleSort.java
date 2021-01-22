class ArrayBub
   {
   private long[] a;                 // ref to array a
   private int nElems;               // number of data items
//--------------------------------------------------------------
   public ArrayBub(int max)          // constructor
      {
      a = new long[max];                 // create the array
      nElems = 0;                        // no items yet
      }
//--------------------------------------------------------------
   public void insert(long value)    // put element into array
      {
      a[nElems] = value;             // insert it
      nElems++;   
 
      }
//--------------------------------------------------------------
   public void display()             // displays array contents
      {
      for(int j=0; j<nElems; j++)       // for each element,
         System.out.print(a[j] + " ");  // display it
      System.out.println("");
      }
//--------------------------------------------------------------
   public void bubbleSort()
      {
      int out, in;
        if (nElems%2 == 0)  {
            for(out=nElems-1; out>1; out--) {
                if(out%2 != 0) { 
                    for(in=0; in<out; in++) {      // inner loop (forward)
                        if( a[in] > a[in+1] ) {     // out of order?
                            swap(in, in+1);
                        }
                    }
                }
                else {
                    for(in=out-1; in>0; in--) {       // inner loop (forward)
                        if( a[in] < a[in-1] ) {       // out of order?
                            swap(in, in-1); 
                        }
                    }
                }
              }
            }
        else {
            for(out=nElems-1; out>1; out--) {
                if(out%2 == 0) { 
                    for(in=0; in<out; in++) {      // inner loop (forward)
                        if( a[in] > a[in+1] ) {     // out of order?
                            swap(in, in+1);
                        }
                    }
                }
                else {
                    for(in=out-1; in>0; in--) {       // inner loop (forward)
                        if( a[in] < a[in-1] ) {       // out of order?
                            swap(in, in-1); 
                        }
                    }
                }
              }
        }
                            
                         
       
      
      }  // end bubbleSort()
//--------------------------------------------------------------
   private void swap(int one, int two)
      {
      long temp = a[one];
      a[one] = a[two];
      a[two] = temp;
      }
//--------------------------------------------------------------
   }  // end class ArrayBub
////////////////////////////////////////////////////////////////
public class BubbleSort 
   {
   public static void main(String[] args)
      {
      int maxSize = 9999;            // array size
      ArrayBub arr;                 // reference to array
      arr = new ArrayBub(maxSize);  // create the array

      for(int j=0; j<maxSize; j++) {
	long n = (long)( java.lang.Math.random()*(maxSize-1) ); 
        arr.insert(n);
      }

       arr.display();                // display items
      long l1 = System.nanoTime();
      arr.bubbleSort();             // bubble sort them
      long l2 = System.nanoTime();
      System.out.println((l2-l1)/ (java.lang.Math.pow(10, 9)));
       arr.display();                // display them again
      }  // end main()
   } 