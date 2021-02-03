# Array and ArrayList Recursion

For homework, you write a couple methods to practice working with recursion. You should practice using recursion for all of these problems! For all of these methods you should write both the recursive method and the wrapper method. You may adjust the parameters for your recursive method, but **don't change** the parameters for the wrapper methd. 

First, write a method to check if an ArrayList is sorted in non-decreasing order.

The wrapper method should have the following signature:

```shell script
public static boolean isSorted(ArrayList<Integer> list) { }
```

<br />
<br />

Next, write a method to check if an array contains exactly **count** copies of the given integer x. (For instance, if we wanted to see if an array contained exactly 3 copies of the number 12, then we would have x = 12 and count = 3).

The wrapper method should have the following signature:
```shell script
public static boolean hasCountCopies(int[] arr, int x, int count) { }
```

<br />
<br />

Finally, implement binary search recursively. Note that the variables that we used for binary search (lowerBound and upperBound) are  **parameters** for the recursive method you have been provided with. 

Your wrapper method should have the follwing signature:

```shell script
public static boolean binarySearch(int[] arr, int num) { }
```

<br />

## Run your code with:
```shell script
make run
```

## Run your tests with:
```shell script
make test
```