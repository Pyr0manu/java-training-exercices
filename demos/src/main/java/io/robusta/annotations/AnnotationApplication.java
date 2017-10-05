package io.robusta.annotations;

import io.robusta.files.DespacitoApplication;

import java.lang.reflect.Method;

/**
 * Created by Nicolas on 22/11/2016.
 */
public class AnnotationApplication {

    public static void main(String[] args) {

        Class<DespacitoApplication> myclass = DespacitoApplication.class;

        Method[] methods = myclass.getDeclaredMethods();

        for (Method method : methods){
            System.out.println(method.getName());
        }

        for (Method method : methods){
            System.out.println(method.getName() + ":" + method.getDeclaredAnnotations().length);
        }

        int count = 0;
        for (Method method : methods){
            Slow slow = method.getDeclaredAnnotation(Slow.class);
            if (slow != null){
                count++;
            }
        }

        System.out.println("count : "+count);

        long totalTime = 0;
        for (Method method : methods){
            Slow slow = method.getDeclaredAnnotation(Slow.class);
            if (slow != null){
                totalTime += slow.expectedTime();
            }
        }

        System.out.println("total time : " + totalTime);


    }
}
