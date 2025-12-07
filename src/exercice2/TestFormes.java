package exercice2;

public class TestFormes {
    public static void main(String[] args) {
		Forme c1=new Cercle(2,3,2.5);
		Forme r1=new Rectangle(1,2,3,4);
		Forme c2=new Cercle(6,4,2.5);
		System.out.println("l'aire de c1 = "+c1.aire()+" et perimetre="+c1.perimetre());
		System.out.println("l'aire de c2 = "+c2.aire()+" et perimetre="+c2.perimetre());
		System.out.println("l'aire de r1 = "+r1.aire()+" et perimetre="+r1.perimetre());
		c1.deplacer(1,2);
		c2.deplacer(2,2);
		r1.deplacer(1,20);
		System.out.println("cercle 1 : x="+c1.x +" et y="+c1.y);
		System.out.println("cercle 2 : x="+c2.x +" et y="+c2.y);
		System.out.println(" rectangle : x="+r1.x +" et y="+r1.y);

}}
