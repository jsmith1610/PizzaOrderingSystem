/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza_Proj;
import java.util.*;

public class Pizza_Proj {
    
public static String ing1="",ing2="",ing3="",ing4="",ing5="",ing6="",crust="",sauce="";
public static String Amount1="",Amount2="",Amount3="",Amount4="",Amount5="",Amount6="",sauceAmount="";
 
public static String amountType1="",amountType2="",amountType3="";
    public static void main(String[] args) {
        Scanner reset = new Scanner(System.in);
        crust = getCrust();
        sauce = getSauce();
        ing1 = getIngredients();
     Amount1 = getAmount1();
      
      Continue();
      ing2 = getIngredients();
      while (ing2.equalsIgnoreCase(ing1)){
          System.out.println("Repeating choice!");
          System.out.println();
          ing2 = getIngredients();
      }
     Amount2 = getAmount2();
      Continue();
      ing3 = getIngredients();
      while (ing3.equalsIgnoreCase(ing2)||ing3.equalsIgnoreCase(ing1)){
        System.out.println("Repeating choice!");
        System.out.println();
          ing3 = getIngredients();  
      }
      Amount3 = getAmount3();
      
      Continue();
      ing4 = getIngredients();
      while (ing4.equalsIgnoreCase(ing3)|| ing4.equalsIgnoreCase(ing2)||
              ing4.equalsIgnoreCase(ing1)|| ing3.equalsIgnoreCase(ing2)||
              ing3.equalsIgnoreCase(ing1)){
        System.out.println("Repeating choice!");
        System.out.println();
          ing4 = getIngredients();  
      }
      Amount4 = getAmount4();
      
      Continue();
      ing5 = getIngredients();
      while (ing5.equalsIgnoreCase(ing4)||ing5.equalsIgnoreCase(ing3)||
              ing5.equalsIgnoreCase(ing2)||ing5.equalsIgnoreCase(ing1)||
              ing4.equalsIgnoreCase(ing3)|| ing4.equalsIgnoreCase(ing2)|| 
              ing4.equalsIgnoreCase(ing1)|| ing3.equalsIgnoreCase(ing2)||
              ing3.equalsIgnoreCase(ing1)){
        System.out.println("Repeating choice!");
        System.out.println();
          ing5 = getIngredients();  
      }
      Amount5 = getAmount5();
      Continue();
      ing6 = getIngredients();
      while (ing6.equalsIgnoreCase(ing5)||ing6.equalsIgnoreCase(ing4)||
              ing6.equalsIgnoreCase(ing3)||ing6.equalsIgnoreCase(ing2)||ing6.equalsIgnoreCase(ing1)||
              ing5.equalsIgnoreCase(ing4)||ing5.equalsIgnoreCase(ing3)||
              ing5.equalsIgnoreCase(ing2)||ing5.equalsIgnoreCase(ing1)||
              ing4.equalsIgnoreCase(ing3)||ing4.equalsIgnoreCase(ing2)|| 
              ing4.equalsIgnoreCase(ing1)||ing3.equalsIgnoreCase(ing2)||
              ing3.equalsIgnoreCase(ing1)){
        System.out.println("Repeating choice!");
        System.out.println();
          ing6 = getIngredients();  
      }
      Amount6 = getAmount6();
     System.out.print("You have reached maximum items " + "Thank You!\n"+
     "Your Order is: \n");
     System.out.println();
     System.out.println(crust);
     System.out.println(sauce + " " + sauceAmount);
     orderFinish();
     System.out.println(ing1 + " " + Amount1);
     System.out.println(ing2 + " " + Amount2);
     System.out.println(ing3 + " " + Amount3);
     System.out.println(ing4 + " " + Amount4);
     System.out.println(ing5 + " " + Amount5);
     System.out.println(ing6 + " " + Amount6);
     System.out.print("Pizza is to be appropriately cooked until crust is "
             + " cooked and toppings are warmed");
     
    }
    public static String getCrust(){
       Scanner input = new Scanner(System.in);
        char crustType;
        
        System.out.println("a. Regular Crust\t b. Gluten-free Crust");
        System.out.println("Please Choose one Crust Option: ");
        crustType = input.nextLine().charAt(0);
        if (crustType == 'a'||crustType=='A'){
            crust = "Regular Crust";
        }
        else if (crustType == 'b'||crustType=='B'){
            crust = "Gluten-Free Crust";
        }
        else{
            System.out.println("Incorrect Choice. Use only the Letter.");
            getCrust();
        }
        System.out. println("You choose:\t"+ crust);
   return crust;} 
    public static String getSauce(){
       Scanner input = new Scanner(System.in);
        char sauceType;
        
        System.out.println("a. Red Sauce\t b. No sauce");
        System.out.println("Please Choose one Sauce Option: ");
        sauceType = input.nextLine().charAt(0);
        if (sauceType == 'a'||sauceType=='A'){
            sauce = "Red Sauce";
            System.out.print("a. 1/4 cup or b. 1/2 cup ");
            sauceAmount = input.nextLine();
            if (sauceAmount.equalsIgnoreCase("a")){
                sauceAmount = "1/4 cup";
            }
            else if (sauceAmount.equalsIgnoreCase("b")){
                sauceAmount = "1/2 cup";
            }
            else{
            System.out.println("Incorrect Choice. Use only the Letter.");
            getSauce();
        }
        }
        else if (sauceType == 'b'||sauceType=='B'){
            sauce = "No Sauce";
        }
        else{
            System.out.println("Incorrect Choice. Use only the Letter.");
            getSauce();
        }
        System.out. println("You choose:\t"+ sauce + " " + sauceAmount );
   return sauce;}
    public static String getIngredients(){ 
       Scanner input = new Scanner(System.in);
       System.out.println();
       System.out.println("a. Pizza cheese \t b. diced onions \t c. diced green peppers");
       System.out.println("d. pepperoni \t\t e. sliced mushrooms \t f. diced jalapenos");
       System.out.println("g. sardines \t\t h. pineapple chunks \t i. tofu");
       System.out.println("j. ham chunks \t\t k. dry red pepper \t l. dry basil\n");
       System.out.print("");
       String ing=getChoice("Please choose one ingredient option: ",
               "[aAbBcCdDeEfFgGhHiIjJkKlL]",input);
       System.out.println("You chose: " +ing);    
       System.out.println("*****************************************************");
       
    return ing;}
    public static String getAmount1(){
     Scanner input = new Scanner(System.in);
        
        if (ing1.equalsIgnoreCase("k")||ing1.equalsIgnoreCase("l")){
        System.out.print("Would you like:\n"+"a. Generous Sprinkle "+
            "or b. 2 Generous Sprinkles: " );
           amountType1=input.nextLine();
            if(amountType1.equalsIgnoreCase("a")){
                Amount1 = "Genrous Sprinkle";
            }
            else if(amountType1.equalsIgnoreCase("b")){
                Amount1 = "Genrous Sprinkle";
            }
            else{
                System.out.println("Invalid Choice");
                getAmount1();
            }
        }    
        else if (ing1.equalsIgnoreCase("d")|| ing2.equalsIgnoreCase("j")){
         System.out.print("Would you like:\n"+"a. 2 Pieces "+
            "or b. 4 Pieces: " );
           amountType1=input.nextLine();
            if (amountType1.equalsIgnoreCase("a")){
                Amount1 = "2 Pieces";
            }
            else if (amountType1.equalsIgnoreCase("b")){
                Amount1 = "4 Pieces";
            }
            else{
                System.out.println("Invalid Choice");
                getAmount1();
        }
        }
        else{
         System.out.print("Would you like:\n"+"a. 1/8 cup "+
            "or b. 1/4 cup or c. 1/2 cup: " );
          amountType1=input.nextLine();
            if (amountType1.equalsIgnoreCase("a")){
                Amount1 = "1/8 Cup";
            }
            else if(amountType1.equalsIgnoreCase("b")){
                Amount1 = "1/4 Cup";
            }
            else if(amountType1.equalsIgnoreCase("c")){
                Amount1 = "1/2 Cup";
            }
            else{
                System.out.println("Invalid Choice");
                getAmount1();
        }
        } 
 
    return Amount1;}
    public static String getAmount2(){
     Scanner input = new Scanner(System.in);
        if (ing2.equalsIgnoreCase("k")||ing2.equalsIgnoreCase("l")){
            System.out.print("Would you like:\n"+"a. Generous Sprinkle "+
            "or b. 2 Generous Sprinkles: " );
           amountType1=input.nextLine();
            if(amountType1.equalsIgnoreCase("a")){
                Amount2 = "Genrous Sprinkle";
            }
            else if(amountType1.equalsIgnoreCase("b")){
                Amount2 = "Genrous Sprinkle";
            }
            else{
                System.out.println("Invalid Choice");
                getAmount2();
        }
        }
        else if (ing2.equalsIgnoreCase("d")|| ing2.equalsIgnoreCase("j")){
         System.out.print("Would you like:\n"+"a. 2 Pieces "+
            "or b. 4 Pieces: " );
           amountType2=input.nextLine();
            if (amountType2.equalsIgnoreCase("a")){
                Amount2 = "2 Pieces";
            }
            else if (amountType2.equalsIgnoreCase("b")){
                Amount2 = "4 Pieces";
            }
            else{
                System.out.println("Invalid Choice");
                getAmount2();
        }
        }
        else{
         System.out.print("Would you like:\n"+"a. 1/8 cup "+
            "or b. 1/4 cup or c. 1/2 cup: " );
          amountType3=input.nextLine();
            if (amountType3.equalsIgnoreCase("a")){
                Amount2 = "1/8 Cup";
            }
            else if(amountType3.equalsIgnoreCase("b")){
                Amount2 = "1/4 Cup";
            }
            else if(amountType3.equalsIgnoreCase("c")){
                Amount2 = "1/2 Cup";
            }
            else{
                System.out.println("Invalid Choice");
                getAmount2();
        }
        } 
        return Amount2;}
    
