/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		Beverage w = new Whisky(); //all references must be different if you put Beverage keyword before it, else can be w= new Rum()
		w.templateMethod(30);
		 w = new Rum();
		w.templateMethod(60);
		Beverage b = new Beer();
		b.templateMethod(250);
	}
}
