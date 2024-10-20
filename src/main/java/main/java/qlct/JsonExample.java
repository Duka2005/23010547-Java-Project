package main.java.qlct;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;

class Student {
    int id;
    String name;
    int age;
    String major;
    
    public Student(int id, String name, int age, String major) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.major = major;
    }
}

public class JsonExample {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("students.json");
            Gson gson = new Gson();

            List<Student> students = gson.fromJson(reader, new TypeToken<List<Student>>() {}.getType());
            reader.close();
            for (Student student : students) {
                System.out.println(student.id);
            }

            students.add(new Student(3,"Le Van C",22,"Toán học"));
            students.add(new Student(4,"Do Viet Dung",44,"  Tin hoc"));
            FileWriter writer = new FileWriter("students.json");
            gson.toJson(students, writer);
            writer.close(); 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}