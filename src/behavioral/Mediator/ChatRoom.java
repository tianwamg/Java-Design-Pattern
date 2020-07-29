package behavioral.Mediator;

import java.util.Date;

public class ChatRoom {

    public static void showMsg(User user,String message){
        System.out.println(new Date().toString()
                + " [" + user.getName() +"] : " + message);
    }
}
