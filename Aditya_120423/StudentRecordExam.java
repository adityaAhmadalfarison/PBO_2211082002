/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aditya_120423;

import Aditya_120423.StudentRecord;

/**
 *
 * @author Aditya
 */
public class StudentRecordExam extends StudentRecord {
    public StudentRecordExam(){
    super.name = "amirudin";
    super.address = "baso";
    super.age = 19;
    
    super.mathGrade = 50;
    super.englishGrade = 45;
    super.scienceGrade = 90;
    super.average = (mathGrade+scienceGrade)/2;
}
}