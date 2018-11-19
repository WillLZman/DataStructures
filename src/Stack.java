import java.util.EmptyStackException;

public class Stack <T> {
    private static class StackNode<T>{
        private T data;
        private StackNode<T> next;

        public StackNode(T data){
            this.data = data;
        }

    }

    private StackNode <T> top;

    public T pop(){
        T item = top.data;
        if (top == null){
            throw new EmptyStackException();
        }
        top = top.next;
        return item;
    }
    public void push (T item) {
        StackNode<T> stackNode = new StackNode<T>(item);
        stackNode.next = top;
        top = stackNode;
    }

    public T peek(){
        if (top == null){
            throw new EmptyStackException();
        }
        return top.data;
    }

    public boolean isEmpty(){
        return top == null;
    }
}
