class ArrayBub
   {
   private long[] a;                 // ref to array a
    int nElems;               // number of data items
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
      nElems++;                      // increment size
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
        int l =0;
        int amountOfIterations = 0;
        while(l != nElems - 1) {
            l = 0; 
            for(int i=0; i < nElems - 1; i++) { 
                     if(a[i] <= a[i+1]) {
                         l++;
                     }
                 }
             for(in=0; in < nElems - 1; in++) {
                 
                 if (in%2 != 0 && a[in] > a[in + 1 ]) {
                     swap(in, in+1);
                 }
                 else if(in%2 == 0 && a[in] > a[in + 1 ]) {
                     swap(in, in+1);
                 }
                 
             }
             amountOfIterations++;
             
        }
        System.out.println("Количество итераций - " + amountOfIterations);
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
public class BubbleSortApp
   {
   public static void main(String[] args)
      {
      int maxSize = 10000;
      ArrayBub ar = new ArrayBub(maxSize);
         for(int i = 0; i < maxSize; i++) {
           long l =(long) (java.lang.Math.random()*(maxSize - 1) );
           ar.insert(l);
         }
         System.out.println(ar.nElems);
      long l1 = System.currentTimeMillis();
      ar.bubbleSort();
      long l2 = System.currentTimeMillis();
      System.out.println(l2-l1);
      ar.display();
      }  // end main()
   }