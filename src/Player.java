/**
 * Created by asam82 on 2016-02-01.
 */
public class Player {
    private User parent;

    public Player(){
        parent = new User();
    }
    void userMethod(){
        parent.userMethod();
    }
    void playerMethod(){

    };
}
