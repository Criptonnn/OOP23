package week10.Practice;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {
    int count() default 1;
}

class Polygon {
    private int size;

    public Polygon(int size) {
        this.size = size;
    }

    @MyAnnotation(count = 5)
    public void printSize() {
        System.out.println("SIZE: " + this.size);
    }
}

class Annotations {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Polygon polygon = new Polygon(25);

        for(Method method : polygon.getClass().getDeclaredMethods()) {
            if(method.isAnnotationPresent(MyAnnotation.class)) {
                MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
                for(int i = 0; i < annotation.count(); i++) {
                    method.invoke(polygon);
                }
            }
        }
    }
}
