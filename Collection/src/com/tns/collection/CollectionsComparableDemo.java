package com.tns.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Queue;
import java.util.PriorityQueue;


/**
	 * Goal: Demonstrate how Comparable works WITH the Java Collections Framework.
	 * ---------------------------------------------------------------------------
	 * • Create a custom class Student that implements Comparable.
	 * • Store Student objects in different collection types.
	 * • Show how Collections utilities (Collections.sort, TreeSet) use compareTo().
	 */
	class Student implements Comparable<Student> {

	    // Fields used for sorting inside collections
	    private final String name;
	    private final int marks;

	    public Student(String name, int marks) {
	        this.name  = name;
	        this.marks = marks;
	    }

	    public String getName()  { return name; }
	    public int    getMarks() { return marks; }

	    /**
	     * Natural ordering logic that all sorted collections will use.
	     *   – Higher marks first
	     *   – If marks are equal, sort by name ascending
	     */
	    @Override
	    public int compareTo(Student other) {
	        int result = Integer.compare(other.marks, this.marks); // descending by marks
	        if (result != 0) return result;
	        return this.name.compareTo(other.name);                // ascending by name
	    }

	    @Override
	    public String toString() {
	        return name + " (" + marks + ")";
	    }
	}

	public class CollectionsComparableDemo {

	    public static void main(String[] args) {

	        /* -----------------------------------------------------------
	         * 1️⃣  Using a List and Collections.sort()
	         * ----------------------------------------------------------- */
	        List<Student> studentList = new ArrayList<>();
	        studentList.add(new Student("Rahul", 90));
	        studentList.add(new Student("Anita", 95));
	        studentList.add(new Student("Deepa", 80));
	        studentList.add(new Student("Vikram", 95));

	        System.out.println("Original List:");
	        System.out.println(studentList);

	        // Collections.sort calls each Student's compareTo()
	        Collections.sort(studentList);

	        System.out.println("\nList after Collections.sort (natural order):");
	        System.out.println(studentList);

	        /* -----------------------------------------------------------
	         * 2️⃣  Using Arrays.sort()  (Arrays is part of java.util too)
	         * ----------------------------------------------------------- */
	        Student[] studentArray = studentList.toArray(new Student[0]);
	        Arrays.sort(studentArray);
	        System.out.println("\nArray after Arrays.sort:");
	        System.out.println(Arrays.toString(studentArray));

	        /* -----------------------------------------------------------
	         * 3️⃣  Using a TreeSet
	         * ----------------------------------------------------------- */
	        // TreeSet keeps elements sorted automatically using compareTo()
	        Set<Student> studentSet = new TreeSet<>();
	        studentSet.addAll(studentList);
	        studentSet.add(new Student("Rahul", 90)); // duplicate (same marks+name) is ignored

	        System.out.println("\nTreeSet (sorted & unique):");
	        System.out.println(studentSet);

	        /* -----------------------------------------------------------
	         * 4️⃣  Using a PriorityQueue (min-heap based on natural order)
	         * ----------------------------------------------------------- */
	        Queue<Student> pq = new PriorityQueue<>(studentList);
	        System.out.println("\nPriorityQueue poll order (lowest according to compareTo first):");
	        while (!pq.isEmpty()) {
	            System.out.println(pq.poll());
	        }
	    }
	}

	


