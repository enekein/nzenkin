package ru.job4j.Condition;

 /**
  *@author Nikita Zenkin.
  *@since 19.05.2017.
  *@version 1.1.
 */

public class Point {

   /**
	* @param x is coordinate of point.
   */

   private int x;

   /**
	* @param y is coordinate of point.
   */

   private int y;

   /**
    * Constructor with 2 params(coordinates).
	* @param x is x int coordinate.
	* @param y is y int coordinate.
   */

   public Point(int x, int y) {
      this.x = x;
      this.y = y;
  }

   /**
    * Method to get argument x.
	* @return int.
   */

  public int getX() {
      return this.x;
  }

   /**
    * Method to get argument y.
	* @return int.
   */

  public int getY() {
     return this.y;
  }

  /**
   * Method that define is point on line.
   * @return boolean.
   * @param a is int x coordinate.
   * @param b is int y coordinate.
  */

  public boolean is(int a, int b) {
	  return (a * this.x + b) == this.y;
  }
}