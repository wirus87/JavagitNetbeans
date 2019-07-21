class Quicksort {
  // Konfiguruje wywo³anie w³aœciwej metody algorytmu Quicksort.
  static void qsort(int items[]) {
    qs(items, 0, items.length-1);
  }
  // Rekurencyjna wersja Quicksort sortuj¹ca tablicê znaków.
  private static void qs(int items[], int left, int right)
  {
    int i, j;
    int pivot, temp;
    i = left; j = right;
    pivot = items[j]; //(left+right)/2
    do {
      while((items[i] < pivot) && (i < right)) i++;
      while((pivot < items[j]) && (j > left)) j--;
      if(i <= j) {
        temp = items[i];
        items[i] = items[j];
        items[j] = temp;
        i++; j--;
      }
   } while(i <= j);
   if(left < j) qs(items, left, j);
   if(i < right) qs(items, i, right);
  }
}

class QSDemo {
  public static void main(String args[]) {
    int a[] = { 5,7,3,12,2,6,4,1,34,24,16,22 };
    int i;
    
    System.out.print("Tablica przed posortowaniem: ");
    for(i=0; i < a.length; i++)
      System.out.print(" "+a[i]);
    System.out.println();
    
    // sortuje tablicê
    Quicksort.qsort(a);
    System.out.print("Tablica posortowana: ");
    for(i=0; i < a.length; i++)
    System.out.print(" "+a[i]);
  }
}