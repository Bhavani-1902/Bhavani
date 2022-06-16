public class practice3 {
    //Declare Variables
        int emp_id;
        String emp_name;
        double emp_salary;
        static String company="ITC";
        //Constructor sccepting single variable
    practice3(int emp_id, String emp_name, double emp_salary){
        this.emp_id=emp_id;
        this.emp_name=emp_name;
        this.emp_salary=emp_salary;

    }
    void emp(){
        System.out.println(emp_id+emp_name+emp_salary+company);
    }
    static void sbs (){
        company="TCS";
    }
        public static void main(String[] args) {
        //call constructor passing a single variable
            practice3 emp1=new practice3(1902,"absc",20000);
            practice3 emp2=new practice3( 3,"sss",40000);
            practice3 emp3=new practice3(6,"bbb",40590);
            practice3.sbs();
           /* practice3.company="HCL";*/
            emp1.emp();



    }
}

