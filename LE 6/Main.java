/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		Offering o = new Icecream ();
		o = new Gin(o);
		System.out.println(o.getName()+" "+o.getPrice());
		o = new Coffee();
		o = new Rum(o);
		o = new Rum(o);
		System.out.println(o.getName()+" "+o.getPrice());
		
	}
}
