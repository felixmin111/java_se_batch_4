package org.example.assigment.yuki.StudentRegistrationSystem.Controller;
import org.example.assigment.yuki.StudentRegistrationSystem.Model.Student;
import org.example.assigment.yuki.StudentRegistrationSystem.Service.StudentService;
import org.example.assigment.yuki.StudentRegistrationSystem.View.StudentView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentController {

    private StudentView view;
    private StudentService service;

    public StudentController(StudentView view, StudentService service) {
        this.view = view;
        this.service = service;
        this.view.saveButton.addActionListener(new SaveButtonListener());
        this.view.displayButton.addActionListener(new DisplayButtonListener());
    }

    class SaveButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            int id = Integer.parseInt(view.idField.getText());
            String name = view.nameField.getText();
            String major = view.majorField.getText();

            Student student = new Student(id, name, major);

            service.saveStudent(student);

            view.idField.setText("");
            view.nameField.setText("");
            view.majorField.setText("");

            view.displayArea.setText("Student Saved Successfully!");
        }
    }

    class DisplayButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            view.displayArea.setText("");

            for (Student student : service.getAllStudents()) {
                view.displayArea.append(student.toString() + "\n");
            }
        }
    }
}
