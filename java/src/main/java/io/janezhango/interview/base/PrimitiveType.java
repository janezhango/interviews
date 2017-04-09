package io.janezhango.interview.base;

/**
 * Created by xiaojing on 17/4/9.
 */
public class PrimitiveType {
    public static void main(String[] orgs){
        //float f = 1.2; cannot work, 1.2 default type is double
        float f = 1.2F;
        double d = 1.2;

        short s = 1;
        //short s1 = s + 1; cannot work, s will became int
        short ss1 = (short) (s + 1);
        short ss2 = (short) (s + (short) 1);
        short ss = 1;
        //short sss = s + ss; cannot work, need to cast to short for sum variable
        short sss = (short) (s + ss);

        int i = s + 1;
        s += 1;


        Integer a = new Integer(3);
        Integer b = 3;                  // 将3自动装箱成Integer类型
        int c = 3;
        System.out.println(a == b);     // false 两个引用没有引用同一对象
        System.out.println(a == c);     // true a自动拆箱成int类型再和c比较

        Integer f1 = -129, f2 = -129, f3 = 150, f4 = 150;

        System.out.println(f1 == f2);   //true when between -128 and 127
        System.out.println(f3 == f4);   //false when >127

        String s1 = "Programming";
        String s2 = new String("Programming");
        String s3 = "Program";
        String s4 = "ming";
        String s5 = "Program" + "ming";
        String s6 = s3 + s4;
        System.out.println(s1 == s2);   //false
        System.out.println(s1 == s5);   //true
        System.out.println(s1 == s6);   //==false
        System.out.println(s1 == s6.intern()); //true
        System.out.println(s2 == s2.intern()); //false

        char cha = '中';
        System.out.println(cha); //false

    }
}
