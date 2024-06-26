class Student
{
	public static String schoolName="CVR";
	public static String classTeacherName="Nagesh sir";
	public String studentName;
	public double studentPercentage;
	public String studentRollno;

	public static void main(String[] args) 
	{
		Student s1= new Student();
		Student s2= new Student();
		s1.studentName="Raghav";
		s1.studentPercentage=95.5;
		s1.studentRollno="180010375";
		s2.studentName="Ram";
		s2.studentPercentage=85.5;
		s2.studentRollno="180010372";
		System.out.println(" All student's studies in "+schoolName);
		System.out.println(" All student's class teacher is "+classTeacherName);
		System.out.println(s1.studentName+" with "+s1.studentRollno+"Rollno with the percentage of "+s1.studentPercentage+ "%");
		System.out.println(s2.studentName+" with "+s2.studentRollno+"Rollno with the percentage of "+s2.studentPercentage+ "%");
		
	}
}
