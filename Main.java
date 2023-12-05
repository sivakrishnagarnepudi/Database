import Model.Database;

public class Main {
    public static void main (String args[]){
        Database oR=new Oracle();
        oR.getconnection();
        Database sQl=new MySQL();
        sQl.getconnection();
    }
}
