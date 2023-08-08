// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Student students[] = new Student[3];
        int j=0;
        for(int i=1;i<=students.length;i++){
            students[j]=new Student();
            students[j].input();
            students[j].show();
            System.out.println("The total marks of student"+i+ " : "+students[j].totalMarks()+
                    "\nThe highest marks of student"+i+ " : "+students[j].getHighest()+
                    "\nThe lowest marks of student"+i+ " : "+students[j].getLowest()+
                    "\nThe average marks of student"+i+ " : "+students[j].getAverage()+
                    "\nThe number of subjects student"+i+" passed : "+students[j].getPassCount()
            );
            j++;
        }
        System.out.println("The total number of students is : "+Student.totalStudents());
    }
}