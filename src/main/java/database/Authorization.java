package database;

public class Authorization {
    public boolean authorise(DataBase db) {
        db.getUserData();
        return true;
    }
}
