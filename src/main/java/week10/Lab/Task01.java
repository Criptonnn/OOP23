package week10.Lab;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface CanSendMessage {

}
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface RequiresPermission {
    boolean adminPermission() default false; // ako je adminPermission = true onda je admin
}
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface UserPermission {
    boolean adminPermission() default false; // ako je adminPermission = true onda je admin
}
@UserPermission(adminPermission = true)
class Admin {
    private String username;

    public Admin(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}
@UserPermission
class User {
    private String username;

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}

class TheMessagingSystem {

    @CanSendMessage
    @RequiresPermission(adminPermission = true)
    public static void sendMessage(Object object, String message) {
        if(object.getClass().isAnnotationPresent(UserPermission.class)) {
            UserPermission permission = object.getClass().getAnnotation(UserPermission.class);
            if(permission.adminPermission()) {
                System.out.println("Message from admin: " + message);
            } else {
                System.out.println("You are not allowed to send messages");
            }
        }
    }
}

class Task01 {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Admin admin = new Admin("admin123");
        User user = new User("user123");

        TheMessagingSystem theMessagingSystem = new TheMessagingSystem();
        for(Method method : theMessagingSystem.getClass().getDeclaredMethods()) {
            if(method.isAnnotationPresent(CanSendMessage.class)) {
                method.invoke(theMessagingSystem, admin, "admin message");
                method.invoke(theMessagingSystem, user, "user message");
            }
        }
    }
}
