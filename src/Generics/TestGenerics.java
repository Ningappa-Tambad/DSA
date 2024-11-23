package Generics;

public class TestGenerics<T> {

    T content;

    public void setContent(T content) {

        this.content = content;
    }

    public T getContent() {
        return content;
    }
}
