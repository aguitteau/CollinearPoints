/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dmcgrath19
 */
public class CollinearPoints {
    public class Point implements Comparable<Point> {
        int px; 
        int py; 
        
   public Point(int x, int y){
       // constructs the point (x, y)
       px = x; 
       py = y;
   }

   public   void draw(){
       // draws this point
   }
   public   void drawTo(Point that){
       // draws the line segment from this point to that point
   }
   public String toString(){
       // string representation
	   
	   return ""; //PLACEHOLDER
   }
   public int compareTo(Point that){
       // compare two points by y-coordinates, breaking ties by x-coordinates
	   
	   return 0; //PLACEHOLDER
   }
   public double slopeTo(Point that){
       // the slope between this point and that point
	   
	   return 0.0; //PLACEHOLDER
   }
   public Comparator<Point> slopeOrder(){
       // compare two points by slopes they make with this point
	   
   }
}
   public class LineSegment {
       public LineSegment(Point p, Point q){
       // constructs the line segment between points p and q
   }
   public   void draw(){
       // draws this line segment
   }
   public String toString(){
       // string representation
	   
	   return ""; //PLACEHOLDER
   }
}
//Brute force. Write a program BruteCollinearPoints.java that examines 4 points at a time and checks whether they all lie on the same line segment, returning all such line segments. To check whether the 4 points p, q, r, and s are collinear, check whether the three slopes between p and q, between p and r, and between p and s are all equal.

public class BruteCollinearPoints {
   public BruteCollinearPoints(Point[] points){
       // finds all line segments containing 4 points
   }
   public int numberOfSegments(){
       // the number of line segments
	   
	   return 0; //PLACEHOLDER
   }
   
   public LineSegment[] segments(){
       // the line segments
   }
}
}
