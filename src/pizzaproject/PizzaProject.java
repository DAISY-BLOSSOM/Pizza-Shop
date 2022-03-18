
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaproject;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Ali
 */
class Radix {
 
    // A utility function to get maximum value in arr[]
    private static int getMax(int arr[], int n)
    {
        int mx = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i] > mx)
                mx = arr[i];
        return mx;
    }
 
    // A function to do counting sort of arr[] according to
    // the digit represented by exp.
    private static void countSort(int arr[], int n, int exp)
    {
        int output[] = new int[n]; // output array
        int i;
        int count[] = new int[10];
        Arrays.fill(count, 0);
 
        // Store count of occurrences in count[]
        for (i = 0; i < n; i++)
            count[(arr[i] / exp) % 10]++;
 
        // Change count[i] so that count[i] now contains
        // actual position of this digit in output[]
        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];
 
        // Build the output array
        for (i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }
 
        // Copy the output array to arr[], so that arr[] now
        // contains sorted numbers according to current digit
        for (i = 0; i < n; i++)
            arr[i] = output[i];
    }
 
    // The main function to that sorts arr[] of size n using
    // Radix Sort
    static void radixsort(int arr[], int n)
    {
        if(n==0 )
            return;
        // Find the maximum number to know number of digits
        int m = getMax(arr, n);
 
        // Do counting sort for every digit. Note that
        // instead of passing digit number, exp is passed.
        // exp is 10^i where i is current digit number
        for (int exp = 1; m / exp > 0; exp *= 10)
            countSort(arr, n, exp);
    }


}
public class PizzaProject {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
 /*  Our spaceship’s cook has baked a zero-gravity pizza and cut it into n slices,
but the lack of gravity madehim clumsy andthe pizza wasn’t evenly sliced;
the n slices have size s1; s2; ... ; sn. There aren hungry space travelers on board who each want to eat a slice of pizza.
Suppose the ith traveler would be happy with any slice whose size is at least ti. Give an efficient algorithm to determine whether 
it is possible to distribute the pizza slices so everyone is happy.Design and implement an efficient algorithm for this Problem. */
 Gui project = new Gui();
 project.setSize(400, 320);
 project.setVisible(true);
 project.setTitle("All going to ash wallah");
    }
    
}