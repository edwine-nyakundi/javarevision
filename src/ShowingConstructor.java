
class Student{
    String Name="edwine";
    public  void showname(){
        System.out.println(Name);
    }
}

public class ShowingConstructor  extends Student {
    ShowingConstructor(){
        System.out.println("am a constructor");
    }
    public static  void main(String[]args){
        ShowingConstructor edu =new ShowingConstructor();
        edu.showname();
    }
}
