package anotation;
import java.lang.reflect.Field;

public class ContextContainer {
	
	public <T> T invokeAnno(T instance) throws Exception {
        Field [] fields = instance.getClass().getDeclaredFields();
        for( Field field : fields ){
        	
        	
        	
        	StringLengthCheck annotation = field.getAnnotation(StringLengthCheck.class);
            if( annotation != null && field.getType() == String.class ){
            	
                field.setAccessible(true);
                
                
                
                System.out.println("어노테이션 Max값 체크"+annotation.val()); 
                System.out.println("strVal길이 체크"+field.get(instance).toString().length()); 

                
                
                
                //10					           //??
                if(annotation.val() < field.get(instance).toString().length()) {
                    System.out.println("Max값 길이 초과"); 
                	throw new Exception("크르릉");
                }else {
                    System.out.println("Max값 길이 넘지않음"); 
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