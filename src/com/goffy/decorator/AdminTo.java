package com.goffy.decorator;

/**
 * 考虑这样一个场景，高校录取生源，需要德智体美全面发展的学生，有的学生只占一样或者多样，有的学生全占，用装饰器模式实现
 * @Author:Goffy
 */
public interface AdminTo {
    /**
     * 定义录取的抽象行为
     */
    void enter();
}
