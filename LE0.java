/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Changes
{
    int x;
    String n;
    void set_age(int age){
        this.x= age;
    }
    
    public int get_age(){
        return x;
    }
    
    void set_name(String name){
        this.n = name;
    }
        
        public String get_name(){
            return n;
        }
    }

public class JUET{
    	public static void main(String[] args) {
		Changes obj1 = new Changes();
		
		obj1.set_age(15);
		System.out.println(obj1.get_age());
		
		obj1.set_name("Harry Potter");
		System.out.println(obj1.get_name());
		
	}
}
