class ArrayIns
   {
   private long[] a;                 // ref to array a
   private int nElems;               // number of data items
//--------------------------------------------------------------
   public ArrayIns(int max)          // constructor
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
   public double median() {
      if(nElems%2 !=0) {
      	 return a[nElems/2];
      }
      else {
         return 0.5*(a[nElems/2] + a[nElems/2-1]);
      }
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
      }
   
   public void insertionSort1() {
      int in, out;
      int i = 0,j = 0;
      for(out=1; out<nElems; out++) {
         long temp = a[out];   
         in = out;           
         while(in>0) {
             i++;
             if( a[in-1] >= temp) {
                a[in] = a[in-1];       
   
                j++;
             }
             --in;
         }
         a[in] = temp;                   
      }  
      System.out.println("Количество сравнений : " + i);
      System.out.println("Количество копирований : " +j);
   } // end insertionSort()
//--------------------------------------------------------------
   }  // end class ArrayIns
////////////////////////////////////////////////////////////////
public class InsertSort 
   {
   public static void main(String[] args)
      {
 int maxSize = 10 ;            // array size
      ArrayIns arr;                 // reference to array
      arr = new ArrayIns(maxSize);  // create the array

      int value = 10 ;   
      for(int j=0; j<maxSize; j++) {
        arr.insert(value--);
      }

      arr.display();                // display items
      arr.insertionSort1();
      arr.display();
      System.out.println(arr.median());
      }  // end main()
   }  // end class InsertSortApp
// сложность данного алгоритма равна O(n*n/2). 
// При неотсортированных данных и при отсортированных данных сложность одинаковая,
// однако копирование при отсортированных данных не осуществляется, что позитивно влияет 
//на скорость выполнения программы
 