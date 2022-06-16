public class student {
    int stu_id;
    String stu_name;
    student(int stu_id,String stu_name){
        this.stu_id=stu_id;
        this.stu_name=stu_name;
    }
    student(){
        this.stu_id=stu_id;
        this.stu_name=stu_name;
    }
    public static void main(String[] args) {
        student s=new student(3,"sbsrs");
        System.out.println(s.stu_id+","+s.stu_name);
        student s1=new student(33,"BS");
        System.out.println(s1.stu_id+","+s1.stu_name);
        student s2=new student(22,"SSS");
        System.out.println(s2.stu_id+","+s2.stu_name);
        student s3=new student(18,"suni");
        System.out.println(s3.stu_id+","+s3.stu_name);

    }
}

