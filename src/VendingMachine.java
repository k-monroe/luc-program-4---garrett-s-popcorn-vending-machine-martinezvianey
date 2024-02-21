/**
 * Garrett's popcorn vending machine

Garrett's popcorn is looking to launch a vending machine that sells their world renowned popcorn.  The vending machine will contain a total of 9 products. 
The products are listed below in the chart along with purchase price.  To select an item, the end-user will enter the product row along with the column letter.
The program should enforce that only product row numbers and column letters can be entered. The end-user will be able to continously select up to  as they would 
like until they enter a sentinel value.
   

At the conslusion of selecting all items, the program will display the total number of items purchased and the total cost.

**Hints**
- Make use of two dimensional arrays.
- Consider parallel arrays



Your program should operate similarly to the program shown in the .gif below
The .gif below show three iterations of running the program

![Alt text](https://instructorc.github.io/site/slides/java/images/ds/program_4_sample_output.gif "Program 4 Execution Example")

**ARRAY CANNOT BE USED FOR THIS PROGRAM**

| Product Row | Column P               | Column N                       | Column R           |
|-------------|------------------------|-----------------------------------------------------|
| 0           | Garrett Mix ($14.99)   |  Pecan Carmel Crisp ($10.99)   | Plain ($6.99)      |
| 1           | Caramel Crisp ($16.99) |  Cashew Carmel Crisp ($9.99)   | Buttery ($8.99     |
| 2           | Cheese Corn ($12.99)   |  Almond Carmel Crisp ($11.99)  | Sweet Corn ($7.99)  


 */

 import java.util.Scanner; //Import the Scanner Class
 import java.util.Arrays; //Import the Array Class
 
 public class VendingMachine {
     public static void main(String[] args) throws Exception {
 
         // DECLARE VARIABLES
         String[] productRow = {"Product Row","0","1","2"};
         String[] columnP = {"Column P","Garrett Mix","Caramel Crisp","Cheese Corn"};
         String[] columnN = {"Column N","Pecan Carmel Crisp","Cashew Carmel Crisp","Almond Carmel Crisp"};
         String[] columnR = {"Column R","Plain","Buttery","Sweet Corn"};
 
         double[] columnPPrices = {14.99,16.99,12.99};
         double[] columnNPrices = {10.99,9.99,11.99};
         double[] columnRPrices = {6.99,8.99,7.99};
 
         String[][] vendingMachineItems = {productRow, columnP, columnN, columnR};
         double[][] vendingMachinePrices = {columnPPrices,columnNPrices,columnRPrices};
 
         Scanner scn = new Scanner(System.in);
         int userRowEntry;
         String userColumnEntry;
         int userColumnEntryInt;
         double finalCost = 0.0;
         int itemCount = 0;
 
         //WELCOME STATEMENT
         System.out.println("Welcome to the Garrett's Popcorn Vending Machine!");
         System.out.println();
         printVendingItems(vendingMachineItems);
 
         //PROMPT USER TO ENTER THEIR ROW SELECTION
         System.out.println("Listed above are items you can select.");
         System.err.print("Please enter row of desired product: ");
         userRowEntry = scn.nextInt();
 
         int continueProgram = 1;
         while(continueProgram == 1){
 
         // MAKE SURE USER ROW ENTRY IS VALID
         while(userRowEntry != 0 && userRowEntry != 1 && userRowEntry != 2){
             System.out.print("Invalid Entry, Please enter row of desired product: ");
             userRowEntry = scn.nextInt();
         }
 
         // PROMPT USER TO ENTER THEIR COLUMN SELECTION
         System.out.print("Please enter column of desired product: ");
         userColumnEntry = scn.next();
 
         // MAKE SURE USER COLUMN ENTRY IS VALID
         while(!userColumnEntry.equals("P") && !userColumnEntry.equals("N") && !userColumnEntry.equals("R")){
             System.out.print("Invalid Entry, Please enter row of desired product (capital P, N or R): ");
             userColumnEntry = scn.next();
         }
 
         //CONVERT USER COLUMN ENTRY TO INT SO IT CAN BE USED AS ARRAY INDEX
         if(userColumnEntry.equals("P")){
             userColumnEntryInt = 0;
         }else if(userColumnEntry.equals("N")){
             userColumnEntryInt = 1;
         }else{
             userColumnEntryInt = 2;
         }
 
         // ADD PRICE TO FINAL COST VARIABLE
         finalCost += vendingMachinePrices[userColumnEntryInt][userRowEntry];
 
         // ADD 1 TO NUMBER OF ITEMS PURCHASES
         itemCount += 1;
 
         // ASK USER TO EITHER CONTINUE PROGRAM OR ENTER SENTINEL VALUE
         printVendingItems(vendingMachineItems);
         System.out.print("Please enter row of desired product or -1 to EXIT : ");
         userRowEntry = scn.nextInt();
 
         if(userRowEntry == -1){
             // WHILE LOOP WILL END NOW THAT continueProgram = 0
             continueProgram = 0;
             // PRINT FINAL SUMMARY OF USER PURCHASES
             System.out.println("Summary of Items Purchased");
             System.out.println("*****************************");
             System.out.println(itemCount + " items purchased for a total cost of $" + finalCost);
         }
     }
 }//END OF MAIN
 
     public static void printVendingItems(String[][] vendingMachineItems){
 
         //PRINT CONTENTS OF VENDING MACHINE
         for(int i = 0; i < vendingMachineItems.length; i++){
 
             // DECLARE COLUMN BREAK TO BE USED FOR SECOND ROW
             String columnBreak = "-------------------------";
 
             // CREATE SECOND ROW BREAK BETWEEN COLUMN TITLES AND ITEMS
             if(i == 1){
                 int p = 0;
                 while(p < vendingMachineItems.length){
                     System.out.print("|" + columnBreak);
 
                     p++;
                 }
                 System.out.println("|");
             }
 
             //ITERATE THROUGH EACH ROW
             for(int j = 0; j < vendingMachineItems[i].length; j++){
 
                 System.out.print("| ");
                 System.out.print(vendingMachineItems[j][i]);
                 
                 // COMPUTE EQUAL COLUMN WIDTHS
                 int columnWidth = columnBreak.length() - 1;
                 columnWidth = columnWidth - vendingMachineItems[j][i].length();
                 int q = 0;
                 while(q < columnWidth){
                     System.out.print(" ");
                     q++;
                 }
 
             }
             // END ROW
             System.out.println("|");
         }
 
     }
 
 }
 
