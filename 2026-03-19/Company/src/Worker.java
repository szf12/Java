public class Worker {

    private String name;
    private String city;
    private String address;
    private String salary;
    private String bonus;
    private String born;
    private String hire;

    Worker() {

        name = "";
        city = "";
        address = "";
        salary = "";
        bonus = "";
        born = "";
        hire = "";
    }

    public String getName() { return name; }
    public String getCity() { return city; }
    public String getAddress() { return address; }
    public String getSalary() { return salary; }
    public String getBonus() { return bonus; }
    public String getBorn() { return born; }
    public String getHire() { return hire; }

    public void setName( String text ) { name = text; } 
    public void setCity( String text ) { city = text; } 
    public void setAddress( String text ) { address = text; } 
    public void setSalary( String text ) { salary = text; } 
    public void setBonus( String text ) { bonus = text; } 
    public void setBorn( String text ) { born = text; } 
    public void setHire( String text ) { hire = text; } 
}
