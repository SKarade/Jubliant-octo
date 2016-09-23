//Program:Multilevel Inheritance on Hospital
import java.lang.String;
class Hospital
{
  String name,dept;
  Hospital(String n,String d)
  {
    name=n;
    dept=d;
  }
  void showdata()
   {
    System.out.println("Name is :" +name);
    System.out.println("Department :" +dept);
    System.out.println("\n");
   }

}
class Patient extends Hospital
{
  String ptnt_name;
  int room_no;

  Patient(String n,String d,String pn,int rn)
   {
    super(n,d);
    ptnt_name=pn;
    room_no=rn;
   }
   void showdata()
    {
    super.showdata();
    System.out.println("Name of Patient is:"+ptnt_name);
    System.out.println("Room No is :"+room_no);
    System.out.println("\n");
    }
}

class Medicine extends Patient
{
 String med_name;
 int price;

 Medicine(String n,String d,String pn,int rn,String mn,int p)
  {
   super(n,d,pn,rn);
   med_name=mn;
   price=p;

  }
   void showdata()
    {
     super.showdata();
     System.out.println("Medicine name is:"+med_name);
     System.out.println("Price of Medicine :"+price);
     System.out.println("\n");
    }
 }

 class HospitalOrg
 {
  public static void main(String args[])
   {
        Hospital h=new Hospital("Orange City Hospital","ICU");
         h.showdata();
        Patient p=new Patient("Orange City Hospital","ICU","Ravi",30);
        p.showdata();
        Medicine m=new Medicine("Orange City Hospital","ICU","Ravi",30,"Sline",500);


        m.showdata();
    }
 }
