package ch17_AdvancedJAVA.practiceQuestions;


class Demo {

    @Deprecated
    public void oldMethod() {
        System.out.println("Old Method");
    }

    public void newMethod() {
        System.out.println("New Method");
    }
}

public class Q1 {

    public static void main(String[] args) {

        Demo d = new Demo();

        d.oldMethod();
        d.newMethod();
    }
}

