package designpatterns;

class Student{

    private String name;
    private Integer rollNo;
    private Integer marks;
    private String course;
    private String gender;
    private boolean isOptedForSubject;

    public Student(StudentBuilder studentBuilder){
        name = studentBuilder.getName();
        rollNo = studentBuilder.getRollNo();
        marks = studentBuilder.getMarks();
        course = studentBuilder.getCourse();
        gender = studentBuilder.getGender();
        isOptedForSubject = studentBuilder.isOptedForSubject();
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Integer getRollNo(){
        return rollNo;
    }

    public void setRollNo(Integer rollNo){
        this.rollNo = rollNo;
    }

    public Integer getMarks(){
        return marks;
    }

    public void setMarks(Integer marks){
        this.marks = marks;
    }

    public String getCourse(){
        return course;
    }

    public void setCourse(String course){
        this.course = course;
    }

    public String getGender(){
        return gender;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public boolean isOptedForSubject() {
        return isOptedForSubject;
    }

    public void setOptedForSubject(boolean optedForSubject) {
        isOptedForSubject = optedForSubject;
    }

    @Override
    public String toString(){
        return "Student{"+
                "name='"+ name +'\''+
                ", rollNo="+rollNo+
                ",course="+ course+
                ",marks="+ marks+
                ",gender="+ gender+
                ",isOptedForSubject="+ isOptedForSubject+
                '}';
    }
}

class StudentBuilder{
    private String name;
    private Integer rollNo;
    private Integer marks;
    private String course;
    private String gender;
    private boolean isOptedForSubject;

    public StudentBuilder(String name, Integer rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName(){
        return name;
    }

    public StudentBuilder setName(String name){
        this.name = name;
        return this;
    }

    public Integer getRollNo(){
        return rollNo;
    }

    public StudentBuilder setRollNo(Integer rollNo){
        this.rollNo = rollNo;
        return this;
    }
    public String getCourse(){
        return course;
    }

    public StudentBuilder setCourse(String course){
        this.course = course;
        return this;
    }

    public Integer getMarks(){
        return marks;
    }

    public StudentBuilder setMarks(Integer marks){
        this.marks = marks;
        return this;
    }

    public String getGender(){
        return gender;
    }

    public StudentBuilder setGender(String gender){
        this.gender = gender;
        return this;
    }

    public boolean isOptedForSubject(){
        return isOptedForSubject;
    }

    public StudentBuilder hasOptedForSubject(boolean isOptedForSubject){
        this.isOptedForSubject = isOptedForSubject;
        return this;
    }

    public Student build(){
        return new Student(this);
    }
}

public class Builder {
    public static void main(String[] args) {
        Student student = new StudentBuilder("Shubham", 44)
                .hasOptedForSubject(true)
                .setCourse("Btech")
                .setMarks(76)
                .setGender("Male")
                .build();
        System.out.println(student);

    }
}




