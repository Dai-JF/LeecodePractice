package offer;

import java.util.Stack;

/**
 * description: 包含min函数的栈
 *
 * @author DaiJF
 * @date 2023/4/12 - 13:58
 */
public class T2MinStack {
    Stack<Integer> stackA, stackB;

    public T2MinStack() {
        stackA = new Stack<>();
        stackB = new Stack<>();
    }

    public void push(int x) {
        stackA.push(x);
        //栈B不为空且x小于栈B栈顶元素
        if (stackB.isEmpty() || x <= stackB.peek()) {
            stackB.push(x);
        }
    }

    public void pop() {
        // 栈A出栈的元素和栈B栈顶元素相同
        if (stackA.pop().equals(stackB.peek())) {
            stackB.pop();
        }
    }

    public int top() {
        return stackA.peek();
    }

    public int min() {
        return stackB.peek();
    }
}
