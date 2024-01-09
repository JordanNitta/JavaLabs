package Labs.ObjectsAndClassesLab.Labs.RandomValues;

import java.util.Random;

/*
In the file RandomNumbers.java, write a class called RandomNumbers that has three integer
instance variables: var1, var2, and var3. Write getter method for each variable: getVar1(), getVar2() and getVar3().
Then write the following 2 instance methods:

setRandomValues( ) -
accepts a low and high integer values as parameters, and sets var1, var2, and var3 to random numbers (generated using the Random class)
within the range of the low and high input values (inclusive).
getRandomValues( ) - prints out the 3 random numbers in the format: "Random values: var1 var2 var3"
Ex: If the input is:

15 20
the output may be:

Random values: 17 15 19
where 17, 15, 19 can be any random numbers within 15 and 20 (inclusive).

Note: When submitted, your program will be tested against different input range to verify if
the three randomly generated values are within range.
 */
public class RandomNumbers {
    private int var1;
    private int var2;
    private int var3;

    public void setRandomValues(int low, int high){
        Random rand = new Random();
        var1 = rand.nextInt(high - low + 1) + low;
        var2 = rand.nextInt(high - low + 1) + low;
        var3 = rand.nextInt(high - low + 1) + low;
    }

    public void getRandomValues() {
        System.out.println("Random values: " + var1 + " " + var2 + " " + var3);
    }

    public int getVar1(){ return var1;}
    public int getVar2(){ return var2;}
    public int getVar3(){return var3;}

}
