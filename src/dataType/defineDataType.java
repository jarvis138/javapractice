package dataType;

public class defineDataType{
    public static void main(String[] args) {

        // -------- Primitive Data Types ----------
    	
    	//Person's age
        byte age = 45;              // 1 byte
        
        //Current year: 2023
        short year = 2025;           // 2 bytes
        
        //Number of employees in a company: 500
        short employeesNumber = 500;
        
        //11.Number of followers on a social media platform: 1,000,000
        int followers = 100000;            // 4 bytes
        
        //Person's phone number: "123-456-7890"
        long phNumber = 1234567890L;     // 8 bytes (if we are going with only numbers)
        
        //Temperature of a city in degrees Celsius: 25.5
        float temp = 25.5f;           // 4 bytes
        
        //Rating of a movie: 7.5
        float rating = 7.5f;
        
        //Distance between two cities: 200.5 
        float distance = 200.5f;
        
        //Amount of money in a customer's bank account: 1000.50
        float balance = -238.50f;
        
        //Coordinates of a location (latitude, longitude): 37.7749, -122.4194
        double lat = 37.7749;  // 8 bytes
        double lon = -122.4194;
        
        //13.Person's blood type: 'A'
        char bloodtype = 'A';              // 2 bytes 
        
       // Whether a customer has placed an order: true or false
        boolean orderPlaced = true;       // 1 bit
        
        //Person's marital status: true or false
         boolean status = false;
        
        
        // -------- Non-Primitive Data Types --------
        
        //Person's email address: "john.doe@example.com"
        String email = "john.doe@example.com"; // String 
        
       // Person's occupation: "Software Engineer"
         String occupation = "Software Engineer";
         
         //Person's favourite colour: "Blue"
         String favColor = "Blue";
         
         //Title of a book: "To Kill a Mockingbird"
         String bookTitle = "To Kill a Mockingbird";
         
         //Name of a country: "United States"
         String countryName = "United States";
         
         //Person's eye color: "Brown"
         String eyeColor = "Brown";
         
         //Person's birthplace: "New York City"
         String birthplace = "New York City";
         
         //Time of an event: 2:30 PM
         String eventTime = "2:30 PM";
         
         //Person's phone number: "123-456-7890"
         String phoneNumber = "123-456-7890";  //(if we want to print as it is)

        // --------------- Output --------------
        System.out.println("Person's age: " + age);
        System.out.println("Current year: " + year);
        System.out.println("Number of employees: " + employeesNumber);
        System.out.println("Number of followers: " + followers);
        System.out.println("Phone Number: " + phNumber);
        System.out.println("Temperature of a city: " + temp + "C");
        System.out.println("Rating of a movie: " + rating);
        System.out.println("Distance between two cities: " + distance);
        System.out.println("Bank Balance: " + balance);
        System.out.println("latitude: " +lat);
        System.out.println("longitude: " +lon);
        System.out.println("Person's blood type: " + bloodtype);
        System.out.println("Placed an order: " + orderPlaced);
        System.out.println("Marital status: " + status);
        System.out.println("Email address: " + email);
        System.out.println("Person's occupation: " + occupation);
        System.out.println("Person's occupation: " + favColor);
        System.out.println("Time of an event: " + eventTime);
        System.out.println("Person's phone number: " + phoneNumber);
       
    }
}