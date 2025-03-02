public class UniversityTester {
    public static void main(String[] args) {
        // Create two University objects
        University uni1 = new University();
        University uni2 = new University();
        
        // Change instance variables of the first object
        uni1.name = "Imperial College London";
        uni1.country = "England";
        
        // Change instance variables of the second object
        uni2.name = "Brac University";
        uni2.country = "Bangladesh";
        
        // Check if the instance variables have changed
        System.out.println("First object: Name = " + uni1.name + ", Country = " + uni1.country);
        System.out.println("Second object: Name = " + uni2.name + ", Country = " + uni2.country);
        
        // Check if the instance variables of both objects are of the same value or not
        boolean sameValues = uni1.name.equals(uni2.name) && uni1.country.equals(uni2.country);
        if (sameValues) {
            System.out.println("The instance variables of both objects are of the same value.");
        } else {
            System.out.println("The instance variables of both objects are not of the same value.");
        }
    }
}
