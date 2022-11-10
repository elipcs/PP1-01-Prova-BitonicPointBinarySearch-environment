package problems;

public class BitonicPointBinarySearchImpl<T extends Comparable<T>> implements BitonicPointBinarySearch<T>{

    @Override
    public T bitonicPoint(T[] array) {
      if (array.length == 0){
        return null;
      }

      return searchT(array, 0, array.length - 1);
    }

    private T searchT(T[] array, int leftIndex, int rightIndex){
      int mid = (leftIndex + rightIndex) / 2;
      T point = array[mid];

      if (leftIndex < rightIndex){
        if (mid - 1 >= 0 && mid + 1 < array.length){
          
          if(array[mid].compareTo(array[mid - 1]) > 0 && array[mid].compareTo(array[mid + 1]) < 0){
            point = searchT(array, mid + 1, rightIndex);
          }

          else if(array[mid].compareTo(array[mid - 1]) < 0 && array[mid].compareTo(array[mid + 1]) > 0){
            point = searchT(array, leftIndex, mid - 1);
          }
        }

        else if(mid == 0){
          if (array[mid].compareTo(array[mid + 1]) < 0){
            point =  array[mid + 1];
          }
        }

        else if(mid == array.length - 1){
          if (array[mid].compareTo(array[mid - 1]) < 0){
            point = array[mid - 1];
          }
        }
      }

      return point;
    }
}