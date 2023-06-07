public class Main {
    public static void main(String[] args) {
//        Variables
//
//        int x = 123;
//        float y = 3.14f;
//        boolean z = true;
//        char symbol = '@';
//        String name = "Luis";
//        System.out.println(name);
//        --------------------------------------------------------------------------------------------------------------
//        Swap Two Variables
//
//        String x = "Water";
//        String y = "Kool-Aid";
//        String temporary;
//
//        temporary = x;
//        x = y;
//        y = temporary;
//
//        System.out.println("x: " + x);
//        System.out.println("x: " + y);
//        --------------------------------------------------------------------------------------------------------------
//        User Input
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("What is your name? ");
//        String name = scanner.nextLine();
//
//        System.out.println("How old are you? ");
//        int age = scanner.nextInt();
//        scanner.nextLine();
//
//        System.out.println("What is your favorite food?");
//        String food = scanner.nextLine();
//
//        System.out.println("Hello "+name);
//        System.out.println("You are "+age+" years old");
//        System.out.println("You like"+food);
//        --------------------------------------------------------------------------------------------------------------
//        Expression = Operands & Operators
//        Operands = values, variables, numbers, quantity
//        Operators = + - * / %
//
//        int friends = 10;
//        friends = friends + 1;
//        System.out.println(friends);
//        --------------------------------------------------------------------------------------------------------------
//        GUI Intro
//
//        String name = JOptionPane.showInputDialog("Enter your name");
//        JOptionPane.showMessageDialog(null, "Hello "+name);
//
//        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
//        JOptionPane.showMessageDialog(null, "You are "+age+" years old");
//
//        Double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
//        JOptionPane.showMessageDialog(null, "You are"+height+" cm tall");
//        --------------------------------------------------------------------------------------------------------------
//        Math Class
//
//        double x = 3.14;
//        double y = -10;
//
//        double z = Math.min(x, y);
//        System.out.println(z);
//
//        double x;
//        double y;
//        double z;
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter side x: ");
//        x = scanner.nextDouble();
//        System.out.println("Enter side y: ");
//        y = scanner.nextDouble();
//
//        z =Math.sqrt((x*x)+(y*y));
//
//        System.out.println("The Hypotenuse is "+z);
//
//        scanner.close();
//        --------------------------------------------------------------------------------------------------------------
//        Random Number
//
//        Random random = new Random();
//        int x = random.nextInt(6);
//        double y = random.nextDouble();
//        boolean z = random.nextBoolean();=
//        System.out.println(z);
//        --------------------------------------------------------------------------------------------------------------
//        If Statement
//
//        int age = 75;
//
//        if (age == 75) {
//            System.out.println("You are an adult!");
//        } else if (age >= 18) {
//            System.out.println("Ok Boomer!");
//        } else if (age >= 13) {
//            System.out.println("You are a teenager!");
//        } else {
//            System.out.println("YOu are not an adult!");
//        }
//    }
//        --------------------------------------------------------------------------------------------------------------
//        Switches
//
//        String day = "Friday";
//
//        switch (day) {
//            case "Sunday":
//                System.out.println("It is Sunday!");
//                break;
//            case "Monday":
//                System.out.println("It is Monday!");
//                break;
//            case "Tuesday":
//                System.out.println("It is Tuesday!");
//                break;
//            case "Wednesday":
//                System.out.println("It is Wednesday!");
//                break;
//            case "Thursday":
//                System.out.println("It is Thursday!");
//                break;
//            case "Friday":
//                System.out.println("It is Friday!");
//                break;
//            case "Saturday":
//                System.out.println("It is Saturday!");
//                break;
//            default:
//                System.out.println("That is not a day!");
//        }
//        --------------------------------------------------------------------------------------------------------------
//        Logical Operators
//
//        int temp = 15;
//
//        if (temp > 30) {
//            System.out.println("It is hot outside");
//        } else if (temp >= 20 && temp <= 30) {
//            System.out.println("It is warm outside");
//        } else {
//            System.out.println("It is cold outside");
//        }
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("You are playing a game! Press q or Q to quit");
//        String response = scanner.next();
//
//        if (!response.equals("q") || !response.equals("Q")) {
//            System.out.println("You are still playing the game *pew pew*");
//        } else {
//            System.out.println("You quit the game");
//        }
//        --------------------------------------------------------------------------------------------------------------
//        While Loop
//
//        Scanner scanner = new Scanner(System.in);
//        String name = "";
//
//        while (name.isBlank()) {
//            System.out.println("Enter your name: ");
//            name = scanner.nextLine();
//        }
//
//        System.out.println("Hello " + name);
//        --------------------------------------------------------------------------------------------------------------
//        For Loop
//
//        for (int i = 0; i <= 10; i++) {
//            System.out.println(i);
//        }
//
//        for (int i = 10; i >= 0; i -= 2) {
//            System.out.println(i);
//        }
//        --------------------------------------------------------------------------------------------------------------
//        Nested Loops
//
//        Scanner scanner = new Scanner(System.in);
//        int rows;
//        int columns;
//        String symbol = "";
//
//        System.out.println("Enter # of rows: ");
//        rows = scanner.nextInt();
//
//        System.out.println("Enter # of columns: ");
//        columns = scanner.nextInt();
//
//        System.out.println("Enter symbol to use: ");
//        symbol = scanner.next();
//
//        for (int i = 1; i <= rows; i++) {
//            System.out.println();
//
//            for (int j = 1; j <= columns; j++) {
//                System.out.print(symbol);
//            }
//        }
//        --------------------------------------------------------------------------------------------------------------
//        Array
//
//        String[] cars = {"Camaro", "Corvette", "Tesla"};
//        cars[0] = "Mustang";
//        System.out.println(cars);
//
//        String[] cars = new String[3];
//
//        cars[0] = "Camaro";
//        cars[1] = "Corvette";
//        cars[2] = "Tesla";
//
//        System.out.println(cars[0]);
//
//        for (int i = 0; i < cars.length; i++) {
//            System.out.println(cars[i]);
//        }
//        --------------------------------------------------------------------------------------------------------------
//        2D Array
//
//        String[][] cars = new String[3][3];
//
//        cars[0][0] = "Camaro";
//        cars[0][1] = "Covertte";
//        cars[0][2] = "Silverado";
//        cars[1][0] = "Mustang";
//        cars[1][1] = "Ranger";
//        cars[1][2] = "F-150";
//        cars[2][0] = "Ferrari";
//        cars[2][1] = "Lambo";
//        cars[2][2] = "Tesla";
//
//        for (int i = 0; i < cars.length; i++) {
//            System.out.println();
//            for (int j = 0; j < cars[i].length; j++) {
//                System.out.println(cars[i][j]+" ");
//            }
//        }
//
//        String[][] cars = {
//                {"Camaro", "Corvette", "Silverado"},
//                {"Mustang", "Ranger", "F-150"},
//                {"Ferrari", "Lambo", "Tesla"}
//        };
//
//        for (int i = 0; i < cars.length; i++) {
//            System.out.println();
//            for (int j = 0; j < cars[i].length; j++) {
//                System.out.println(cars[i][j] + " ");
//            }
//        }
//        --------------------------------------------------------------------------------------------------------------
//        String Methods
//
//        String name = "Luis";
//        boolean result = name.equalsIgnoreCase("Luis");
//        int result = name.length();
//        char result = name.charAt(0);
//        int result = name.indexOf("L");
//        boolean result = name.isEmpty();
//        String result = name.toUpperCase();
//        String result = name.toLowerCase();
//        String result = name.trim();
//        String result = name.replace('u', 'a');
//
//        System.out.println(result);
//        --------------------------------------------------------------------------------------------------------------
//        Wrapper
//
//        It provides a way to use primitive data types as reference data types reference data types contain useful
//        methods can be used with collections (Ex.ArrayList)
//
//        Autoboxing = the automatic conversion that the Java complier makes between the primitive types
//        and their corresponding object wrapper class
//
//        Unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to primitive
//
//        primitive | wrapper
//        -------------------
//        boolean   | Boolean
//        char      | Character
//        int       | Integer
//        double    | Double
//
//        Boolean a = true;
//        Character b = "@";
//        Integer c = 123;
//        Double d = 3.14;
//        String e = "Luis";
//        --------------------------------------------------------------------------------------------------------------
//        ArrayList
//
//        A resizable array. Elements can be added and removed after compilation phase store reference data types
//
//        ArrayList<String> food = new ArrayList<String>();
//
//        food.add("pizza");
//        food.add("hamburger");
//        food.add("hotdog");
//
//        food.set(0, "sushi");
//        food.remove(2);
//        food.clear();
//
//        for (int i = 0; i < food.size(); i++) {
//            System.out.println(food.get(i));
//        }
//        --------------------------------------------------------------------------------------------------------------
//        2D ArrayList
//
//        A dynamic list of lists. We can change the size of these lists during runtime
//
//        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();
//
//        ArrayList<String> bakeryList = new ArrayList<>();
//        bakeryList.add("pasta");
//        bakeryList.add("garlic bread");
//        bakeryList.add("donuts");
//
//        ArrayList<String> produceList = new ArrayList<>();
//        produceList.add("tomatoes");
//        produceList.add("zucchini");
//        produceList.add("peppers");
//
//        ArrayList<String> drinksList = new ArrayList<>();
//        drinksList.add("soda");
//        drinksList.add("coffee");
//
//        groceryList.add(bakeryList);
//        groceryList.add(produceList);
//        groceryList.add(drinksList);
//
//        System.out.println(groceryList.get(2).get(1));
//        --------------------------------------------------------------------------------------------------------------
//        For Each
//
//        Traversing technique to iterate through the elements in an array/collection. Less steps, more readable.
//        Less flexible
//
//        String[] animals = {"cat", "dog", "rat", "bird"};
//
//        ArrayList<String> animals = new ArrayList<String>();
//
//        animals.add("cat");
//        animals.add("dog");
//        animals.add("rat");
//        animals.add("bird");
//
//        for (String i : animals) {
//            System.out.println(i);
//        }
//        --------------------------------------------------------------------------------------------------------------
//        Methods
//
//        A block of code that is executed whenever it is called upon
//
//        String name = "Luis";
//        int age = 21;
//
//        hello(name, age);
//
//        int x = 3;
//        int y = 4;
//        int z = sum(x , y);
//
//        System.out.println(z);
//
//        static void hello(String name, int age) {
//            System.out.println("Hello" + " " + name);
//            System.out.println("You are" + " " + age);
//        }
//
//        static int sum(int x, int y) {
//            return x + y;
//        }
//        --------------------------------------------------------------------------------------------------------------
//        Overloaded Methods
//
//        Methods that share the same name but have different parameters
//        Method name + parameters = method signature
//
//        int x = sum(1, 2, 3);
//        System.out.println(x);
//
//        static int sum(int a, int b) {
//            System.out.println("This is overloaded method #1");
//            return a + b;
//        }
//
//        static int sum(int a, int b, int c) {
//            System.out.println("This is overloaded method #2");
//            return a + b + c;
//        }
//
//        static int sum(int a, int b, int c, int d) {
//            System.out.println("This is overloaded method #3");
//            return a + b + c + d;
//        }
//
//        static double sum(double a, double b) {
//            System.out.println("This is overloaded method #4");
//            return a + b;
//        }
//
//        static double sum(double a, double b, double c) {
//            System.out.println("This is overloaded method #5");
//            return a + b + c;
//        }
//
//        static double sum(double a, double b, double c, double d) {
//            System.out.println("This is overloaded method #6");
//            return a + b + c + d;
//        }
//        --------------------------------------------------------------------------------------------------------------
//        Printf()
//
//        An optional method to control, format, and display text to the console window
//        Two arguments = format string + (object/variable/value)
//        % [flags] [precision] [width] [conversion-character]
//
//        System.out.printf("%d This is a format string", 123);
//        boolean myBoolean = true;
//        char myChar = '@';
//        String myString = "Luis";
//        int myInt = 50;
//        double myDouble = 1000;
//        System.out.printf("%b", myBoolean);
//        System.out.printf("%c", myChar);
//        System.out.printf("%s", myString);
//        System.out.printf("%d", myInt);
//        System.out.printf("%f", myDouble);
//
//        [width]
//        minimum number of characters to be written as output
//        System.out.printf("Hello %10s", myString);
//
//        [precision]
//        sets number of digits of precision when outputting floating-point values
//        System.out.printf("You have this much money %.2f ", myDouble);
//
//        [flags]
//        adds an effect to output based on the flag added to format specifier
//        - : left-justify
//        + : output a plus ( + ) or minus ( - ) sign for a numeric value
//        0 : numeric values are zero-paced
//        , : comma grouping separator if numbers > 1000

//        System.out.printf("You have this much money %-20f", myDouble);
//        --------------------------------------------------------------------------------------------------------------
//        Final Keyword
//
//        final double PI = 3.14159;
//        System.out.println(PI);
//        --------------------------------------------------------------------------------------------------------------
//        Object Oriented Programming
//
//        Object = an instance of a class that may contain attributes and methods
//        Example: phone, desk, computer, coffee cup
//
//        Please check Car.java in src/
//        Car myCar1 = new Car();
//        Car myCar2 = new Car();
//
//        System.out.println(myCar1.color);
//        System.out.println(myCar1.make);
//        System.out.println(myCar1.model);
//        myCar1.drive();
//        --------------------------------------------------------------------------------------------------------------
//        Constructors
//
//        Special method that is called when an object is instantiated (created)
//
//        Please check Human.java in src/
//        Human human = new Human("Rick", 65, 70);
//        Human human2 = new Human("Morty", 16, 50);
//        System.out.println(human2.name);
//        --------------------------------------------------------------------------------------------------------------
    }
}

