import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.ArrayList;
public class test {
	public static void main(String[] args) {
		Vecteur[] tab=new Vecteur[4];
		System.out.println("tableau:");
		for(int i=0;i<tab.length;i++) {
			tab[i]= new Vecteur(Math.random()*10,Math.random()*10);
		}
		for(int i=0;i<tab.length;i++) {
			System.out.println(tab[i]);
		}
		Arrays.sort(tab);
		System.out.println("apres le tri:");
		for(int i=0;i<tab.length;i++) {
			System.out.println(tab[i]);
		}
		
		//arraylist
		System.out.println("\nliste:");
		ArrayList<Vecteur> list = new ArrayList<>();
		for(int i=0;i<4;i++) {
		list.add(new Vecteur(Math.random()*10,Math.random()*10));
		}
		for(Vecteur item: list) {
			System.out.println(item);
		}
		Collections.sort(list);
		System.out.println("apres le tri:");
		for(Vecteur item: list) {
			System.out.println(item);
		}
		
	}
	
}
