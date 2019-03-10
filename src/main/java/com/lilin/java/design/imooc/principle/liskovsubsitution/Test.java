package com.lilin.java.design.imooc.principle.liskovsubsitution;

/**
 * @author lilin
 * @Title: Test
 * @date 2019/3/9下午9:02
 */
public class Test {

    public static void resize(Regtangle regtangle) {
        while (regtangle.getWidth() <= regtangle.getLength()) {
            regtangle.setWidth(regtangle.getWidth() + 1);
            System.out.println("width:" + regtangle.getWidth() + ", length:" + regtangle.getLength());
        }
        System.out.println("resize 方法结束");

    }

    //    public static void main(String[] args) {
//
//        Regtangle regtangle = new Regtangle();
//        regtangle.setWidth(10);
//        regtangle.setLength(20);
//        resize(regtangle);
//    }


    public static void main(String[] args) {
        Square square = new Square();
        square.setSideLength(10);

    }
}
