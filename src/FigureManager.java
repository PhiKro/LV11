import java.util.ArrayList;
import java.util.HashMap;

public class FigureManager 
{
	ArrayList<Figure> figs = new ArrayList<>();

	public FigureManager() 
	{
		ArrayList<Figure> figs = new ArrayList<>();
	}
	
	public void add(Figure f)
	{
		figs.add(f);
	}
	
	public double getMaxPerimeter()
	{
		double max =0;
		for (Figure figure : figs) 
		{
			if (figure.getPerimeter()>max)
			{
				max= figure.getPerimeter();
			}
		}
		return max;
	}
	
	public double getAvarageAreaSize()
	{
		int count = 0;
		double size = 0;
		
		for (Figure figure : figs) 
		{
			size += figure.getArea();
			count++;
		}
		return size/count;
	}
	
	public HashMap<String, Double> getAreaSizeCategories()
	{
		HashMap<String, Double> sizeCats = new HashMap<>();
		sizeCats.put("Klein", 0.0);
		sizeCats.put("Mittel", 0.0);
		sizeCats.put("Groß", 0.0);
		double stor=0.0;
		
		for (Figure figure : figs) {
			if (figure.getArea()<1000)
			{
				stor = sizeCats.get("Klein"); // Setzen des bis jetzt ermittelten Werts in eine Store Variable 
				sizeCats.put("Klein", stor+figure.getArea()); // Zurückschreiben des Werts aus der Store Variable + dem aktuell ermittelten Wert. 
				// sizeCat.put("Klein", sizeCats.get("Klein")+figure.getArea()); Die Einzeilöen Variante ohne Store Variable
			}
			else if (figure.getArea()>=5000)
			{
				stor = sizeCats.get("Groß");
				sizeCats.put("Groß", stor+figure.getArea());
			}
			else 
			{
				stor = sizeCats.get("Mittel");
				sizeCats.put("Mittel", stor+figure.getArea());
			}
		}
		return sizeCats;
	}


}
