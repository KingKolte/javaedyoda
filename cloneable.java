package com.edyoda.assignment;
import java.lang.Cloneable;

public class cloneable {

        static class A implements Cloneable {
        int i;
        String s;

            public A(int i, String s)
        {
            this.i = i;
            this.s = s;
        }


        @Override
        protected Object clone()
                throws CloneNotSupportedException
        {
            return super.clone();
        }
    }


    public static void main(String[] args)throws CloneNotSupportedException
    {

        A a = new A(20, "Rushikesh Kolte");

        A b = (A)a.clone();

        System.out.println(b.i);
        System.out.println(b.s);


    }
}