        public static String getAmount3(){
     Scanner input = new Scanner(System.in);
        if (ing3.equalsIgnoreCase("k")||ing3.equalsIgnoreCase("l")){
            System.out.print("Would you like:\n"+"a. Generous Sprinkle "+
            "or b. 2 Generous Sprinkles: " );
           amountType1=input.nextLine();
            if(amountType1.equalsIgnoreCase("a")){
                Amount3 = "Genrous Sprinkle";
            }
            else if(amountType1.equalsIgnoreCase("b")){
                Amount3 = "Genrous Sprinkle";
            }
            else{
                System.out.println("Invalid Choice");
                getAmount3();
        }
        }
        else if (ing3.equalsIgnoreCase("d")|| ing3.equalsIgnoreCase("j")){
         System.out.print("Would you like:\n"+"a. 2 Pieces "+
            "or b. 4 Pieces: " );
           amountType2=input.nextLine();
            if (amountType2.equalsIgnoreCase("a")){
                Amount3 = "2 Pieces";
            }
            else if (amountType2.equalsIgnoreCase("b")){
                Amount3 = "4 Pieces";
            }
            else{
                System.out.println("Invalid Choice");
                getAmount3();
        }
        }
        else{
         System.out.print("Would you like:\n"+"a. 1/8 cup "+
            "or b. 1/4 cup or c. 1/2 cup: " );
          amountType3=input.nextLine();
            if (amountType3.equalsIgnoreCase("a")){
                Amount3 = "1/8 Cup";
            }
            else if(amountType3.equalsIgnoreCase("b")){
                Amount3 = "1/4 Cup";
            }
            else if(amountType3.equalsIgnoreCase("c")){
                Amount3 = "1/2 Cup";
            }
            else{
                System.out.println("Invalid Choice");
                getAmount3();
        }
        } 
    return Amount3;}
        
