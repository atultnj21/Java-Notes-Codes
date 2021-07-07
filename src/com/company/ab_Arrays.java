/* Arrays */
package com.company;

import java.util.Arrays;

public class ab_Arrays {
    public static void main(String[] args) {
/*
We use Arrays to store list of items, like a list
of numbers, or a list of people .
Arrays are Referenced types
syntax:
data_type[] object_name = new data_type[size of array]

Now, how can we see the actual items in this array.
We have a class in Java called arrays,this class is
defined in Java.util package we can use the dot operator
to access the members of this class. Here we have a method
called toString. we can call this method and pass our integer
array. And, this will return the string representation of this array.

So the first 4 items are initialized the others are set to
0 by default. Because here we're dealing with an integer array,
if we had a boolean array, all items by default get initialized false.
if you have a string array, all items get initialized on an empty
string.

Java arrays have a fixed size. So once we create them, we cannot
add or remove additional items to them, we have a fixed length

if you want to be able to add or remove additional items from an array,
you should use one of the collection classes .

*/
        int[] numbers = new int[5];
        numbers[0]=1;
        numbers[1]=4;
        numbers[2]=3;
        numbers[3]=5;
        System.out.println(numbers);//[I@4dd8dc3 (based on address)
        System.out.println(Arrays.toString(numbers));//[1, 4, 3, 5, 0]

        int[] nums ={2,3,5,1,4};
        System.out.println(nums.length);//5
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));//[1, 2, 3, 4, 5]
/*
Multi-Dimentional Arrays
we can also create multi-dimentional arrays, for example, we can
create a 2 dimentional array to store a matrix or we can create
a 3 dimensional array to store data for a cube.These are useful in
scientific computations.

we get this weird string, because here we're dealing with
the multidimensional array. To solve this problem, we need to use
another method in this class called deepTo string we use this for
printing multidimensional arrays.
*/
        int [][] numbs = new int[2][3];// two rows 3 columns
        numbs[0][0]=1;
        numbs[0][1]=4;
        System.out.println(Arrays.toString(numbs));
        //[[I@568db2f2, [I@378bf509]
        System.out.println(Arrays.deepToString(numbs));
        //[[1, 4, 0], [0, 0, 0]]

        int [][] numbrs={{1,2,3},{4,5,6}} ;
        System.out.println(Arrays.deepToString(numbrs));
        //[[1, 2, 3], [4, 5, 6]]
    }
}
