
public class Java_Encapsulation {

	public static void main(String args[]) {
		EncapsulationDemo obj = new EncapsulationDemo();
        obj.setEmp_Name("Chhavi");
        obj.setEmp_Age(20);
        obj.setid_no(123);
        System.out.println("Employee Name: " + obj.getEmp_Name());
        System.out.println("Employee SSN: " + obj.getid_no());
        System.out.println("Employee Age: " + obj.getEmp_Age());

	}

}

class EncapsulationDemo{
    private int id_no;
    private String emp_Name;
    private int emp_Age;

    //Getter and Setter methods
    public int getid_no(){
        return id_no;
    }

    public String getEmp_Name(){
        return emp_Name;
    }

    public int getEmp_Age(){
        return emp_Age;
    }

    public void setEmp_Age(int newValue){
        emp_Age = newValue;
    }

    public void setEmp_Name(String newValue){
        emp_Name = newValue;
    }

    public void setid_no(int newValue){
        id_no = newValue;
    }
}



