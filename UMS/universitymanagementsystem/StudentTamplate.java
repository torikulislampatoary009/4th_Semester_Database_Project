
package universitymanagementsystem;

public class StudentTamplate {
    
    String name,id,batch,dep,MotherName,FatherName,dob,mobile,password;
   // char[] password;
    StudentTamplate(String name,String id,String batch,String dep,String MotherName,String FatherName,String dob,String mobile,String password ){
        this.name=name;
        this.id=id;
        this.batch=batch;
        this.dep=dep;
        this.MotherName=MotherName;
        this.FatherName=FatherName;
        this.dob=dob;
        this.mobile=mobile;
        this.password=password;
    }
}
