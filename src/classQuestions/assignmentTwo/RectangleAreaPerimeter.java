import java.util.Scanner;
import java.io.*;
import java.lang.Math;

class Point {
	int x, y;
	Point ( int x, int y ) {
		this.x = x ;
		this.y = y;
	}
	public void printPoint() {
		System.out.println("X = " + this.x + " Y = " + this.y);
	}
}

public class RectangleAreaPerimeter {
	public static int Area(Point p1, Point p2) {
		return Math.abs(p1.x - p2.x) * Math.abs(p1.y - p2.y);
	}
	public static int Perimeter(Point p1, Point p2) {
		return Math.abs(p1.x - p2.x) * 2 + Math.abs(p1.y - p2.y) * 2;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Point p1 = new Point(10, 20);
		Point p2 = new Point(60, 40);

		System.out.print("P1 "); p1.printPoint();
		System.out.print("P2 "); p2.printPoint();

		System.out.println("Area of rectangle is: " + Area(p1, p2));
		System.out.println("Perimeter of rectangle is: " + Perimeter(p1, p2));
	}
}