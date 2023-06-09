import javax.sound.sampled.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.Flow;

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
//        Variable Scope
//
//        Please check DiceRoller.java in src/
//        DiceRoller diceRoller = new DiceRoller();
//        --------------------------------------------------------------------------------------------------------------
//        Overloaded Constructors
//
//        Multiple constructors within a class with the same name, but have different parameters
//        name + parameters = signature
//
//        Please check Pizza.java in src/
//        Pizza pizza = new Pizza();
//        System.out.println("There are the ingredients of your pizza: ");
//        System.out.println(pizza.bread);
//        System.out.println(pizza.sauce);
//        System.out.println(pizza.cheese);
//        System.out.println(pizza.topping);
//        --------------------------------------------------------------------------------------------------------------
//        toString Method
//
//        Special method that all objects inherit that returns a string that "textually represents" an object.
//        Can be used both implicitly and explicitly
//
//        Car car = new Car();
//
//        System.out.println(car.toString()); # Explicitly
//        System.out.println(car); # Implicitly
//        --------------------------------------------------------------------------------------------------------------
//        Array of Objects
//
//        Food[] refrigerator = new Food[3];
//
//        Food food1 = new Food("pizza");
//        Food food2 = new Food("hamburger");
//        Food food3 = new Food("hot-dog");
//
//        Food[] refrigerator = {food1, food2, food3};
//
//        refrigerator[0] = food1;
//        refrigerator[1] = food2;
//        refrigerator[2] = food3;
//
//        System.out.println(refrigerator[0].name);
//        --------------------------------------------------------------------------------------------------------------
//        Object Passing
//
//        Garage garage = new Garage();
//        Car car1 = new Car("BMW");
//        Car car2 = new Car("Tesla");
//
//        garage.park(car1);
//        garage.park(car2);
//        --------------------------------------------------------------------------------------------------------------
//        Static Keyword
//
//        A single copy of a variable/method is created and shared.
//        The class "owns" the static member
//
//        Friend friend1 = new Friend("Spongebob");
//        Friend friend2 = new Friend("Patrick");
//        Friend friend3 = new Friend("Squidward");
//
//        System.out.println(Friend.numberOfFriends);
//        Friend.displayFriends();
//        --------------------------------------------------------------------------------------------------------------
//        Inheritance
//
//        The process where one class acquires, the attributes and methods of another.
//
//        Car car = new Car("BMW");
//        car.go();
//        Bicycle bike = new Bicycle();
//        bike.stop();
//        --------------------------------------------------------------------------------------------------------------
//        Method Overriding
//
//        Declaring a method in sub class, which is already present in parent class.
//        Done so that a child class can give its own implementation
//
//        Dog dog = new Dog();
//        dog.speak();
//        --------------------------------------------------------------------------------------------------------------
//        Super Keyword
//
//        Super Keyword refers to the superclass (parent) of an object
//        Very similar to the "this" keyword
//
//        Hero hero1 = new Hero("Superman", 43, "everything");
//        Hero hero2 = new Hero("Batman", 42, "$$$");
//
//        System.out.println(hero1.name);
//        System.out.println(hero1.age);
//        System.out.println(hero1.power);
//
//        System.out.println(hero2.toString());
//        --------------------------------------------------------------------------------------------------------------
//        Abstract
//
//        Abstract classes cannot be instantiated, but they can have a subclass
//        Abstract methods are declared without an implementation
//
//        Vehicle1 vehicle = new Vehicle1();
//        Car car = new Car("BMW");
//        car.go();
//        --------------------------------------------------------------------------------------------------------------
//        Access Modifiers
//
//        Modifiers | Class | Package | Subclass | World
//        Public      Y     | Y       | Y        | Y
//        Protected   Y     | Y       | Y        | N
//        No modifier Y     | Y       | N        | N
//        Private     Y     | N       | N        | N
//
//        Please check package1 and package2
//        --------------------------------------------------------------------------------------------------------------
//        Encapsulation
//
//        Attributes of a class will be hidden or private, can be accessed only through methods (Getters & Setters)
//        We should make attributes private if we don't have a reason to make them public/protected
//
//        Car car = new Car("Chevrolet", "Camaro", 2021);
//        car.setYear(2022);
//
//        System.out.println(car.getMake());
//        --------------------------------------------------------------------------------------------------------------
//        Copy Objects
//
//        Car car1 = new Car("Chevrolet", "Camaro", 2021);
//        Car car2 = new Car("Ford", "Mustang", 2022);
//        car2.copy(car1);
//        Car car2 = new Car(car1);
//
//        System.out.println(car1);
//        System.out.println(car2);
//        System.out.println();
//        System.out.println(car1.getMake());
//        System.out.println(car1.getModel());
//        System.out.println(car1.getYear());
//        System.out.println();
//        System.out.println(car2.getMake());
//        System.out.println(car2.getModel());
//        System.out.println(car2.getYear());
//        --------------------------------------------------------------------------------------------------------------
//        Interface
//
//        A template that can be applied to a class. Similar to inheritance, but specifics what a class has/must do.
//        classes can apply more than one interface, inheritance is limited to 1 super
//
//        Rabbit rabbit = new Rabbit();
//        Hawk hawk = new Hawk();
//        Fish fish = new Fish();
//
//        rabbit.flee();
//        hawk.hunt();
//        fish.flee();
//        fish.hunt();
//        --------------------------------------------------------------------------------------------------------------
//        Polymorphism
//
//        Greek word for poly-"many", morph-"form"
//        The ability of an object to identify as more than one type
//
//        Car car = new Car("Rogue", "Nissan", 2022);
//        Bicycle bicycle = new Bicycle();
//        Boat boat = new Boat();
//
//        Vehicle[] racers = {car, bicycle, boat};
//
//        for (Vehicle x : racers) {
//            x.go();
//        }
//        --------------------------------------------------------------------------------------------------------------
//        Dynamic Polymorphism
//
//        Polymorphism = many shapes/form
//        Dynamic = after compilation (during runtime)
//        ex. A corvette is a: corvette, and a car, and a vehicle, and an object
//
//        Scanner scanner = new Scanner(System.in);
//        Animal animal;
//
//        System.out.println("What animal do you want?");
//        System.out.println("(1 = dog) or (2 = cat): ");
//        int choice = scanner.nextInt();
//
//        if (choice == 1) {
//            animal = new Dog();
//            animal.speak();
//        } else if (choice == 2) {
//            animal = new Cat();
//            animal.speak();
//        } else {
//            animal = new Animal();
//            System.out.println("That choice was invalid");
//            animal.speak();
//        }
//        --------------------------------------------------------------------------------------------------------------
//        Exception Handling
//
//        An event that occurs during the execution of a program that,
//        disrupts the normal flow of instructions
//
//        Scanner scanner = new Scanner(System.in);
//
//        try {
//
//            System.out.println("Enter a whole number to divide: ");
//            int x = scanner.nextInt();
//
//            System.out.println("Enter a whole number to divide by: ");
//            int y = scanner.nextInt();
//
//            int z = x / y;
//
//            System.out.println("result: " + z);
//        } catch (ArithmeticException e) {
//            System.out.println("You can't divide by zero");
//        } catch (InputMismatchException e) {
//            System.out.println("Please enter a number");
//        } catch (Exception e) {
//            System.out.println("Something went wrong");
//        } finally {
//            scanner.close();
//        }
//        --------------------------------------------------------------------------------------------------------------
//        File Class
//
//        An abstract representation of file and directory path names
//
//        File file = new File("message.txt");
//
//        if (file.exists()) {
//            System.out.println("That file exists");
//            System.out.println(file.getPath());
//            System.out.println(file.getAbsolutePath());
//            System.out.println(file.isFile());
//            file.delete();
//        } else {
//            System.out.println("That file does not exist");
//        }
//        --------------------------------------------------------------------------------------------------------------
//        FileWriter
//
//        try {
//            FileWriter writer = new FileWriter("poem.txt");
//            writer.write("Roses are red \nVoilets are blue \nBooty booty booty boooty \nRockin' everywhere!");
//            writer.append("\nHi");
//            writer.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        --------------------------------------------------------------------------------------------------------------
//        FileReader
//
//        try {
//            FileReader reader = new FileReader("art.txt");
//            int data = reader.read();
//
//            while(data != -1) {
//                System.out.print((char)data);
//                data = reader.read();
//            }
//
//            reader.close();
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        --------------------------------------------------------------------------------------------------------------
//        Audio
//
//        Scanner scanner = new Scanner(System.in);
//
//        File file = new File("Level_Up.wav");
//        try {
//            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
//            Clip clip = AudioSystem.getClip();
//            clip.open(audioStream);
//
//            String response = "";
//
//            while (!response.equals("Q")) {
//                System.out.println("P = play, S = Stop, R = Reset, Q = Quit");
//                System.out.println("Enter your choice: ");
//
//                response = scanner.next();
//                response = response.toUpperCase();
//
//                switch (response) {
//                    case ("P"):
//                        clip.start();
//                        break;
//                    case ("S"):
//                        clip.stop();
//                        break;
//                    case ("R"):
//                        clip.setMicrosecondPosition(0);
//                        break;
//                    case ("Q"):
//                        clip.close();
//                        break;
//                    default:
//                        System.out.println("Not a valid response");
//                }
//            }
//
//            System.out.println("Bye!");
//
//        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
//            throw new RuntimeException(e);
//        }
//        --------------------------------------------------------------------------------------------------------------
//        GUI
//
//        JFrame = a GUI window to add components to
//
//        JFrame frame = new JFrame(); // creates a frame
//
//        frame.setVisible(true); // sets the x-dimension, and y-dimension of frame
//        frame.setSize(600, 600); // make frame visible
//        frame.setTitle("JFrame title goes here"); // sets title of frame
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
//        frame.setResizable(false); //prevent frame from being resized
//
//        ImageIcon image = new ImageIcon("logo.png"); //create an ImageIcon
//        frame.setIconImage(image.getImage()); //change icon of frame
//        frame.getContentPane().setBackground(new Color(255, 255, 255)); //change color of background
//
//        MyFrame myFrame = new MyFrame();
//        --------------------------------------------------------------------------------------------------------------
//        JLabels
//
//        a GUI display area for a string of text, an image, or both
//
//        ImageIcon imageIcon = new ImageIcon("pic.png");
//        Border border = BorderFactory.createLineBorder(Color.GREEN, 33);
//
//        JLabel label = new JLabel(); //create a label
//        label.setText("Luis, do you even code?"); //set text of label
//        label.setIcon(imageIcon);
//        label.setHorizontalTextPosition(JLabel.CENTER); //set text LEFT, CENTER, RIGHT of imageIcon
//        label.setVerticalTextPosition(JLabel.TOP); //set text TOP, CENTER, BOTTOM of imageIcon
//        label.setForeground(new Color((0, 0, 0)); //set font color of text
//        label.setFont(new Font("MV Boli", Font.PLAIN, 20)); //set font of text
//        label.setIconTextGap(-25); //set gap of text to image
//        label.setBackground(Color.BLACK); //set background color
//        label.setOpaque(true); // display background color
//        label.setBorder(border);
//        label.setVerticalAlignment(JLabel.CENTER); //set vertical position of icon + text within label
//        label.setHorizontalAlignment(JLabel.CENTER); //set horizontal position of icon + text within label
//        label.setBounds(100, 100, 350, 350); //set x, y position within frame as well as dimensions
//
//        JFrame frame = new JFrame();
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(500, 500);
//        frame.setLayout(null);
//        frame.setVisible(true);
//        frame.add(label);
//        frame.pack();
//        --------------------------------------------------------------------------------------------------------------
//        JPanel
//
//        A GUI component that functions as a container to hold other components
//
//        ImageIcon icon = new ImageIcon("thumbsup.png");
//
//        JLabel label = new JLabel();
//        label.setText("Hi");
//        label.setIcon(icon);
//        label.setVerticalAlignment(JLabel.BOTTOM);
//        label.setHorizontalAlignment(JLabel.RIGHT);
//        label.setBounds(100, 100, 75, 75);
//
//        JPanel redPanel = new JPanel();
//        redPanel.setBackground(Color.RED);
//        redPanel.setBounds(0, 0, 250, 250);
//        redPanel.setLayout(null);
//
//        JPanel bluePanel = new JPanel();
//        bluePanel.setBackground(Color.BLUE);
//        bluePanel.setBounds(250, 0, 250, 250);
//        bluePanel.setLayout(null);
//
//        JPanel greenPanel = new JPanel();
//        greenPanel.setBackground(Color.GREEN);
//        greenPanel.setBounds(0, 250, 500, 250);
//        greenPanel.setLayout(null);
//
//        JFrame frame = new JFrame();
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setLayout(null);
//        frame.setSize(750, 750);
//        frame.setVisible(true);
//        greenPanel.add(label);
//        frame.add(redPanel);
//        frame.add(bluePanel);
//        frame.add(greenPanel);
//        --------------------------------------------------------------------------------------------------------------
//        JButton
//
//        A button that performs an action when clicked on
//
//        new MyFrame();
//        --------------------------------------------------------------------------------------------------------------
//        BorderLayout
//
//        A BorderLayout places components in five areas: NORTH, SOUTH, WEST, EAST, CENTER.
//        All extra space is placed in the center area
//
//        JFrame frame = new JFrame();
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(500, 500);
//        frame.setLayout(new BorderLayout(10, 10));
//        frame.setVisible(true);
//
//        JPanel panel1 = new JPanel();
//        JPanel panel2 = new JPanel();
//        JPanel panel3 = new JPanel();
//        JPanel panel4 = new JPanel();
//        JPanel panel5 = new JPanel();
//
//        panel1.setBackground(Color.RED);
//        panel2.setBackground(Color.GREEN);
//        panel3.setBackground(Color.YELLOW);
//        panel4.setBackground(Color.MAGENTA);
//        panel5.setBackground(Color.BLUE);
//
//        panel5.setLayout(new BorderLayout());
//
//        panel1.setPreferredSize(new Dimension(100, 100));
//        panel2.setPreferredSize(new Dimension(100, 100));
//        panel3.setPreferredSize(new Dimension(100, 100));
//        panel4.setPreferredSize(new Dimension(100, 100));
//        panel5.setPreferredSize(new Dimension(100, 100));
//
//        frame.add(panel1, BorderLayout.NORTH);
//        frame.add(panel2, BorderLayout.WEST);
//        frame.add(panel3, BorderLayout.EAST);
//        frame.add(panel4, BorderLayout.SOUTH);
//        frame.add(panel5, BorderLayout.CENTER);
//
//        JPanel panel6 = new JPanel();
//        JPanel panel7 = new JPanel();
//        JPanel panel8 = new JPanel();
//        JPanel panel9 = new JPanel();
//        JPanel panel10 = new JPanel();
//
//        panel6.setBackground(Color.BLACK);
//        panel7.setBackground(Color.DARK_GRAY);
//        panel8.setBackground(Color.GRAY);
//        panel9.setBackground(Color.LIGHT_GRAY);
//        panel10.setBackground(Color.WHITE);
//
//        panel5.setLayout(new BorderLayout());
//
//        panel6.setPreferredSize(new Dimension(50, 50));
//        panel7.setPreferredSize(new Dimension(50, 50));
//        panel8.setPreferredSize(new Dimension(50, 50));
//        panel9.setPreferredSize(new Dimension(50, 50));
//        panel10.setPreferredSize(new Dimension(50, 50));
//
//        panel5.add(panel6, BorderLayout.NORTH);
//        panel5.add(panel7, BorderLayout.SOUTH);
//        panel5.add(panel8, BorderLayout.WEST);
//        panel5.add(panel9, BorderLayout.EAST);
//        panel5.add(panel10, BorderLayout.CENTER);
//        --------------------------------------------------------------------------------------------------------------
//        FlowLayout
//
//        Places components in a row, sized at their preferred size.
//        If the horizontal space in the container is too small,
//        the FlowLayout class uses the next available row.
//
//        JFrame frame = new JFrame();
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(500, 500);
//        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
//
//        JPanel panel = new JPanel();
//        panel.setPreferredSize(new Dimension(250, 250));
//        panel.setBackground(Color.LIGHT_GRAY);
//        panel.setLayout(new FlowLayout());
//
//        panel.add(new JButton("1"));
//        panel.add(new JButton("2"));
//        panel.add(new JButton("3"));
//        panel.add(new JButton("4"));
//        panel.add(new JButton("5"));
//        panel.add(new JButton("6"));
//        panel.add(new JButton("7"));
//        panel.add(new JButton("8"));
//        panel.add(new JButton("9"));
//
//        frame.add(panel);
//        frame.setVisible(true);
//        --------------------------------------------------------------------------------------------------------------
//        GridLayout
//
//        Places components in a grid of cells. Each component takes all the available space within its cell,
//        and each cell is the same size.
//
//        JFrame frame = new JFrame();
//
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(500, 500);
//        frame.setLayout(new GridLayout(3, 3, 10, 10));
//
//        frame.add(new JButton("1"));
//        frame.add(new JButton("2"));
//        frame.add(new JButton("3"));
//        frame.add(new JButton("4"));
//        frame.add(new JButton("5"));
//        frame.add(new JButton("6"));
//        frame.add(new JButton("7"));
//        frame.add(new JButton("8"));
//        frame.add(new JButton("9"));
//
//        frame.setVisible(true);
//        --------------------------------------------------------------------------------------------------------------
//        JLayeredPane
//
//        Swing container that provides a third dimension for positioning components
//        ex. depth, Z-index
//
//        JLabel label1 = new JLabel();
//        label1.setOpaque(true);
//        label1.setBackground(Color.RED);
//        label1.setBounds(50, 50, 200, 200);
//
//        JLabel label2 = new JLabel();
//        label2.setOpaque(true);
//        label2.setBackground(Color.GREEN);
//        label2.setBounds(100, 100, 200, 200);
//
//        JLabel label3 = new JLabel();
//        label3.setOpaque(true);
//        label3.setBackground(Color.BLUE);
//        label3.setBounds(150, 150, 200, 200);
//
//        JLayeredPane layeredPane = new JLayeredPane();
//        layeredPane.setBounds(0, 0, 500, 500);
//
//        layeredPane.add(label1, Integer.valueOf(0));
//        layeredPane.add(label2, Integer.valueOf(0));
//        layeredPane.add(label3, Integer.valueOf(1));
//
//        JFrame frame = new JFrame("JLayeredPane");
//        frame.add(layeredPane);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(new Dimension(500, 500));
//        frame.setLayout(null);
//        frame.setVisible(true);
//        --------------------------------------------------------------------------------------------------------------
//        Open a New GUI Window
//
//        LaunchPage launchPage = new LaunchPage();
//        --------------------------------------------------------------------------------------------------------------
//        JOptionPane
//
//        Pop up a standard dialog box that prompts users for a value or informs them of something
//
//        JOptionPane.showMessageDialog(
//                null,
//                "This is some useless info",
//                "title", JOptionPane.PLAIN_MESSAGE
//        );
//        JOptionPane.showMessageDialog(
//                null,
//                "This is some useless info",
//                "title", JOptionPane.INFORMATION_MESSAGE
//        );
//        JOptionPane.showMessageDialog(
//                null,
//                "This is some useless info",
//                "title", JOptionPane.QUESTION_MESSAGE
//        );
//        JOptionPane.showMessageDialog(
//                null,
//                "This is some useless info",
//                "title", JOptionPane.WARNING_MESSAGE
//        );
//        JOptionPane.showMessageDialog(
//                null,
//                "This is some useless info",
//                "title", JOptionPane.ERROR_MESSAGE
//        );
//
//        int answer = JOptionPane.showConfirmDialog(
//                null,
//                "Luis, do you even code?",
//                "This is my title",
//                JOptionPane.YES_NO_CANCEL_OPTION
//        );
//        String name = JOptionPane.showInputDialog("What is your name? :");
//        System.out.println("Hello " + name);
//
//        String[] responses = {"No, you're awesome!", "Thank you!", "*Blush*"}
//        ImageIcon icon = new ImageIcon("smile.png");
//        JOptionPane.showOptionDialog(
//                null,
//                "You are awesome!",
//                "secret message",
//                JOptionPane.YES_NO_CANCEL_OPTION,
//                JOptionPane.INFORMATION_MESSAGE,
//                icon,
//                responses,
//                0
//        );
//        --------------------------------------------------------------------------------------------------------------
//        JTextField
//
//        A GUI textbox component that can be used to add, set, or get text
//
//        MyFrame frame = new MyFrame();
//        --------------------------------------------------------------------------------------------------------------
//        JCheckBox
//
//        A GUI component that can be selected or deselected
//
//        new MyFrame();
//        --------------------------------------------------------------------------------------------------------------
//        JRadioButton
//
//        One or more buttons in a grouping in which only 1 may be selected per group
//
//        new MyFrame();
//        --------------------------------------------------------------------------------------------------------------
//        JComboBox
//
//        A component that combines a button or editable field and a drop-down list
//
//        new MyFrame();
//        --------------------------------------------------------------------------------------------------------------
//        JSlider
//
//        GUI component that lets user enter a value by using an adjustable sliding knob on a track
//
//        SliderDemo sliderDemo = new SliderDemo();
//        --------------------------------------------------------------------------------------------------------------
//        Progress Bar
//
//        Visual aid to let the user know that an operation is processing
//
//        ProgressBarDemo demo = new ProgressBarDemo();
//        --------------------------------------------------------------------------------------------------------------
    }
}

