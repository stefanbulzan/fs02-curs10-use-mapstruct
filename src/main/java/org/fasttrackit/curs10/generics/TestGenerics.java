package org.fasttrackit.curs10.generics;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.concurrent.atomic.AtomicInteger;

public class TestGenerics {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>(3);
        Box<String> stringBox = new Box<>("hello");
        Integer item = intBox.getItem();

        var mg = new MethodGenerics();
        var myObject = new AtomicInteger(33);
        System.out.println(mg.<AtomicInteger>sayHello(myObject));
        System.out.println(mg.sayHello(123));
        System.out.println(mg.sayHello(123.23));
    }
}

class MethodGenerics {
    public <T extends Number> double sayHello(T myObject) {
        return myObject.doubleValue() + 1;
    }
}

@Data
@AllArgsConstructor
class Box<T> {
    private T item;

    T getItem() {
        return item;
    }

    Class<T> getClass(Class<T> cls) {
        return cls;
    }
}
