package org.example.Day13;


import org.example.Day13.model.Teacher;

public class TeacherFileRepository extends GenericFileRepository<Teacher> {
    @Override
    public Teacher parser(String[] data) {
        Teacher teacher = new Teacher(
                Integer.parseInt(data[0]),
                data[1],
                Integer.parseInt(data[2]),
                data[3],
                data[4]

        );
        return teacher;
    }
}
