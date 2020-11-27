import java.util.Scanner;

class fatherAgeException extends Exception {
    public String toString() {
        return ("Wrong Age!! Father's age is less than 0");
    }
}

class sonAgeException extends Exception {
    int a, b;

    sonAgeException(int sage, int fage) {
        a = sage;
        b = fage;
    }

    public String toString() {
        if (a == b)
            return ("Wrong Age!! Son's age is equal to father's age");
        /*
         * if(a<0) return("Wrong Age!! Son's age is less than 0");
         */ else
            return ("Wrong Age!! Son's age is more than father's age");
    }
}

class Father {
    public int agel;
    Scanner scan = new Scanner(System.in);
    int age1;

    Father() {
        System.out.print("Enter father's age: ");
        age1 = scan.nextInt();
    }

    void ex1() throws fatherAgeException {
        if (age1 < 0)
            throw new fatherAgeException();
    }
}

class Son extends Father {
    public int age2;

    Son() {
        System.out.print("Enter son's age: ");
        age2 = scan.nextInt();
    }

    void ex2() throws sonAgeException {
        if (age2 < 0 || age2 >= age1)
            throw new sonAgeException(age2, age1);
    }
}

class Main {
    public static void main(String[] args) {
        Son s = new Son();
        {
            try {
                s.ex1();
            } catch (fatherAgeException e) {
                System.out.println(e);
            }
            try {
                s.ex2();
            } catch (sonAgeException e) {
                System.out.println(e);
            }
        }
    }
}
