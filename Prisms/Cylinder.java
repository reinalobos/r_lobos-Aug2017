/* Write this concrete (non-abstract) class called Cylinder that extends Prism.  
 * It has a private field (radius) and inherits its height from its superclass, Prism 
 *    (because all prisms have a height).
 * Provide a constructor and the methods required by its abstract superclass.  
 */

public class Cylinder extends Prism {
	private int radius;
	public double calcAreaOfBase(int radius ){
		double areaOfBase = radius * radius * Math.PI;
		return areaOfBase;
	}
	public double calcPerimeter(int radius){
		double perimeter = 
	}
	public double calcSA() {
		
	}
	public Cylinder(int r, int height) {
		super(height);
		 this.radius = r;
	
	}
	
	
	
	
}
