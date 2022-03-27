package Techday31Map;

import java.util.HashMap;
import java.util.Map;

public class Map02 {
    public static void main(String[] args) {

        Map<String,String> stu1 =new HashMap<>();
        stu1.put("Name","Hasan");
        stu1.put("Surname","Gul");
        stu1.put("Branj","Dev");

        Map<String,String> stu2 =new HashMap<>();
        stu2.put("Name","Halit");
        stu2.put("Surname","Esme");
        stu2.put("Branj","QA");

        Map<String,String> stu3 =new HashMap<>();
        stu3.put("Name","Muharrem");
        stu3.put("Surname","Tatlı");
        stu3.put("Branj","LQ");

        Map<String,String> stu4 =new HashMap<>();
        stu4.put("Name","Adem");
        stu4.put("Surname","Yerni");
        stu4.put("Branj","C#");

        System.out.println("Student 1 :"+stu1);
        System.out.println("Student 2 :"+stu2);
        System.out.println("Student 3 :"+stu3);
        System.out.println("Student 4 :"+stu4);

        Map<Integer,Map<String,String>> classroommap =new HashMap<>();
        classroommap.put(101,stu1);
        classroommap.put(102,stu2);
        classroommap.put(103,stu3);
        classroommap.put(104,stu4);

        System.out.println(classroommap);





    }
}
