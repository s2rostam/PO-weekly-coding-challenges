import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Create a function that takes an array and a number and selectively reverse the order of the array based on 
 * the number you're given (second argument). If you're given the arguments [1,2,3,4,5,6] and 
 * 2, you would return the array [2,1, 4,3, 6,5].
 */

 public class SelectiveReverse {
    public static int[] selectiveReverse(int[] array, int n) {
        // if length 0 return array
        if (array.length == 0) {
            return array;
        }
        //if length greater than or equal reverse the entire array
        else if (n >= array.length) {
            List<Integer> arrList = Arrays.stream(array).boxed().collect(Collectors.toList());
            Collections.reverse(arrList);
            return arrList.stream().mapToInt(Integer::intValue).toArray();
        }
        // Otherwise selevtively reverse
        else {
            int currIndex = 0;

            while (currIndex < array.length) {
                int endIndex = (currIndex + n) -1;
                double halfway = Math.ceil(n/2);

                // If the array length is not matching endIndex adjust to be at the end of the array
                if (endIndex > array.length-1) {
                    endIndex = array.length-1;
                    double adj = endIndex-currIndex;
                    halfway = Math.ceil(adj/2);
                }
                
                //Switch the places
                for (int i = 0; i < (int) halfway; i++) {
                    int temp = array[currIndex+i];
                    array[currIndex+i] = array[endIndex-i];
                    array[endIndex-i] = temp;
                }

                //increment the pointer
                currIndex = currIndex + n;
            }

            return array;
        }   
    }
    
    public static void main (String[] args) {
        int[] test = selectiveReverse(new int[] {5,7,2,6,0,4,6}, 10);
        System.out.println(Arrays.toString(test));
    }
 }