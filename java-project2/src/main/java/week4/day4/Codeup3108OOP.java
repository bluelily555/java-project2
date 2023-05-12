package week4.day4;

import java.util.*;

public class Codeup3108OOP {

    private List<Student> students = new ArrayList<>();

    public Student makeAStudent(String code, int no, String name){
        return new Student(code, no, name);
    }
    private boolean isExist(Student pStudent){
        //중복체크
        for(Student student: students){
            if(pStudent.getNo() == student.getNo()) return true;
        }
        return false;
    }

    public void addStudent(Student student){
        if(!isExist(student)) students.add(student);
    }
    public void deleteStudent(Student pStudent){
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).getNo() == pStudent.getNo()){
                students.remove(i);
            }
        }
    }
    public void printSpecificStudents(int[] indexList){
        //콜렉션 정의 메서드 이용해서 정렬
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getNo() - o2.getNo();
            }
        });

        for (Student s:students
             ) {
            System.out.println(s.toString());
        }
        System.out.println("++++++++++++++++++++++++++");
        //출력
        for (int i = 0; i < indexList.length; i++) {
            System.out.println(students.get(indexList[i]).toString());
        }
    }

    public void process(String code, int no, String name){
        switch (code){
            case "I":
                addStudent(new Student(code, no, name));
                break;
            case "D":
                deleteStudent(new Student(code, no, name));
                break;
        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Codeup3108OOP codeup = new Codeup3108OOP();

//        for (int i = 0; i < n; i++) {
//            codeup.process(sc.next(), sc.nextInt(), sc.next());
//        }
//
        int[] indexList = new int[5];
//
//        codeup.printSpecificStudents(indexList);

        while(n > 0){
            Student newStudent = new Student(sc.next(), sc.nextInt(), sc.next());
//            System.out.println("지금 추가할 학생은 " + newStudent.toString());
            if(newStudent.code.equals("I")){

                if(codeup.students.size() == 0) codeup.addStudent(newStudent);
                for (int i = 0; i < codeup.students.size(); i++) {
                        codeup.addStudent(newStudent);
                        break;
                }

            } else {
                for (int i = 0; i < codeup.students.size(); i++) {
                    if(codeup.students.get(i).getNo() == newStudent.getNo()) codeup.deleteStudent(newStudent);
                }
            }
            
            n--;
        }

        //정렬
        for (int i = 0; i < 5; i++) {
            indexList[i] = sc.nextInt()-1;
        }
        System.out.println(Arrays.toString(indexList));
        codeup.printSpecificStudents(indexList);
    }
}

class Student{
    String code;

    int no;

    String name;
    public Student(String code, int no, String name) {
        this.code = code;
        this.no = no;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return no + " " + name;
    }

    public void remove(){
        no = 0;
        name = null;
    }
}
