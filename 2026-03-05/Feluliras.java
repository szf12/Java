class Feluliras {
	
	public static void main( String[] args ) {
		
		Engineer eng = new Engineer();
		eng.name = "Lali";
		eng.setSalary();
		
		System.out.println( eng.salary );
	}
}

class Worker {
	
	String name;
	int age;
	double salary;
	
	public void setSalary() {
		
		this.salary = 500000;
	}
}

class Engineer extends Worker {
	
	@Override
	public void setSalary() {
		
		this.salary = 550000;
	}
}
