class Main {
  public static void main(String[] args) {
    
    //This creates a soda using the default values
    Soda bob=new Soda();
System.out.println("Default Soda: \n"+bob);

//This tests the other construcor with parameters
bob=new Soda("Lemonade", 160, 1964, false);
System.out.println("\nCreated Soda: \n"+bob);

//This tests all of the accessor methods individually
System.out.println("\nAccessor Methods: ");
System.out.println("Name: "+bob.getName());
System.out.println("Calories: "+bob.getCalories());
System.out.println("Year: "+bob.getIntro());
System.out.println("Caffeine: "+bob.getCaffeine());

//This tests the Mutator Methods
bob.setName(" Sparkling Water");
bob.setCalories(1);
bob.setIntro(2000);
bob.setCaffeine(false);

//Prints post-mutator values while showing the function of toString
System.out.println("\nAfter Mutator Methods: ");
System.out.println(bob);

//Tests the additional method that randomizes the type of soda
bob.randomize();
System.out.print("\nSoda after randomization: ");
System.out.println("\n"+bob);

//Tests the additional method that changes number of calories based on number of cans
bob.totalCalories(3);
System.out.print("\nSoda after number of cans is changed: ");
System.out.println("\n"+bob);

//Creates a second soda and prints it
Soda joe=new Soda();
joe.randomize();
System.out.println("\nSoda Number 2: "+joe);

//Compares the two sodas based on their name
if(joe.equals(bob))
{
  System.out.println("\nThese sodas are equal");
}
else
{
    System.out.println("\nThese sodas are not equal");
}
  }
}