    public static String getAmount4(){
     Scanner input = new Scanner(System.in);
        if (ing4.equalsIgnoreCase("k")||ing4.equalsIgnoreCase("l")){
            System.out.print("Would you like:\n"+"a. Generous Sprinkle "+
            "or b. 2 Generous Sprinkles: " );
           amountType1=input.nextLine();
            if(amountType1.equalsIgnoreCase("a")){
                Amount4 = "Genrous Sprinkle";
            }
            else if(amountType1.equalsIgnoreCase("b")){
                Amount4 = "Genrous Sprinkle";
            }
            else{
                System.out.println("Invalid Choice");
                getAmount4();
        }
        }
        else if (ing4.equalsIgnoreCase("d")|| ing4.equalsIgnoreCase("j")){
         System.out.print("Would you like:\n"+"a. 2 Pieces "+
            "or b. 4 Pieces: " );
           amountType2=input.nextLine();
            if (amountType2.equalsIgnoreCase("a")){
                Amount4 = "2 Pieces";
            }
            else if (amountType2.equalsIgnoreCase("b")){
                Amount4 = "4 Pieces";
            }
            else{
                System.out.println("Invalid Choice");
                getAmount4();
        }
        }
        else{
         System.out.print("Would you like:\n"+"a. 1/8 cup "+
            "or b. 1/4 cup or c. 1/2 cup: " );
          amountType3=input.nextLine();
            if (amountType3.equalsIgnoreCase("a")){
                Amount4 = "1/8 Cup";
            }
            else if(amountType3.equalsIgnoreCase("b")){
                Amount4 = "1/4 Cup";
            }
            else if(amountType3.equalsIgnoreCase("c")){
                Amount4 = "1/2 Cup";
            }
            else{
                System.out.println("Invalid Choice");
                getAmount4();
        }
        } 
    return Amount4;}
    
