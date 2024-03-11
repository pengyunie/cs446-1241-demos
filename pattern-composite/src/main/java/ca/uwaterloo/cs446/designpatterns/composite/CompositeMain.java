package ca.uwaterloo.cs446.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeMain {
	public static void main(String[] args) {
		Directory photos = new Directory("PHOTOS");
		Directory shanghai = new Directory("SHANGHAI");
		Directory kyoto = new Directory("KYOTO");
		File opt = new File("Oriental Pearl Tower");
		File bund = new File("The Bund");
		File kiyomizu = new File("Kiyomizu Dera");

		shanghai.add(opt);
		shanghai.add(bund);
		kyoto.add(kiyomizu);

		photos.add(shanghai);
		photos.add(kyoto);

		// List of components
		List<Component> components = new ArrayList<Component>();

		components.add(photos);
		components.add(new File("Important Document"));

		// Client code can treat components the same
		for (Component component : components) {
			System.out.println("> ls " + component.getName());
			System.out.println(component.ls());
		}
	}
}
