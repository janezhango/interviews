package io.janezhango.interview.base;

/**
 * Created by xiaojing on 17/4/9.
 */
public class ParentClass {

    public final int parentAge = 60;

    public final int getParentAge(){
        return this.parentAge;
    }

    private int age = 60;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
