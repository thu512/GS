package com.gsitm.java.ex08;
import java.lang.reflect.Field;

public class ContextContainer {

	public <T> T invokeAnno(T instance) throws Exception {
        Field [] fields = instance.getClass().getDeclaredFields();
        for( Field field : fields ){
        	
        	
        	
        	IntMaxValCheck annotation = field.getAnnotation(IntMaxValCheck.class);
            if( annotation != null && field.getType() == int.class ){
            	
            	
            	
            	
            	
            	
            	
                field.setAccessible(true);
                
                
                
                System.out.println("어노테이션 Max값 체크"+annotation.val()); 
                System.out.println("intVal값 체크"+field.getInt(instance)); 

                
                
                
                //99999					//100
                if(annotation.val() < (int)field.getInt(instance)) {
                    System.out.println("Max값 초과"); 
                	throw new Exception("크르릉");
                }else {
                    System.out.println("Max값 넘지않음"); 
                }
            }
        }
        return instance;
    }

	
	
	
    public <T> T get(Class cls) throws Exception {
        T instance = (T) cls.newInstance();
        instance = invokeAnno(instance);
        return instance;
    }
}