package poly_overloading;

public class Point {
	  private float x;
	    private float y;

	    // Default constructor
	    public Point() {
	        this.x = 0.0f;
	        this.y = 0.0f;
	    }

	    // Constructor with one parameter
	    public Point(float x) {
	        this.x = x;
	        this.y = 0.0f;
	    }

	    // Constructor with two parameters
	    public Point(float x, float y) {
	        this.x = x;
	        this.y = y;
	    }

	    // Override toString() to display nicely
	    @Override
	    public String toString() {
	        return "(" + x + ", " + y + ")";
	    }

	    // Main method for testing
	    public static void main(String[] args) {
	        Point p1 = new Point();
	        Point p2 = new Point(10.0f);
	        Point p3 = new Point(4.5f, 7.2f);

	        System.out.println("Point 1: " + p1);
	        System.out.println("Point 2: " + p2);
	        System.out.println("Point 3: " + p3);
	    }
}

