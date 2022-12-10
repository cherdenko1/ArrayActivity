/* Final Examination and Activity COMPROG-11
 * Name: Mark Jess Anthony S. Enfermo
 * Course: BSIT-1B
 */

import java.util.*;

public class ArrayActivity
{
   public static void help() {
      System.out.println("1. ADD  2. DISPLAY    3. DELETE     4. COUNT    5. SEARCH   6.HELP   7. EXIT");
   }

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      boolean state = true;
      int opt, index, obj;
      //Init Arr Size
      System.out.print("Define Array Size: ");
      IntegerArray arr = new IntegerArray(scan.nextInt());

      help();

      while(state) {
         System.out.print("Option: ");
         opt = scan.nextInt();

         switch(opt) {

            case 1:
               //Add
               System.out.print("[1]Add to / Replace a specific index [2]Replace all: ");
               opt = scan.nextInt();
               if(opt == 1) {
                  System.out.print("Index: ");
                  index = scan.nextInt();
                  System.out.print("Number: ");
                  obj = scan.nextInt();

                  arr.add(index, obj);
               } else if(opt == 2) {
                  for(int i = 0; i < arr.arrLength; i++) {
                     System.out.printf("Number[%d]: ", i);
                     obj = scan.nextInt();
                     arr.add(i, obj);
                  }
               }
               break;

            //Display
            case 2:
               for(int i : arr.arr) {
                  System.out.printf("[%d] ", i);
               }
               System.out.println();
               break;

            //Delete
            case 3:
               System.out.print("[1]Delete a specific index [2]Delete All: ");
               opt = scan.nextInt();

               if(opt == 1) {
                  System.out.print("Index: ");
                  index = scan.nextInt();
                  arr.delete(index);
               } else if(opt == 2) {
                  for(int i = 0; i < arr.arrLength; i++) {
                     arr.delete(i);
                  }
               }
               break;

            //Count
            case 4:
               System.out.printf("Array Limit Size: %d%n", arr.arrLength);
               break;
            
            //Search
            case 5:
               System.out.print("Get the index(s) of: ");
               obj = scan.nextInt();

               for(int i = 0; i < arr.arrLength; i++) {
                  if(arr.arr[i] == obj)
                     System.out.printf("Found Number [%d] on index [%d]%n", obj, i);
               }
               break;

            //Help
            case 6:
               help();
               break;

            //Exit
            case 7: 
               System.out.println("Exiting...");
               state = false;

         }
      }
   }
}

class IntegerArray {
   public int[] arr;
   public int arrLength;

   public IntegerArray(int size) {
      arr = new int[size];
      arrLength = arr.length;

      for(int i = 0; i < arrLength; i++) {
         arr[i] = 0;
      }
   }

   public void add(int index, int item) {
      arr[index] = item;
   }

   public void delete(int index) {
      arr[index] = 0;
   }

}