   public static String getAmount5(){
     Scanner input = new Scanner(System.in);
        if (ing5.equalsIgnoreCase("k")||ing5.equalsIgnoreCase("l")){
            System.out.print("Would you like:\n"+"a. Generous Sprinkle "+
            "or b. 2 Generous Sprinkles: " );
           amountType1=input.nextLine();
            if(amountType1.equalsIgnoreCase("a")){
                Amount5 = "Genrous Sprinkle";
            }
            else if(amountType1.equalsIgnoreCase("b")){
                Amount5 = "Genrous Sprinkle";
            }
            else{
                System.out.println("Invalid Choice");
                getAmount5();
        }
        }
        else if (ing5.equalsIgnoreCase("d")|| ing5.equalsIgnoreCase("j")){
         System.out.print("Would you like:\n"+"a. 2 Pieces "+
            "or b. 4 Pieces: " );
           amountType2=input.nextLine();
            if (amountType2.equalsIgnoreCase("a")){
                Amount5 = "2 Pieces";
            }
            else if (amountType2.equalsIgnoreCase("b")){
                Amount5 = "4 Pieces";
            }
            else{
                System.out.println("Invalid Choice");
                getAmount5();
        }
        }
        else{
         System.out.print("Would you like:\n"+"a. 1/8 cup "+
            "or b. 1/4 cup or c. 1/2 cup: " );
          amountType3=input.nextLine();
            if (amountType3.equalsIgnoreCase("a")){
                Amount5 = "1/8 Cup";
            }
            else if(amountType3.equalsIgnoreCase("b")){
                Amount5 = "1/4 Cup";
            }
            else if(amountType3.equalsIgnoreCase("c")){
                Amount5 = "1/2 Cup";
            } 
            else{
                System.out.println("Invalid Choice");
                getAmount5();
        }
        } 
    return Amount5;}
   
   public static String getAmount6(){
     Scanner input = new Scanner(System.in);
        if (ing6.equalsIgnoreCase("k")||ing6.equalsIgnoreCase("l")){
            System.out.print("Would you like:\n"+"a. Generous Sprinkle "+
            "or b. 2 Generous Sprinkles: " );
           amountType1=input.nextLine();
            if(amountType1.equalsIgnoreCase("a")){
                Amount6 = "Genrous Sprinkle";
            }
            else if(amountType1.equalsIgnoreCase("b")){
                Amount6 = "Genrous Sprinkle";
            }
            else{
                System.out.println("Invalid Choice");
                getAmount6();
        }
        }
        else if (ing6.equalsIgnoreCase("d")|| ing6.equalsIgnoreCase("j")){
         System.out.print("Would you like:\n"+"a. 2 Pieces "+
            "or b. 4 Pieces: " );
           amountType2=input.nextLine();
            if (amountType2.equalsIgnoreCase("a")){
                Amount6 = "2 Pieces";
            }
            else if (amountType2.equalsIgnoreCase("b")){
                Amount6 = "4 Pieces";
            }
            else{
                System.out.println("Invalid Choice");
                getAmount6();
        }
        }
        else{
         System.out.print("Would you like:\n"+"a. 1/8 cup "+
            "or b. 1/4 cup or c. 1/2 cup: " );
          amountType3=input.nextLine();
            if (amountType3.equalsIgnoreCase("a")){
                Amount6 = "1/8 Cup";
            }
            else if(amountType3.equalsIgnoreCase("b")){
                Amount6 = "1/4 Cup";
            }
            else if(amountType3.equalsIgnoreCase("c")){
                Amount6 = "1/2 Cup";
            }  
            else{
                System.out.println("Invalid Choice");
                getAmount6();
        }
        } 
    return Amount6;}
   
