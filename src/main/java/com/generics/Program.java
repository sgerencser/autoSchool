package com.generics;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Program {

    //The course is outdated the getDeclaredField(String) method does not work since java 12
/*
    public void initializeObject(Object object){
        List<Field> fields = new ArrayList<>();
        fields = Arrays.asList(object.getClass().getDeclaredFields());

        for(Field f : fields){
          f.set(object.getClass(), (String) generateRandom());
        }
    }

    private String generateRandom(){
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        Random random = new Random();
        int targetStringLength = random.nextInt(5, 15+1);
        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        return generatedString;
    }
*/

}
