package lr4;

import java.util.Scanner;

public class Fourth8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите текст для шифрования: ");
        String text = in.nextLine();
        System.out.println("Введите ключ: ");
        int key = in.nextInt();

        char[] chars = text.toCharArray();
        int[] codes = new int[text.length()];
        char[] locked = new char[chars.length];
        String updated = new String();

        for (int i = 0; i < chars.length; i++){
            codes[i] = chars[i] + key;
            locked[i] = (char) codes[i];
            updated = updated + locked[i];
        }

        System.out.println("Текст после преобразования: " + updated);

        boolean inputed = false;

        while (!inputed){
            System.out.println("Выполнить обратное преобразование? (y/n)");
            String yesOrNo = in.next();
            if (yesOrNo.equals("y")) {
                inputed = true;
                continue;
            } else if (yesOrNo.equals("n")) {
                System.out.println("До свидания!");
                return;
            } else {
                System.out.println("Введите корректный ответ.");
            }

        }
        chars = updated.toCharArray();
        updated = "";
        int[] decodes = new int[text.length()];
        for (int i = 0; i < chars.length; i++){
            decodes[i] = chars[i] - key;
            locked[i] = (char) decodes[i];
            updated = updated + locked[i];
        }
        System.out.println("Текст после обратного преобразования: " + updated);
    }
}
