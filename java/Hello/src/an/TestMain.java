package com.gsitm.java.ex08;

public class TestMain {
    public static void main(String[] args) throws Exception {
        ContextContainer demo = new ContextContainer();
        Vo vo = demo.get(Vo.class);
        
        Vo vo2 = new Vo();
        vo2.setIntVal(100000);
        System.out.println("100000을 intVal에 주입함"); 
        
        //어노테이션을 통한 유효성 체크
        demo.invokeAnno(vo2);
    }
}