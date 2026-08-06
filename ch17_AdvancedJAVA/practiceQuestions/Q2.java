package ch17_AdvancedJAVA.practiceQuestions;


class Demo {

    @Deprecated
    public void oldMethod() {
        System.out.println("Old Method");
    }
}

@SuppressWarnings("deprecation")
public class Q2 {

    public static void main(String[] args) {

        Demo d = new Demo();

        d.oldMethod();

    }
}
