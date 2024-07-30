

    public class PersonSample {
        String name;
        int age;
        public PersonSample(String name,int age){
            this.name=name;
            this.age=age;
        }
        void display(){
            System.out.println("Person name:"+name );
            System.out.println("Person age:"+age);
        }
        public static void main(String[] args){
            PersonSample person=new PersonSample("john",18);
            person.display();
        }
    }



