package com.goffy.singleton;

import sun.rmi.runtime.Log;

import java.lang.reflect.Constructor;

/**
 * @author GUO
 */
public class Singleton {
    /**
     * 私有的构造函数：目的是为了不随便new对象，
     */
    private Singleton(){

    };
    /**
     * 单例对象
     */
    private static Singleton instance = null;

    /**
     * 静态工厂方法
     * 首先判断该实例是否为空，如果为空再new并返回,这就是典型的单例模式中的懒汉模式
     * @return
     */
    public static Singleton getInstance() {
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
    /**
     * 但是这段代码有一个问题，就是在多线程情况下，线程A和线程B同时调用getInstance()方法来进行实例化，那此时就构建了两个对象
     */
}
class Singleton2{
    /**
     * 私有构造函数
     */
    private Singleton2(){};
    /**
     * 单例对象
     */
    private static Singleton2 instance = null;

    /**
     * 静态工厂方法
     * 为了防止new instance被执行多次，因此加上同步锁synchronized，锁住整个类，注意：这里不能使用对象锁。
     * 在外面进行判断是为了节省资源，减轻内存开销
     * 但是这样也还是有一个问题，假设有这样一个场景：
     * 假如线程A最先访问进去之后正在构建对象，线程B刚刚进去方法，
     * 这种情况下要么线程A还没有构建好，线程B通过第一次判断返回true，遇到synchronized等待。
     * 要么线程A已经构建好，线程B通过第一次判断返回false。看起来没有问题，但是其实这里面涉及到JVM的指令重排问题
     *
     * @return
     */
    public static Singleton2 getInstance() {
        // 双重检测机制
        if (instance == null) {
            // 同步锁
            synchronized (Singleton2.class) {
                // 双重检测机制
                if (instance == null) {
                    instance = new Singleton2();
                }
            }
        }
        return instance;
    }
}

/**======================================================
 * JVM指令重排序
 * 简单来说就是java中new一个对象的时候，会被编译器编译成如下指令
 * memory =allocate()//1、分配对象的内存地址
 * ctorInstance(memory)//2、初始化对象
 * instance =memory//3、设置instance指向刚分配的内存地址
 * ======================================================* */
/**
 * 也就是说这些指令的顺序并非一成不变，有可能经过JVM和CPU的优化，顺序变为1-->3-->2
 * 线程A执行完1、3后，instance对象还没有初始化完成，但已经不在指向null，这个时候线程B抢到CPU资源，执行判断instance ==null
 * 返回false,从而返回一个没有初始化完成的Instance对象
 */

/**
 * 这个时候我么就可以在instance对象前面加一个volatile修饰符
 */

/**========================================================
 * volatile修饰符阻止了变量访问前后的指令重排，保证了指令z执行顺序
 ==========================================================*/

class Singleton3{
    private Singleton3() {}  //私有构造函数
    private volatile static Singleton3 instance = null;
    public static Singleton3 getInstance() {
        if (instance == null) {
            synchronized (Singleton3.class){
                if (instance == null) {
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }
}


/**
 * 单例模式其他实现方式
 * 1、使用静态内部类实现单例模式
 * 特点：
 * 1、从外部无法访问内部类LazyHolder，只有当调用Singleton4.getInstance()方法时才能得到单例对象INSTANCE
 * 2、INSTANCE对象初始化的时候并不是在单例类Singleton4加载的时候，而是在调用getInstance()方法时（使得静态内部类LazyHolder被加载时），
 * 因此这种方法其实是利用了classloader的类加载机制实现懒加载，并且保证了构建单例的线程安全
 * 局限：无法j解决通过反射来重复构建对象
 */
class Singleton4{
    private static class LazyHolder{
        private static final Singleton4 INSTANCE = null;
    }
    private Singleton4(){

    }
    private static Singleton4 getInstance(){
        return LazyHolder.INSTANCE;
    }
    /**
     * 模拟利用反射打破单例模式的约束
     */
    public static void main(String[] args) {
        try{
            // 获得构造器
            Constructor constructor = Singleton3.class.getDeclaredConstructor();
            // 设置可访问
            constructor.setAccessible(true);
            // 构造两个不同的对象
            Singleton3 o1 = (Singleton3)constructor.newInstance();
            Singleton3 o2 = (Singleton3)constructor.newInstance();
            // 返回false
            System.out.println(o1.equals(o2));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}


/**
 * 单例模式的其他实现方式
 * 2、枚举
 * 特点：防止通过反射获得构造方法、保证线程安全
 * 局限：不是懒加载，单例对象实在枚举类被加载的时候初始化的
 */

enum SingletonEnum {
    INSTANCE;
}

/**=================后记=======================
 * 1. volatile关键字不但可以防止指令重排，也可以保证线程访问的变量值是主内存中的最新值。有关volatile的详细原理，我在以后的漫画中会专门讲解。
 * 2.使用枚举实现的单例模式，不但可以防止利用反射强行构建单例对象，而且可以在枚举类对象被反序列化的时候，保证反序列的返回结果是同一对象。
 * 对于其他方式实现的单例模式，如果既想要做到可序列化，又想要反序列化为同一对象，则必须实现readResolve方法。
 *====================完=======================*/



