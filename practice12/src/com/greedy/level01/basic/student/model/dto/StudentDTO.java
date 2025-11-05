package com.greedy.level01.basic.student.model.dto;

public class StudentDTO {

    // 필드 (학생 정보)
    private int grade;       // 학년
    private int classroom;   // 반
    private String name;     // 이름
    private int kor;         // 국어점수
    private int eng;         // 영어점수
    private int math;        // 수학점수

    // 기본 생성자
    public StudentDTO() {}

    // 모든 필드를 초기화하는 생성자
    public StudentDTO(int grade, int classroom, String name, int kor, int eng, int math) {
        this.grade = grade;
        this.classroom = classroom;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    // Getter & Setter
    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getClassroom() {
        return classroom;
    }

    public void setClassroom(int classroom) {
        this.classroom = classroom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    // 학생 정보 출력용 메소드
    public String getInformation() {
        int avg = (kor + eng + math) / 3;   // 평균 계산 (정수형)
        return "학년=" + grade + ", 반=" + classroom + ", 이름=" + name
                + ", 국어=" + kor + ", 영어=" + eng + ", 수학=" + math
                + ", 평균=" + avg;
    }
}
