
public class Vecteur implements Comparable<Vecteur>{
	private double x,y;
	public Vecteur (double x,double y) {
		this.x=x;
		this.y=y;
	}
	public double norme() {
		return Math.sqrt(x*x+y*y);
	}
	@Override
	public int compareTo(Vecteur o) {
		double d1=this.norme();
		double d2=o.norme();
		if(d1<d2)
			return -1;
		if(d1==d2)
			return 0;
		return 1;
//		return this.s.compareTo(o.s);
	}
	public String toString() {
		return x+" "+y;
	}
}
