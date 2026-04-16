import java.util.Vector;

public class Controller {

    private Vector<Worker> workers;

    Controller() {

        workers = null;
        getWorkers();
        countWorkers();
        countHatvan();
        sumSalary();
        bonusAverage();
        setFileData();
    }

    private void getWorkers() {

        FileManager fManager = new FileManager();
        workers = fManager.readFile( "dolgozok100.txt" );
    }

    private void countWorkers() {

        int counter = 0;
        for( int i = 0; i < workers.size(); i++ ) {

            counter ++;
        }

        System.out.println( counter + " fő dolgozónk van." );
    }

    private void countHatvan() {

        int counter = 0;
        for( Worker worker : workers ) {

            if( worker.getCity().equals( "Hatvan" ) ) {

                counter ++;
            }
        }

        System.out.println( counter + " Hatvani dolgozónk van." );
    }

    private void sumSalary() {

        int totalSalary = 0;
        for( Worker worker : workers ) {

            int salary = Integer.parseInt( worker.getSalary() );
            totalSalary += salary;
        }

        System.out.println( "A teljes fizetések: " + totalSalary );
    }

    private void bonusAverage() {

        double counter = 0;
        double sumBounus = 0;
        double avg = 0;
        for( Worker worker : workers ) {

            counter ++;
            sumBounus += Double.parseDouble( worker.getBonus() );
        }

        avg = sumBounus / counter;

        System.out.println( "A jutalmak átlaga: " + avg );
    }

    private void setFileData() {

        int gyorSalary = 0;

        for( Worker worker : workers ) {

            if( worker.getCity().equals( "Győr" )) {

                gyorSalary += Integer.parseInt( worker.getSalary() );
            }
        }

        FileManager fManager = new FileManager();
        String salary = String.valueOf( gyorSalary );
        boolean success = fManager.writeGyorSalary( salary );

        if( success ) {

            System.out.println( "Sikeres írás" );

        }else {

            System.out.println( "Hiba a fájl kezelése során" );
        }
    }
}
