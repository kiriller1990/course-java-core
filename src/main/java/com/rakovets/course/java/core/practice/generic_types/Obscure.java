package com.rakovets.course.java.core.practice.generic_types;

public class Obscure <T> {
    private T object;

    public Obscure (T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }

    public void setObject() {
        this.object = object;
    }

    public  boolean isPresent() {
        return object != null;
    }

    public boolean isEmpty() {
        return object == null;
    }

    public T orElse(T value) {
        if (object != null) {
            return object;
        }else {
            return value;
        }

    }

    public T orElseThrow() throws NullPointerException {
        if (object == null) {
            throw new NullPointerException("Field is null");
        } else {
            return object;
        }
    }

    public static <S> Obscure <S> of(S obj) {
        return new Obscure<S>(obj);
    }

    public static <S> Obscure <S>  empty() {
        return new Obscure<S>(null);

    }



}
