# Garrett's popcorn vending machine

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

![Alt text](https://instructorc.github.io/site/slides/java/images/ds/prog4_output.gif "Program 4 Execution Example")

**YOU MUST MAKE USE MULTI-DIMENSIONAL ARRAY(S) FOR THIS PROGAM**

| Product Row | Column P               | Column N                       | Column R           |
|-------------|------------------------|--------------------------------|--------------------|
| 0           | Garrett Mix ($14.99)   |  Pecan Carmel Crisp ($10.99)   | Plain ($6.99)      |
| 1           | Caramel Crisp ($16.99) |  Cashew Carmel Crisp ($9.99)   | Buttery ($8.99     |
| 2           | Cheese Corn ($12.99)   |  Almond Carmel Crisp ($11.99)  | Sweet Corn ($7.99) |                           


## Sample output below:
```
Welcome to the Garrett's Popcorn Vending Machine!

Row     Column P                Column N                        Column R
0       Garrett Mix             Pecan Carmel Crisp              Plain
1       Caramel Crisp           Cashew Carmel Crisp             Buttery
2       Cheese Corn             Almond Carmel Crisp             Sweet Corn       
Listed above are items you can select.
Please enter row of desired product: 5
Invalid Entry, Please enter row of desired product: 4
Invalid Entry, Please enter row of desired product: 3
Invalid Entry, Please enter row of desired product: 2
Please enter column of desired product: W
Invalid Entry, Please enter either capital P, N or R of desired product: P
You enter selected Cheese Corn for a price of 12.99

Row     Column P                Column N                        Column R
0       Garrett Mix             Pecan Carmel Crisp              Plain
1       Caramel Crisp           Cashew Carmel Crisp             Buttery
2       Cheese Corn             Almond Carmel Crisp             Sweet Corn       
Listed above are items you can select.
Please enter row of desired product or -1 to EXIT : 0
Please enter column of desired product: N
You enter selected Pecan Carmel Crisp for a price of 10.99

Row     Column P                Column N                        Column R
0       Garrett Mix             Pecan Carmel Crisp              Plain
1       Caramel Crisp           Cashew Carmel Crisp             Buttery
2       Cheese Corn             Almond Carmel Crisp             Sweet Corn       
Listed above are items you can select.
Please enter row of desired product or -1 to EXIT : 2
Please enter column of desired product: P
You enter selected Cheese Corn for a price of 12.99

Row     Column P                Column N                        Column R
0       Garrett Mix             Pecan Carmel Crisp              Plain
1       Caramel Crisp           Cashew Carmel Crisp             Buttery
2       Cheese Corn             Almond Carmel Crisp             Sweet Corn
Listed above are items you can select.
Please enter row of desired product or -1 to EXIT : 2
Please enter column of desired product: P
You enter selected Cheese Corn for a price of 12.99

Row     Column P                Column N                        Column R
0       Garrett Mix             Pecan Carmel Crisp              Plain
1       Caramel Crisp           Cashew Carmel Crisp             Buttery
2       Cheese Corn             Almond Carmel Crisp             Sweet Corn
Listed above are items you can select.
Please enter row of desired product or -1 to EXIT : -1

Summary of Items Purchased
*****************************
4 items purchased for a total cost of $49.96
```



*** Listed below is a list of requirements that need to be completed for your program

** Requirement 1 (5 Points) **
Variables are properly declared and initialized; Use of Scanner Object to read input from console. Make use of constant final variables. 
Whenever possible, make sure to declare all variables that will hold data along with declaring final variables that will not change during runtime.
Proper structure used for allowing the end-user to continously enter new items until they enter a sentinel value that indicates they are finished

** Requirement 2 (5 Points) **
Input/Output of all necessary information for each item entry; Program properly makes use of arrays/multi-dimensional arrays to structure data;
Program restricts the use of the row numbers and column characters shown in chart (Validating Data). Program displays each item and cost for each iteration.

** Requirement 3 (5 Points) **
At the conclusion of all entries, the program provides a 1)Total number of items selected and  2) Total price of all items

** Requirement 4 (5 Points) **
Style - Proper use of comments, spacing, in program; use of descriptive variable names

** Requirement 5 (5 Points) **
Program is submitted by the due date listed and pushed to assigned GitHub Repository; Repository contains a minimum of three commits.

** Extra Credit (2 Points) **
Producing the chart is optional, but for anyone who includes the chart, 2pts. of extra credit will be granted. _Hint: Consider use of the tab escape sequence and nested looping structures_


## Submission
Your project folder will need to be submitted to the assigned GitHub repository provided to you by the instructor. In Sakai, you will need to submit the link to your repository by the due date and time listed in the write-up. Make sure you receive confirmation from Sakai that your assignment has been submitted.
If you prefer, you can also submit the .java file to Sakai.

