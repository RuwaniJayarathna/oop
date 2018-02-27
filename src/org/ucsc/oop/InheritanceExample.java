package org.ucsc.oop;
import java.awt.*;

public class InheritanceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Triangle t =new Triangle();
		t.setFillColor(Color.green);
		t.setNumberOfAngels(3);
		t.setNumberOfLines(4);
		System.out.println(t.getNumberOfAngels());
		System.out.println(t.getNumberOfLines());
		System.out.println(t.getFillColor());
		

}
}
