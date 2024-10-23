package firstmain;

public class Student {
    
    int rollNo;
    String name;
    String DOB;
    String grade;



    @Override
    public String toString() {
        return "Student [rollNo=" + rollNo + ", name=" + name + ", DOB=" + DOB + ", grade=" + grade + "]";
    }



    Student(){

    }
    // Student(int rl, String nm, String dob, String gd){
    //     this.rollNo = rl;
    //     this.name = nm;
    //     this.DOB = dob;
    //     this.grade = gd;
    // }

    
}