    public static String getChoice(String msg,String pattern,Scanner sc){
        String choice="";
        while (choice.equals("")){
            System.out.print(msg);
            if(sc.hasNext(pattern))
                choice=sc.next();
            else{
                System.out.println("Not a valid choice. Try again.\t");
                System.out.println("Enter only the Letter.");
                
                sc.next();
            }
            sc.nextLine();
        }
        return choice;
    }
    public static void Continue(){
     Scanner input = new Scanner(System.in);
     System.out.print("Would you like to continue? Y|N ");
     String choice = input.nextLine();
     if (choice.equalsIgnoreCase("y")){
         
     }
     else if (choice.equalsIgnoreCase("n")){
         System.out.println();
         System.out.println("Your Final Order is: ");
         System.out.println(crust);
         System.out.println(sauce + " " + sauceAmount);
         orderFinish();
        System.out.println(ing1 + " " + Amount1);
        System.out.println(ing2 + " " + Amount2);
        System.out.println(ing3 + " " + Amount3);
        System.out.println(ing4 + " " + Amount4);
        System.out.println(ing5 + " " + Amount5);
        System.out.println(ing6 + " " + Amount6);
        System.out.println("Pizza is to be appropriately cooked until crust is "
             + " cooked and toppings are warmed");
         System.exit(0);
     }
     else{
         System.out.println("Incorrect input. Try Again. ");
         Continue();
     }
    }
    public static void orderFinish(){  
        switch(ing1){
            case "a":
            case "A":
                ing1 = "Pizza Cheese";
                break;
            case "b":
            case "B":
                ing1 = "Diced Onions";
                break;     
            case "c":
            case "C":
                ing1 = "Diced green peppers";
                break;
            case "d":
            case "D":
                ing1 = "Pepperoni";
                break;
            case "e":
            case "E":
                ing1 = "Sliced mushroom";
                break;
            case "f":
            case "F":
                ing1 = "Diced jalapenos";
                break;
            case "g":
            case "G":
                ing1 = "Sardines";
                break;
            case "h":
            case "H":    
                ing1 = "pineapple chunks";
                break;
            case "i":
            case "I":
                ing1 = "Tofu";
                break;
            case "j":
            case "J":
               ing1 = "Ham chunks";
                break;
            case "k":
            case "K":
                ing1 = "Dry Red Pepper";
                break;
            case "l":
            case "L":
                ing1 = "Dry basil";
                break;
        }
       switch(ing2){
            case "a":
            case "A":
                ing2 = "Pizza Cheese";
                break;
            case "b":
            case "B":
                ing2 = "Diced Onions";
                break;     
            case "c":
            case "C":
                ing2 = "Diced green peppers";
                break;
            case "d":
            case "D":
                ing2 = "Pepperoni";
                break;
            case "e":
            case "E":
                ing2 = "Sliced mushroom";
                break;
            case "f":
            case "F":
                ing2 = "Diced jalapenos";
                break;
            case "g":
            case "G":
                ing2 = "Sardines";
                break;
            case "h":
            case "H":
                ing2 = "pineapple chunks";
                break;
            case "i":
            case "I":
                ing2 = "Tofu";
                break;
            case "j":
            case "J":
               ing2 = "Ham chunks";
                break;
            case "k":
            case "K":    
                ing2= "Dry Red Pepper";
                break;
            case "l":
            case "L":
                ing2 = "Dry basil";
                break;
        } 
       switch(ing3){
            case "a":
            case "A":
                ing3 = "Pizza Cheese";
                break;
            case "b":
            case "B":
                ing3 = "Diced Onions";
                break;     
            case "c":
            case "C":
                ing3 = "Diced green peppers";
                break;
            case "d":
            case "D":    
                ing3 = "Pepperoni";
                break;
            case "e":
            case "E":
                ing3 = "Sliced mushroom";
                break;
            case "f":
            case "F":
                ing3 = "Diced jalapenos";
                break;
            case "g":
            case "G":
                ing3 = "Sardines";
                break;
            case "h":
            case "H":
                ing3 = "pineapple chunks";
                break;
            case "i":
            case "I":
                ing3 = "Tofu";
                break;
            case "j":
            case "J":
                ing3 = "Ham chunks";
                break;
            case "k":
            case "K":    
                ing3 = "Dry Red Pepper";
                break;
            case "l":
            case "L":    
                ing3 = "Dry basil";
                break;
        }
       switch(ing4){
            case "a":
            case "A":    
                ing4 = "Pizza Cheese";
                break;
            case "b":
            case "B":    
                ing4 = "Diced Onions";
                break;     
            case "c":
            case "C":    
                ing4 = "Diced green peppers";
                break;
            case "d":
            case "D":    
                ing4 = "Pepperoni";
                break;
            case "e":
            case "E":    
                ing4 = "Sliced mushroom";
                break;
            case "f":
            case "F":    
                ing4 = "Diced jalapenos";
                break;
            case "g":
            case "G":    
                ing4 = "Sardines";
                break;
            case "h":
            case "H":    
                ing4 = "pineapple chunks";
                break;
            case "i":
            case "I":    
                ing4 = "Tofu";
                break;
            case "j":
            case "J":    
               ing4 = "Ham chunks";
                break;
            case "k":
            case "K":    
                ing4 = "Dry Red Pepper";
                break;
            case "l":
            case "L":    
                ing4 = "Dry basil";
                break;
        }
       switch(ing5){
            case "a":
            case "A":    
                ing5 = "Pizza Cheese";
                break;
            case "b":
            case "B":    
                ing5 = "Diced Onions";
                break;     
            case "c":
            case "C":    
                ing5 = "Diced green peppers";
                break;
            case "d":
            case "D":    
                ing5 = "Pepperoni";
                break;
            case "e":
            case "E":    
                ing5 = "Sliced mushroom";
                break;
            case "f":
            case "F":    
                ing5 = "Diced jalapenos";
                break;
            case "g":
            case "G":    
                ing5 = "Sardines";
                break;
            case "h":
            case "H":    
                ing5 = "pineapple chunks";
                break;
            case "i":
            case "I":    
                ing5 = "Tofu";
                break;
            case "j":
            case "J":    
               ing5 = "Ham chunks";
                break;
            case "k":
            case "K":    
                ing5 = "Dry Red Pepper";
                break;
            case "l":
            case "L":    
                ing5 = "Dry basil";
                break;
       }
     switch(ing6){
            case "a":
            case "A":    
                ing6 = "Pizza Cheese";
                break;
            case "b":
            case "B":    
                ing6 = "Diced Onions";
                break;     
            case "c":
            case "C":    
                ing6 = "Diced green peppers";
                break;
            case "d":
            case "D":    
                ing6 = "Pepperoni";
                break;
            case "e":
            case "E":    
                ing6 = "Sliced mushroom";
                break;
            case "f":
            case "F":    
                ing6 = "Diced jalapenos";
                break;
            case "g":
            case "G":    
                ing6 = "Sardines";
                break;
            case "h":
            case "H":    
                ing6 = "pineapple chunks";
                break;
            case "i":
            case "I":    
                ing6 = "Tofu";
                break;
            case "j":
            case "J":    
               ing6 = "Ham chunks";
                break;
            case "k":
            case "K":    
                ing6 = "Dry Red Pepper";
                break;
            case "l":
            case "L":    
                ing6 = "Dry basil";
                break;
        
       }  
    }
}