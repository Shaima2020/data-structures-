public class ArrayStack2 <T>{
    int size;
    int top;
    Object[] ArrayStack;

    public ArrayStack2(int size) {
        this.size = size;
        ArrayStack = new Object[this.size];
        top=-1;
    }
    public void push(Object newItem){
        if (isFull()) {
            System.out.println("Stack is full");
            return;}
        top=top+1;
        ArrayStack[top]=newItem;
    }
    public boolean isFull(){
        return (top==size-1);

    }
    public T pop(){
        if (isEmpty()){
            System.out.println("Stack is empty");
            return null ;}
        T item=(T)ArrayStack[top];
        top=top-1;
        return item;
    }
    public boolean isEmpty(){
        return (top==-1);

    }

}
