void main() {
  /*Opgave 1: Shopping cart
  double item1 = 25.50;
  double item2 = 15.0;
  double item3 = 30.00;
  double totalPrice = item1 + item2 + item3;
  double taxRate = 25.0;
  double priceWithTax = totalPrice + (totalPrice * taxRate / 100.0);
  System.out.println(totalPrice);
  System.out.println(priceWithTax);
  */

  /*Opgave 2: Split Bill
  double food = 450.0;
  double drinks = 120.0;
  double tips = 50.0;
  int people = 4;
  double totalBill = food + drinks + tips;
  double billPerPeople = totalBill / people;
  System.out.println(billPerPeople);
  */

  /*Opgave 3: Discount calculation
  double price = 300;
  double discountPercent = 20.0;
  double discountprice = price - (price * discountPercent / 100.0);
  double taxRate = 25.0;
  double finalPrice = discountprice + (discountprice * taxRate / 100.0);
  System.out.println(price);
  System.out.println(discountprice);
  System.out.println(finalPrice);
  */

  /*Opgave 4: Party Planning
  int guests = 15;
  int cupcakes = 40;
  int cupcakePerGuest = cupcakes - guests;
  int leftovers = cupcakes % guests;
  System.out.println("Each guest gets " + cupcakePerGuest + " cupcakes");
  System.out.println(leftovers + " cupcakes left over");
  */

  /*Opgave 5: Build greeting message
  String name = "Anna";
  int age = 25;
  StringBuilder sb = new StringBuilder("Hello ");
  sb.append(name);
  sb.append(" you are ");
  sb.append(age);
  sb.append(" years old");
  String result = sb.toString();
  System.out.println(result);
  */

  /*Opgave 6: Use+=
  int variabel1 = 100;
  System.out.println(variabel1);
  int variabel2 = variabel1 + 50;
  System.out.println(variabel2);
  int variabel3 = variabel2 + 25;
  System.out.println(variabel3);

  int score = 100;
  System.out.println(score);
  score += 50;
  System.out.println(score);
  score += 25;
  System.out.print(score);
  */

  /*Opgave 7: Using -=
  int health = 100;
  health -= 15;
  System.out.println(health);
  health -= 20;
  System.out.println(health); //
   */

  /*Opgave 8: Using *=
  double price = 50.0;
  System.out.println(price);
  price *= 2;
  System.out.println(price);
  */

  /*Opgave 9: Increment og decrement med 1
  int counter = 10;
  System.out.println(counter);
  counter++;
  System.out.println(counter);
  counter--;
  System.out.println(counter);
   */

  /*Opgave 10: All compound operators
  int number = 10;
  number += 5;
  System.out.println(number);
  number -= 3;
  System.out.println(number);
  number++;
  System.out.println(number);
  number--;
  System.out.println(number);
  */

  /*Opgave 11: E-commerce product
  String productName = "Laptop";
  double productPrice = 7999.99;
  boolean inStock = true
  int stockQuantity = 15;
  double discountPercent = 10.0;
  String category = "Electronics"";
   */

  /*Opgave 12: Karaktersystem
  String studentName = "Anna";
  int testScore = 85;
  int taskScore =92;
  double finalAverageGrade = 88.5;
  boolean passedCourse = true;
   */

  /*Opgave 13: Bookingsystem
  String guestName = "Peter Hansen"
  int roomNumber = 204;
  int numberOfNights = 3;
  double pricePerNight = 899.0;
  boolean hasBreakfast = true;
  double totalAmount = 2697.0;
   */

  /*Opgave 14: Fitness Tracker
  int numberOfSteps = 8547;
  int goalSteps = 10000;
  double distanceKm = 6.0;
  int burned calories = 420;
  boolean reachedGoal = false;
   */

  /*Opgave 15:
  String bookTitle = "";
  String autherName = "";
  String isbnNumber = "";
  int pageCount = ;
  boolean isAvailable = ;
  String borrowerName = "";
  String dueDate = "";
  double lateFeeAmount = ;
  boolean isBestseller = ;
  double rating = ;
   */

  /*Spm. 1: Integer division: Når du dividerer to heltal. Resultatet bliver også et heltal
  og resten (decimalt) bliver kasseret eller afrundet nedad mod nul (truncation).

  Double division: Når mindst ét af tallene er et flydende punkt tal (double eller float).
  Resultatet inkluderer decimaler, mere præcist svar. Ligesom almindelig divisor i matematik.

  Int division er hurtige og groft for hele tal, hvorimod double divison er fin og præcis.
   */

  /*Spm. 2: Parenteser i  calculations bruges primært for at styre rækkefølgen af operationer,
  undgå tvetydighed og gøre udtryk klarere.

  Ligesom i matematik. Multiplikation (*) og division (/) har højere prioritet end addition (+) og
  subtraktion (-).

  Ved blandede datatyper eller division: parenteser kan hjælpe med at tvinge typen eller rækkefølgen.
   */

  /*Spm. 3: Modulo-operatoren (%) giver resten efter en division mellem to tal.
  --> Formel: a % b = resten af a divideret med b.
  -->  Det svarer til: a - (b * (a / b)), hvor divisionen er int-division (afrundet nedad).
   */

  /*Spm. 4: Man kan kombinere String og number ved hjælp af string concatention (sammensætning).
  Enkel concatention: brug "+" operator
  StringBuilder sb = new Stringbuilder();
  sb. append()
  String resultat = sb.toString(); --> print
  Bruges til store strings i loops.
   */

  /*Spm. 5: "5" er et string og 3 er e int. + operatoren bliver her til string concatention.
  Derfor sættes sammen til "53". Når mindst én operand er en string, bliver + concatention i
  stedet for addition.

  int plus int er ren addition. + operatoren udfører matematisk addition.
   */

  /*Spm. 6: Kortere kode: skriver mindre - sparer tid og reducerer fejl og bedre læsbarhed.
   */

  /*Spm. 7: For at tvinge decimal division skal man caste(konverter) mindst én af variablerne til
  double eller float. Det ændrer beregningen til at inkludere decimaler.
  int a = 5;
  int b = 3;
  double resultat = (double) a / b;
   */
}