package main.java.base.study;

import java.util.Arrays;
import java.util.Date;

/**
 * Java中常用的包
 * java.lang  无需导入，直接使用。
 * java.awt   画窗口
 * java.net  网络编程
 * java.io   IO流
 * java.util  工具类
 */
// java中只有单继承，没有多继承，c++时多继承
// java的接口可以多继承，
// 所有类的父类为java.lang.Object
public class main01 {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        // instanceof
        Integer p = 0;
        System.out.println("p instanceof Integer: " + (p instanceof Integer));  // true

        // 验证==和equal，一般的==表示对象是否是一个对象，而equal表示对象里面的内容是否相等。
        // 但是String，Integer等基本类型的封装在内部实现了==的重载，java不允许用户重载运算符。
        Date date1 = new Date(1000);
        Date date2 = new Date(1000);
        System.out.println("validate date1==date2 :" + (date1 == date2));    // false
        System.out.println("validate date1.equals(date2):" + (date1.equals(date2)));  // true

        // final
        final int MAX_INT = 10000;  // final修饰变量，变量为常量
        // final 修饰方法，方法不能被子类重写，但是可以重载
        // final 修饰类，类不能被继承

        // 数组
        int arr01[] = {1,2,3};  // c-type
        // java的数组定义,一旦创建,长度确认
        int[] arr02 = new int[10];
        System.out.print("arr02的长度："+arr02.length+"  内容：");
        for(int i=0;i<arr02.length;i++) {
            System.out.print(arr02[i] + "  ");
        }
        System.out.print("\n");

        // 如果声明对象的数组，则new出来数组以后只是一个为null的指针，包括基础数据类型的封装对象
        String[] strs = new String[5];
        System.out.print("strs的长度："+strs.length+"  内容：");
        for(int i=0;i<strs.length;i++) {
            System.out.print(strs[i] + "  ");
        }
        System.out.println();

        // 数组动态初始化及遍历
        for(int i=0;i< strs.length;i++){
            strs[i]="zjt"+i;
        }
        for(String str:strs){
            System.out.print(str+" ");
        }
        System.out.println();



    }
}






