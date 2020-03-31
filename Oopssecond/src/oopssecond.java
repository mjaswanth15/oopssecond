public class oopssecond {

	public static void main(String[] args) {
		Number groupofnumbers = new Number();
		groupofnumbers.numberone = 1;
		groupofnumbers.numbertwo = 2;
		System.out.println(groupofnumbers.numberone + " is first number ");
		System.out.println(groupofnumbers.numbertwo + " is second number");
		groupofnumbers.setfirstnumber(2.5);
		System.out.println("Number is " + groupofnumbers.getfirstnumber());
		groupofnumbers.setsecondnumber(1.0);
		System.out.println("Number is " + groupofnumbers.getsecondnumber());
		System.out.println("Addition of number1 and number2 is " + groupofnumbers.getadd());
		System.out.println("Subtraction of number1 and number2 is " + groupofnumbers.getsub());
		System.out.println("Multiplication of number1 and number2 is " + groupofnumbers.getmul());
		System.out.println("Division of number1 and number2 is " + groupofnumbers.getdiv());

	}

}
