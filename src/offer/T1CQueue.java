package offer;

import java.util.Stack;

/**
 * description: 两个栈实现队列
 *
 * @author DaiJF
 * @date 2023/4/11 - 14:34
 */
public class T1CQueue {

    //创建两个栈
    Stack<Integer> inStack, outStack;

    public T1CQueue() {
        inStack = new Stack<>();
        outStack = new Stack<>();
    }

    /**
     * 入队
     */
    public void appendTail(int value) {
        inStack.push(value);
    }

    /**
     * 出队
     */
    public int deleteHead() {
        //B 不为空，直接出栈
        if (!outStack.isEmpty()) {
            outStack.pop();
        }
        //B 为空,但 A 不为空，从 A 拿元素
        if (!inStack.isEmpty()) {
            while (!inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
            return outStack.pop();
        }
        //B为空 且 A 为空 直接返回-1
        return -1;
    }
}
