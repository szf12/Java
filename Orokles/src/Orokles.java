public class Orokles {
    public static void main(String[] args) throws Exception {
        
        // Person person = new Person();
        // person.age = 35;
        // person.name = "Jani";
        // System.out.println( "Jani kora: " + person.age );
        // System.out.println( "Jani neve: " + person.name );


        // Worker worker = new Worker();
        // worker.age = 40;
        // worker.name = "Sanyi";
        // worker.role = "meos";
        // worker.salary = 550000;
        // System.out.println( "Sanyi neve: " + worker.name );
        // System.out.println( "Sanyi kora: " + worker.age );
        // System.out.println( "Sanyi besztása: " + worker.role );
        // System.out.println( "Sanyi fizetése: " + worker.salary );

        Worker worker01 = new Worker();
        System.out.println( worker01.name );
        System.out.println( worker01.age );

        Worker worker02 = new Worker( "Pityu", 45 );
        System.out.println( worker02.name );
        System.out.println( worker02.age );

    }
}

class Person {

    String name;
    int age;

    Person() {

        name = "Juli";
        age = 50;
    }

    Person( String name, int age ) {

        this.name = name;
        this.age = age;
    }
}

class Worker extends Person {

    String role;
    int salary;

    Worker() {

        super();
    }

    Worker( String name, int age ) {

        super( name, age );
    }
}
