# checkout_system
BC Group Assessment Test. Implemented in Java using IntelliJ IDEA. 


# Supermarket Checkout System with Promotions
The system emulates the work of supermarket checkout system. Various promotions can be added. There are three types of promotions:
1. Buy product X get product Y for free.
2. Buy product X in quantity more than Y and get products at discounted price.
3. Buy N number of products and get M number of the same products for free.

# To demostrate the functionality the main class is added. Descriptions of each menu items:

"1". Scan the items given in the example of BC Group Test and see results. Note that the case 4 is not from the test examples. See below all the test cases.

"2". List all promotions that are now used.

"3". Remove the first promotion. Hint: press "1" again to see the difference in case 3.

"4". Add promotion: buy 3 or more VGA and get them at price 20.0. Hint: press "1" again to see the difference in case 4.

"5". Exit

# Possible improvements:
1. Save everything in SQLite database not in Hashmap.
2. Now the system assumes that user who manages promotions does not make any mistakes. For example, it is possible to have both "buy 1 get 1" and "buy 1 get 2" promotions for the same product. Adding some checking might help.

______________________________________________________________________________________________________
# Test cases provided by the task and one additional case:

Case 1: SKUs Scanned: atv, atv, atv, vga. Total expected: $249.00

Case 2: SKUs Scanned: atv, ipd, ipd, atv, ipd, ipd, ipd. Total expected: $2718.95

Case 3: SKUs Scanned: mbp, vga, ipd. Total expected: $1949.98

Case 4: SKUs Scanned: vga, vga, vga, vga.
