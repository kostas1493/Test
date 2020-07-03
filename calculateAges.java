import java.util.Scanner;
public class calculateAges{

public static void main(String[] args){
Scanner sc = new Scanner(System.in);
//TO FIND CURRENT YEAR
System.out.println("What is the current year?");
int curYear = sc.nextInt();

//TO FIND HOW OLD THE PERSON IS
System.out.println("How old are you?");
int myAge = sc.nextInt();

//TO FIND HOW OLD MOM IS  
System.out.println("How old is your Mother?");
int motherAge = sc.nextInt();

//TO FIND HOW OLD DAD IS  
System.out.println("How old is your Father?");
int fatherAge = sc.nextInt();

//TO FIND HOW OLD GRANDPA IS  
System.out.println("How old is your Grandpa?");
int grandpaAge = sc.nextInt();

// YEAR BORN VARIABLES
int myYearBorn = curYear - myAge;
int momYearBorn = curYear - motherAge;
int dadYearBorn = curYear - fatherAge;
int grandpaYearBorn = curYear - grandpaAge;

// 2040 AGE VARIABLES
int futureAge = 2040 - myYearBorn;
int futureMomAge = 2040 - momYearBorn;
int futureDadAge = 2040 - dadYearBorn;
int futureGrandpaAge = 2040 - grandpaYearBorn;

System.out.println("");  
  
//TO FIND HOW OLD I WAS IN 1960
if (myYearBorn > 1960){
System.out.println("You were born after 1960, so in 1960 you were 0 years old.");

}else if (myYearBorn < 1960){
int sixtiesAge = 1960 - myYearBorn;
System.out.println("In 1960 you were: " + sixtiesAge + "!!!");
}
//TO FIND OUT HOW OLD I WAS IN 2040
System.out.println("In 2040 you will be: " + futureAge + "!!!");

System.out.println("");

//TO FIND HOW OLD MOM WAS IN 1960
if (momYearBorn > 1960){
System.out.println("Your mom was born after 1960, so in 1960 she was 0 years old.");

}else if (momYearBorn < 1960){
int momSixtiesAge = 1960 - momYearBorn;
System.out.println("In 1960 your mom was: " + momSixtiesAge + "!!!");
}
//TO FIND OUT HOW OLD MOM WILL BE IN 2040
System.out.println("In 2040 your mom will be: " + futureMomAge + "!!!");

System.out.println("");

//TO FIND HOW OLD DAD WAS IN 1960
if (dadYearBorn > 1960){
System.out.println("Your dad was born after 1960, so in 1960 he was 0 years old.");

}else if (dadYearBorn < 1960){
int dadSixtiesAge = 1960 - dadYearBorn;
System.out.println("In 1960 your dad was: " + dadSixtiesAge + "!!!");
}
//TO FIND OUT HOW OLD DAD WILL BE IN 2040
System.out.println("In 2040 your dad will be: " + futureDadAge + "!!!");

System.out.println("");

//TO FIND OUT HOW OLD GRANDPA WAS IN 1960
if (grandpaYearBorn > 1960){
System.out.println("Your grandpas was born after 1960, so in 1960 he was 0 years old.");

}else if (grandpaYearBorn < 1960){
int grandpaSixtiesAge = 1960 - grandpaYearBorn;
System.out.println("In 1960 your grandpa was: " + grandpaSixtiesAge + "!!!");
}
//TO FIND OUT HOW OLD GRANDPA WILL BE IN 2040
System.out.println("In 2040 your grandpa will be: " + futureGrandpaAge + "!!!");


}
}
