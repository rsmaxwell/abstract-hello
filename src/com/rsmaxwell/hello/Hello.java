package com.rsmaxwell.hello;

import java.lang.reflect.Constructor;

public class Hello {

	public static void main(String[] args) throws Exception {
		System.out.println("Hello World!");

		myfunc(A.class);
		myfunc(B.class);
	}

	public static <C extends T> void myfunc(Class<C> clazz) throws Exception {

		Constructor<?> ctor = clazz.getConstructor();
		T t = (T) ctor.newInstance();

		int thing = t.thing();
		System.out.printf("thing = %d\n", thing);
	}
}