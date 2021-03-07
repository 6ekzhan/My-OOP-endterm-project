import controller.Controller;
import data.IDBManager;
import data.DBManager;
import repositories.IRepository;
import repositories.Repository;

public class Main {
    public static void main(String[] args) { //entry point to our program
        IDBManager iManager = new DBManager();
        IRepository iMedRepository = new Repository(iManager);
        Controller controller = new Controller(iMedRepository);
        MyApplication myApplication = new MyApplication(controller);
        myApplication.start();
    }
}
