public class Company {
	
	public static void main (String[] args) {
		
		Worker worker = new Worker();
		worker.setSalary();
		System.out.println( worker.salary );
		
		Engineer geza = new Engineer();
		geza.name = "Géza";
		geza.setSalary();
		System.out.println( geza.name );
		System.out.println( geza.salary );
		
	}
}

class Worker {
	
	String name;
	double salary;
	
	public void setSalary() {
		
		salary = 400000;
	}
}

class Engineer extends Worker {
	
	
	public void setSalary() {
		
		super.setSalary();
		salary = salary * 1.1;
	}
}
