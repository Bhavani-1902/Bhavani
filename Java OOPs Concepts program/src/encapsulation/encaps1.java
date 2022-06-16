package encapsulation;

public class encaps1 {
    private int emp_id;
    private String emp_name;
    private String emp_dept;
    public int getEmp_id(){
        return emp_id;
    }
    public void setEmp_id(int emp_id){
        this.emp_id=emp_id;
    }
    public String getEmp_name(){
        return emp_name;
    }
    public void setEmp_name(String emp_name){
        this.emp_name=emp_name;
    }
    public String getEmp_dept(){
        return emp_dept;
    }
    public void setEmp_dept(String emp_dept){
        this.emp_dept=emp_dept;
    }
    public static void main(String[] args) {
        encaps1 en=new encaps1();
        en.setEmp_id(48687);
        en.setEmp_name("Bhavani");
        en.setEmp_dept("jr.Executive");
        System.out.println(en.getEmp_id()+","+en.getEmp_name()+","+en.getEmp_dept());
    }
}
