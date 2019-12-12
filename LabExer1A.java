public class LabExer1A{
	public static void main (String[]args){
		int Favenumber=22;
		String FaveCartChar="Spongebob";
		char Iname='L';
		char Nname[] = {'l','y','k','a'};
		
		System.out.println(Favenumber + "is my favorite number");
		System.out.println("I love " + FaveCartChar + "!");
		System.out.println("The first letter of my name is " + Iname);
		System.out.println("You can call me");
		
		for (int a=0;Nname.length>a;a++){
		System.out.print(Nname[a]);
		}
	}
}