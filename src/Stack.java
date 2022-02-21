public class Stack <T>{

    T[] content;
    int size;

    public Stack() {
        content = (T[]) new Object[10];
        size = 0;
    }

    public Stack(T[] content) {
        this.content = content;
        this.size = content.length;
    }

    public T[] getContent() {
        return content;
    }

    public void setContent(T[] content) {
        this.content = content;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    private void resize(int newSize){
        T[] copy = (T[]) new Object[newSize];
        for (int i = 0; i < this.size; i ++){
            T item = this.content[i];
            copy[i] = item;
        }
        this.content = copy;
    }

    public void push(T item){
        if(this.size == content.length)
        {
            resize(2*this.size);
        }

        content[size ++] = item;
    }

    public T pop() throws Exception {
        if (size == 0) throw new Exception("Size is 0");

        T item = content[size-1];
        content[size] = null;

        size = size - 1;

        if(size > 0 && size <= content.length / 4)
        {
            resize(content.length/2);
        }

        return item;
    }

    public T peek() throws Exception {
        if (isEmpty()) throw new Exception("Empty peak");

        return content[size-1];
    }

    public boolean isEmpty(){
        if(size > 0)
        {
            return false;
        }
        return true;
    }
}
