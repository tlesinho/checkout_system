# checkout_system
Supermarket Checkout System with Promotions
The system emulates the work of supermarket checkout system. Various promotions can be added. There are three types of promotions:
1. Buy product X get product Y for free.
2. Buy product X in quantity more than Y and get products at discounted price.
3. Buy N number of products and get M number of the same products for free.

To demostrate the functionality the main class is added. Descriptions of each manu items:
1. Scan the items given in the example of BC Group Test and see results. Note that the case 4 is not from the test examples.
2. List all promotions that are now used.
3. Remove the first promotion. Hint: press "1" again to see the difference in case 3.
4. Add promotion: buy 3 or more VGA and get them at price 20.0. Hint: press "1" again to see the difference in case 4.

Possible improvements:
1. Save everything in SQLite database not in Hashmap.
2. No the system assumes that user who manages promotions does not make any mistakes. For example, it is possible to have both 
"buy 1 get 1" and "buy 1 get 2" promotions for the same product. Adding some checking might help.
