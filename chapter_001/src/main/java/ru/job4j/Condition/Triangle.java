package ru.job4j.Condition;

 /**
  *@author Nikita Zenkin.
  *@since 19.05.2017.
  *@version 1.
 */

public class Triangle {

  /**
   * @param a is coordinates of point 1 in triangle.
  */

  private Point a;

  /**
   * @param b is coordinates of point 2 in triangle.
  */

  private Point b;

  /**
   * @param c is coordinates of point 3 in triangle.
  */

  private Point c;

  /**
   *
   * Constructor with 3 params(coordinates of points in triangle).
   * @param a is first point coordinates of triangle.
   * @param b is second point coordinates of triangle.
   * @param c is third point coordinates of triangle.
  */

  public Triangle(Point a, Point b, Point c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  /**
   * Method calculate side of triangle with knowing coordinates of points.
   * @param a point which contains coordiantes x and y.
   * @param b point which contains coordiantes x and y.
   * @return double.
  */

  public double calculateSideLength(Point a, Point b) {
	  return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
  }

  /**
   * Method calculate area of triangle by Heron's formula with checking of triangle existing.
   * @return double.
  */

  public double area() {
	//Calculate sides.
	double sideAB = calculateSideLength(a, b);
	double sideBC = calculateSideLength(b, c);
	double sideAC = calculateSideLength(a, c);
	//check for triangle existing.
	if ((sideAB + sideBC < sideAC) || (sideAC + sideAB < sideBC) || (sideBC + sideAC < sideAB)) {
		return -1D;
	}
	//calculate half-perimeter
    double p = (sideAB + sideAC + sideBC) / 2;
	//using Heron formula and return double value
	return Math.sqrt(p * (p - sideAB) * (p - sideAC) * (p - sideBC));
  }
}