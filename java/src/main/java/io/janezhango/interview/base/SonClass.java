package io.janezhango.interview.base;

/**
 * Created by xiaojing on 17/4/9.
 */
public class SonClass extends ParentClass{
    public final int age = super.parentAge - 30;
    public final ParentClass parent = new ParentClass();
    public int getAge(){
        return this.age;
    }

    public void setAge(){
        //not work
        //this.age = 3;
        //works
        this.parent.setAge(45);
    }


}
