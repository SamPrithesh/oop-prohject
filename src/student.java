public class student {

    //attributes

    //syntax = type + name + value

    int id;
    String name;
    String email;
    int phoneno;

    //syntax of constructor = className + ( ) + {this.attributeName = attributeName}
    student(int id, String name, String email, int phoneno){
        this.id =id;
        this.name =name;
        this.email =email;
        this.phoneno =phoneno;
    }

    //syntex of method =return type + method name +() +{}

        //study
        //read
        //eat
        //info

    void study(){
        System.out.println("student can study");
    }

    void read(){
        System.out.println("student can read");
    }

    void eat(){
        System.out.println("student can eat");
    }

    void info() {
        System.out.println(id);
        System.out.println(name);
        System.out.println(email);
        System.out.println(phoneno);

    }


}
