package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
            String[] names = {"Gnut", "Bop","Army","Mochi","Layor"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String input_name = scanner.nextLine();

        boolean isExist = false;
        for (int i = 0; i < names.length; i++) {
                if (names[i].equals(input_name)) {
                    System.out.println(input_name + " ở vị trí thứ " + i);
                    isExist = true;
                    break;
                }
        }
        if (!isExist){
            System.out.println("Không tìm thấy " + input_name);
        }
    }
}
