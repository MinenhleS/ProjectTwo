public class Person {
    String name;
    String surname;
    int age;
    public Person(){};

    public Person(String name, String surname, int age){
        this.name = name;
        this.surname= surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public Object checking(){
        return  new Person("siya", "ngwenya", 20);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
