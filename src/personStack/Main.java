package personStack;

public class Main {
    public static void main(String[] args) {
        Person person1= new Person("ade", "123");
        Person person2 = new Person("olu", "321");

        PersonStack personStack = new PersonStack();


            personStack.push(person1);
            personStack.push(person2);


        System.out.println(personStack.pop());
        System.out.println(personStack.pop());
    }
}
