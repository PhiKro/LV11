
public class Demo {

	public static void main(String[] args) {

		Circle kreis1 = new Circle(12.5);
		Circle kreis2 = new Circle(22.5);
		Circle kreis3 = new Circle(70.5);
		Rectangle rec1 = new Rectangle(5, 5);
		Rectangle rec2 = new Rectangle(10, 5);
		
		System.out.println(kreis1.getArea());
		System.out.println(kreis2.getArea());
		System.out.println(rec1.getArea());
		System.out.println(rec2.getArea());
		System.out.println(kreis1.getPerimeter());
		System.out.println(kreis2.getPerimeter());
		System.out.println(rec1.getPerimeter());
		System.out.println(rec2.getPerimeter());
		
		FigureManager figMan = new FigureManager();
		figMan.add(kreis1);
		figMan.add(kreis2);
		figMan.add(kreis3);
		figMan.add(rec1);
		figMan.add(rec2);
		
		System.out.println(figMan.getAvarageAreaSize());
		System.out.println(figMan.getMaxPerimeter());
		System.out.println(figMan.getAreaSizeCategories());
		
	}

}
