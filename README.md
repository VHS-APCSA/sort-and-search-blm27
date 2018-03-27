# Sort-and-Search

In the Comperable project you created a Name class that has a first name, a last name and a compareTo method. 
In this project you are going to make an array (not an ArrayList) of at least 20 Name objects, sort them using 
a sorting algorithm of your choice that is guaranteed to terminate before the end of the semester, then implement 
a binary search to find a name in the list. In detail, you need to do the following:

  1. Create a class  named NameList with an instance variable that has an array of Name objects as an instance variable.
  2. Initialize the array in the constructor. You can do this by hard-coding an array, by taking user input or by reading a list from a file.
  3. Have a sort method in the NameList class that sorts the array.
  4. Have a search method in the NameList class that takes a Name object as a parameter and returns the index of the Name in the array or -1 if it does not exist.
  5. Have a toString method that prints out the names in the array in the format 
       lastName, firstName, one per line.
  6. Create a runner that does the following
      a) Instantiates a NameList object.
      b) Prints the contents of the array.
      c) Sorts the array.
      d) Prints the contents of the sorted array.
      e) Searches for a name that exists in the array and prints the return value.
      f) Searches for a name that does not exist in the array and prints the return value.
