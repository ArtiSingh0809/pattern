package com.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class FullySingletonClass {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

        SingletonImpl object1 = SingletonImpl.getInstance();
        System.out.println("Object1:" + object1);

        try {
            FileOutputStream fos = new FileOutputStream("abc.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(object1);

            FileInputStream fis = new FileInputStream("abc.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            SingletonImpl object2 = (SingletonImpl) ois.readObject();
            System.out.println("Object2 : " + object2);

            System.out.println("Object2 == object1: " + (object2 == object1));
        } catch (Exception e) {
            // TODO: handle exception
        }
        try {
        	SingletonImpl Object3 = (SingletonImpl) object1.clone();
        	System.out.println("Object3: clone:" + Object3);
        	System.out.println("Clone :: Object3 == object1: " + (Object3 == object1));
            Constructor[] constructors = SingletonImpl.class.getDeclaredConstructors();
            System.out.println("constructors.length:" + constructors.length);
            for (Constructor constructor : constructors) {
                // Below code will not destroy the singleton pattern
                constructor.setAccessible(true);
                System.out.println("constructors.length:" + constructors.length);
                Object3 = (SingletonImpl) constructor.newInstance();
                System.out.println("Object4: Break through Reflection:" + Object3);
                break;
            }
        } catch (Exception ew) {
        	ew.printStackTrace();
        }
        
	}
}
