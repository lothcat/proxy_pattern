package proxy;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Enter what level of magic doer you are
        System.out.println("Hello, good magic doer, please enter your magic power level id: ");
        int id = scanner.nextInt();
        Subject subject = new ProxyMagician(new RealSubject(id));
        subject.getPermission();
    }
}
