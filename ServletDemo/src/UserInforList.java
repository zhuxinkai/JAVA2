import java.util.Vector;

public class UserInforList {
    private UserInforList user = new UserInforList();
    private Vector vector = null;

    public UserInforList() {
        this.vector = new Vector();

    }

  public static UserInforList getInstance(){
        return  user;
  }


}
