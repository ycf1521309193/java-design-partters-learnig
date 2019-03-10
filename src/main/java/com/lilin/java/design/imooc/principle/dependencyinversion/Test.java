package com.lilin.java.design.imooc.principle.dependencyinversion;

/**
 * @author lilin
 * @Title: Test
 * @date 2019/3/9下午5:33
 */
public class Test {

    public static void main(String[] args) {
        Rock rock = new Rock();
        rock.setiCourse(new FECourse());
        rock.studyImmocCourse();

        rock.setiCourse(new JavaCourse());
        rock.studyImmocCourse();

        rock.setiCourse(new PythonCourse());
        rock.studyImmocCourse();
    }
}
