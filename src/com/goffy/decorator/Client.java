package com.goffy.decorator;

/**
 * 客户端测试输出结果
 * @Author:Goffy
 */
public class Client {
    public static void main(String[] args) {
        //985、211录取的学生必须德智体美
        System.out.println("985、211录取参考");
        AdminTo adminTo = new AdminToImpl();
        AdminTo adminToDe = new DeDecorator(adminTo);
        AdminTo adminToZhi = new ZhiDecorator(adminToDe);
        AdminTo adminTi = new TiDecorator(adminToZhi);
        AdminTo adminToMei = new MeiDecorator(adminTi);
        adminToMei.enter();

        System.out.println("其他学院录取参考");
        AdminTo adminTo1 = new AdminToImpl();
        AdminTo adminToDe1 = new DeDecorator(adminTo1);
        AdminTo adminToZhi1 = new ZhiDecorator(adminToDe1);
        adminToZhi1.enter();
    }
}
