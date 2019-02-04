package mid.threads;

import java.util.HashMap;

public class ClassRoll {
    private HashMap students = new HashMap();
    private void addStudent(Student stud) {
        students.put(stud.getName(), stud);
    }

    private void removeStudent(Student stud) {
        students.remove(stud.getName());
    }

    public boolean changeRoll(int code, Student stud) {         //mark as synchronized for threadsafe work
        switch (code) {
            case 1: addStudent(stud);
                    return true;
            case 2: removeStudent(stud);
                    return false;
            default: return false;
        }
    }

    public boolean isInRoll(Student stud) {                     //mark as synchronized for threadsafe work
        return students.containsKey(stud.getName());
    }
}

class Student {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
