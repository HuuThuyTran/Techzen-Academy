package afternoon;

import java.util.ArrayList;

public class TeacherSupport extends Person implements ITeacher {
    private int soBuoiThucHanh;
    private final ArrayList<Teacher> teachers = new ArrayList<>();

    //8 -> done
    @Override
    public double getSalary() {
        return soBuoiThucHanh * 100000;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }
}