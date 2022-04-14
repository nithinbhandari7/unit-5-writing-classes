public class Employee {
	//instance data (attributes)
	private String name;
	private int age;
	private String designation;
	private double salary;
	
	public Employee() {
		name = "";
		age = 0;
		designation = "";
		salary = 0;
	}
	
	public Employee(String n) {
		name = n;
		age = 0;
		designation = "";
		salary = 0;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int a) {
		if(a < 14) {
			throw new IllegalArgumentException();
		}
		age = a;
	}
	
	public String getDesignation() {
		return designation;
	}
	
	public void setDesignation(String d) {
		designation = d;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double s) {
		salary = s;
	}
	
	public String toString() {
		return "Name: " + name + "\nDesignation: " + designation + "\nAge: " + age + "\nSalary: " + salary;
	}
}

/*
 class - blueprint for how an object of this type will work
 	1. attributes (characteristics, instance data)
 	2. constructors - methods that allow the user to instantiate (create) an object of this type
 	3. other method (accessors (getters) and mutators (setters))
 
 ATTRIBUTES
 private - only accessible directly (via the dot operator) inside this class
 protected - accessible directly in any subclasses of this class, and from any class in the same package as this class
 public - accessible directly from any class
 
 instance data should always be declared as private unless there's a good reason to do otherwise you should NEVER declare data as public unless 
 	it's constant
 
 CONSTRUCTORS
 in java, if a class defines NO constructor the default constructor is automatically provided by the JRE
 As soon as any constructor if defied though, you no longer are provided with the default constructor
 Default Constructor - a constructor with an empty parameter list - initializes instance data to default values
 THE JOB OF ANY CONSTRUCTOR IS TO INTIALIZE AN INSTANCE DATA
 
 OTHER METHODS
 Accessors - allow the user to access information about instance data
 Mutators - allow the user to change the value of instance data (but on our rules)
 */
