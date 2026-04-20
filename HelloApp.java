public class HelloApp {
    public static void main(String[] args) {
        // Check if no arguments are provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            StringBuilder nameBuilder = new StringBuilder();
            
            // Iterate through arguments using an enhanced for loop
            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }
            
            // Remove the trailing comma and space using substring()
            String formattedNames = nameBuilder.substring(0, nameBuilder.length() - 2);
            
            // Print the final greeting
            System.out.println("Hello, " + formattedNames + "!");
        }
    }
}
