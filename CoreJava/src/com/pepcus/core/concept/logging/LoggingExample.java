package com.pepcus.core.concept.logging;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingExample {

    private static final Logger logger = Logger.getLogger(LoggingExample.class.getName());

    public static void main(String[] args) throws IOException {

        FileInputStream ins = new FileInputStream("logging.properties");
        Properties properties = new Properties();
        properties.load(ins);

        String logLevel = properties.get("log.level").toString();
        logger.setLevel(Level.parse(logLevel));
        logger.config("Configured log level: " + logLevel);
        logger.info("FINE :  logger level fine");
        logger.fine("FINE :  logger level fine");
        logger.finer("FINER :  logger level finer");
        logger.finest("FINEST :  logger level finest");
        
        // FileHandler file name with max size and number of log files limit
        Handler fileHandler = new FileHandler("logs/logger.log", 2000, 5);
        fileHandler.setFormatter(new MyFormatter());
        logger.addHandler(fileHandler);

        logger.info("start getting students");
        List<Student> students = getStudents();
        logger.info("students gets successfully, size is: " + students.size());
        logger.info("Exiting students list: " + students.toString());

        logger.fine("creating new student");
        Student student = createStudent("Vikas", 12, 50);

        if (student != null) students.add(student);
        logger.fine("Student added successfully");

        logger.info("New students size: " + students.size());
        logger.info("New students list: " + students.toString());

    }

    /**
     * Create student
     * 
     * @param name
     * @param age
     * @param marks
     * @return
     */
    public static Student createStudent(String name, int age, int marks) {
        if (marks < 70) {
            logger.fine("ineligible student: " + name + " has lesst than 70 marks");
            return null;
        }
        Student student = new Student();
        student.setName(name);
        student.setAge(age);
        student.setMarks(marks);
        return student;
    }

    /**
     * Get student list
     * 
     * @return
     */
    public static List<Student> getStudents() {
        List<Student> students = new ArrayList<Student>();
        students.add(createStudent("Rahul", 12, 80));
        students.add(createStudent("Rohan", 13, 85));
        students.add(createStudent("Akash", 11, 90));
        return students;
    }
}