package org.facebook.logout;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class School {

	public static void main(String[] args) {
		// Iteration collection by Enumeration.
		// Enumeration-- used to iterate legacy class
		Vector v = new Vector<>();

		// To add value into vector -- add();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);

		System.out.println(v);
		// [10,20,30,40,50]
		// Iterating by using enumeration

		Enumeration elements = v.elements();

		while (elements.hasMoreElements()) {
			Object nextElement = elements.nextElement();
//			System.out.println(nextElement);

		}

		System.out.println("Iterating by using Iterator");

		Iterator iterator = v.iterator();

		while (iterator.hasNext()) {
			Object object = iterator.next();
			System.out.println(object);
		}

		System.out.println("List Iterator");

		ListIterator listIterator = v.listIterator();
		while (listIterator.hasNext()) {
			Object object = listIterator.next();
			System.out.println("update"+object);

			if (object.equals(10)) {
				listIterator.add(1000);
			} else if (object.equals(30)) {
				listIterator.set(300);
			} else if (object.equals(50)) {
				listIterator.remove();
			}
			System.out.println("update"+object);
		}

		System.out.println("ghghg"+v);
		System.out.println("Reverse");
		while (listIterator.hasPrevious()) {
			Object object = listIterator.previous();
			System.out.println(object);

		}

	}

}
