package anotation;

public class TestMain {
    public static void main(String[] args) throws Exception {
        ContextContainer demo = new ContextContainer();
        //Vo vo = demo.get(Vo.class);
        
        Vo vo2 = new Vo();
        vo2.setStrVal("abcdefghijklmn");
        System.out.println("abcdefghijklmn을 strVal에 주입함"); 
        vo2.setStrVal2("abcdefghijklmn");
        System.out.println("abcdefghijklmn을 strVal2에 주입함");
        //어노테이션을 통한 유효성 체크
        
        demo.invokeAnno(vo2);
    }
}