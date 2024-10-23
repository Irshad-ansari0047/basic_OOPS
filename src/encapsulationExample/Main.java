package encapsulationExample;

public class Main {

    public static void main(String[] args) {
        
        Student st = new Student();

    st.setStudentId(47);
    st.setDob("04/06/2002");
    st.setName("Irshad");
    st.setEmail("irshadansari00472gmail.com");
    st.setGender("male");
    st.setGrade("A");

    System.out.println("st is after setting values : " + st);

    System.out.println("name of st is : " + st.getName());
    System.out.println("Id of st is : " + st.getStudentId());
    }
    
}
