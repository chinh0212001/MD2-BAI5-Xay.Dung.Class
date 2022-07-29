public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("Trước khi gán " + student);
        student.setName("Chinh");
        student.setClasses("lớp diu e");
        System.out.println("Sau khi gán" +student);
    }
}