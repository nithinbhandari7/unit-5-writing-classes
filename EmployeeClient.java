public class EmployeeClient {
	public static void main(String[] args) {
		Employee worker = new Employee("Albert");
		Employee worker2 = new Employee();
		
		worker.setAge(37);
		worker.setDesignation("teacher");
		worker.setSalary(200000);
		
		System.out.println(worker);
	}
}