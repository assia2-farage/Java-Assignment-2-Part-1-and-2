import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        
        // Part 1
        Scanner input = new Scanner(System.in);

        // Prompting user input
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your address: ");
        String address = input.nextLine();

        System.out.print("Enter your daily transport cost (GMD): ");
        double transportCost = input.nextDouble();

        System.out.print("Enter your daily food cost (GMD): ");
        double foodCost = input.nextDouble();

        System.out.print("Enter the number of semesters: ");
        int numberOfSemesters = input.nextInt();

        // Calculations
        double dailyTotal = transportCost + foodCost;
        double weeklyTotal = dailyTotal * 4;
        double monthlyTotal = weeklyTotal * 4;
        double semesterTotal = monthlyTotal * 4;
        double totalExpenses = semesterTotal * numberOfSemesters;

        // Output results
        System.out.println("\nStudent Information:");
        System.out.println("My name is "+ name +". I am an MDI student studying Computer Science.I am in my third semester.I go to school 4 times in a week.I travel from " + address + " to Kanifing which costs me GMD" + transportCost + " daily on transport.The amount of money I spend on food daily is GMD" +foodCost+ ".The accumulated figure for both transport and food is GMD" + dailyTotal +".In one week I spent GMD"+ weeklyTotal +" and GMD"+ monthlyTotal +" in a month.Therefore, in a semester I spent GMD"+ semesterTotal +" on transport and food.For the past 3 semesters up to now, I have spent roughly GMD"+ totalExpenses +" on transportation and food.");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Daily Expenses: GMD" + dailyTotal);
        System.out.println("Weekly Expenses: GMD" + weeklyTotal);
        System.out.println("Monthly Expenses: GMD" + monthlyTotal);
        System.out.println("Semester Expenses: GMD" + semesterTotal);
        System.out.println("Total Expenses for " + numberOfSemesters + " semesters: GMD" + totalExpenses);

        input.close();
    }
    
    
    
    
    
}