package lr4;

import java.util.Scanner;

public class Fourth9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char[] alphabet = new char[]{'a','б','в','г','д','е','ё','ж','з','и','й','к','л','м','н','о','п','р','с','т','у','ф','х','ц','ч','ш','щ','ъ','ы','ь','э','ю','я'};
        System.out.println("Введите текст для шифрования: ");
        String text = in.nextLine();
        System.out.println("Введите ключ: ");
        int key = in.nextInt();


        char[] chars = text.toCharArray();
        int[] codes = new int[text.length()];
        char[] locked = new char[chars.length];
        //key = key % 33;

        for (int i  = 0; i < chars.length; i++){
            switch (chars[i]){
                case 'а':
                case 'А': {
                    codes[i] = (0 + key) % 33;
                    break;
                }
                case 'б':
                case 'Б': {
                    codes[i] = (1 + key) % 33;
                    break;
                }
                case 'в':
                case 'В': {
                    codes[i] = (2 + key) % 33;
                    break;
                }
                case 'г':
                case 'Г': {
                    codes[i] = (3 + key) % 33;
                    break;
                }
                case 'д':
                case 'Д': {
                    codes[i] = (4 + key) % 33;
                    break;
                }
                case 'е':
                case 'Е': {
                    codes[i] = (5 + key) % 33;
                    break;
                }
                case 'ё':
                case 'Ё': {
                    codes[i] = (6 + key) % 33;
                    break;
                }
                case 'ж':
                case 'Ж': {
                    codes[i] = (7 + key) % 33;
                    break;
                }
                case 'з':
                case 'З': {
                    codes[i] = (8 + key) % 33;
                    break;
                }
                case 'и':
                case 'И': {
                    codes[i] = (9 + key) % 33;
                    break;
                }
                case 'й':
                case 'Й': {
                    codes[i] = (10 + key) % 33;
                    break;
                }
                case 'к':
                case 'К': {
                    codes[i] = (11 + key) % 33;
                    break;
                }
                case 'л':
                case 'Л': {
                    codes[i] = (12 + key) % 33;
                    break;
                }
                case 'м':
                case 'М': {
                    codes[i] = (13 + key) % 33;
                    break;
                }
                case 'н':
                case 'Н': {
                    codes[i] = (14 + key) % 33;
                    break;
                }
                case 'о':
                case 'О': {
                    codes[i] = (15 + key) % 33;
                    break;
                }
                case 'п':
                case 'П': {
                    codes[i] = (16 + key) % 33;
                    break;
                }
                case 'р':
                case 'Р': {
                    codes[i] = (17 + key) % 33;
                    break;
                }
                case 'с':
                case 'С': {
                    codes[i] = (18 + key) % 33;
                    break;
                }
                case 'т':
                case 'Т': {
                    codes[i] = (19 + key) % 33;
                    break;
                }
                case 'у':
                case 'У': {
                    codes[i] = (20 + key) % 33;
                    break;
                }
                case 'ф':
                case 'Ф': {
                    codes[i] = (21 + key) % 33;
                    break;
                }
                case 'х':
                case 'Х': {
                    codes[i] = (22 + key) % 33;
                    break;
                }
                case 'ц':
                case 'Ц': {
                    codes[i] = (23 + key) % 33;
                    break;
                }
                case 'ч':
                case 'Ч': {
                    codes[i] = (24 + key) % 33;
                    break;
                }
                case 'ш':
                case 'Ш': {
                    codes[i] = (25 + key) % 33;
                    break;
                }
                case 'щ':
                case 'Щ': {
                    codes[i] = (26 + key) % 33;
                    break;
                }
                case 'ъ':
                case 'Ъ': {
                    codes[i] = (27 + key) % 33;
                    break;
                }
                case 'ы':
                case 'Ы': {
                    codes[i] = (28 + key) % 33;
                    break;
                }
                case 'ь':
                case 'Ь': {
                    codes[i] = (29 + key) % 33;
                    break;
                }
                case 'э':
                case 'Э': {
                    codes[i] = (30 + key) % 33;
                    break;
                }
                case 'ю':
                case 'Ю': {
                    codes[i] = (31 + key) % 33;
                    break;
                }
                case 'я':
                case 'Я': {
                    codes[i] = (32 + key) % 33;
                    break;
                }
                default: codes[i] = -1;
            }
        }

        String updated = new String();
        updated = "";
        for (int i = 0; i < locked.length; i++){
            if (codes[i] == -1){
                locked[i] = chars[i];
            } else {
                locked[i] = alphabet[codes[i]];
            }
            updated = updated + locked[i];
        }
        System.out.println("Текст после преобразования: " + updated);
        boolean inputed = false;

        while (!inputed) {
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
            switch (chars[i]){
                case 'а': {
                    decodes[i] = (0 - key) % 33;
                    break;
                }
                case 'б': {
                    decodes[i] = (1 - key) % 33;
                    break;
                }
                case 'в': {
                    decodes[i] = (2 - key) % 33;
                    break;
                }
                case 'г': {
                    decodes[i] = (3 - key) % 33;
                    break;
                }
                case 'д': {
                    decodes[i] = (4 - key) % 33;
                    break;
                }
                case 'е': {
                    decodes[i] = (5 - key) % 33;
                    break;
                }
                case 'ё': {
                    decodes[i] = (6 - key) % 33;
                    break;
                }
                case 'ж': {
                    decodes[i] = (7 - key) % 33;
                    break;
                }
                case 'з': {
                    decodes[i] = (8 - key) % 33;
                    break;
                }
                case 'и': {
                    decodes[i] = (9 - key) % 33;
                    break;
                }
                case 'й': {
                    decodes[i] = (10 - key) % 33;
                    break;
                }
                case 'к': {
                    decodes[i] = (11 - key) % 33;
                    break;
                }
                case 'л': {
                    decodes[i] = (12 - key) % 33;
                    break;
                }
                case 'м': {
                    decodes[i] = (13 - key) % 33;
                    break;
                }
                case 'н': {
                    decodes[i] = (14 - key) % 33;
                    break;
                }
                case 'о': {
                    decodes[i] = (15 - key) % 33;
                    break;
                }
                case 'п': {
                    decodes[i] = (16 - key) % 33;
                    break;
                }
                case 'р': {
                    decodes[i] = (17 - key) % 33;
                    break;
                }
                case 'с': {
                    decodes[i] = (18 - key) % 33;
                    break;
                }
                case 'т': {
                    decodes[i] = (19 - key) % 33;
                    break;
                }
                case 'у': {
                    decodes[i] = (20 - key) % 33;
                    break;
                }
                case 'ф': {
                    decodes[i] = (21 - key) % 33;
                    break;
                }
                case 'х': {
                    decodes[i] = (22 - key) % 33;
                    break;
                }
                case 'ц': {
                    decodes[i] = (23 - key) % 33;
                    break;
                }
                case 'ч': {
                    decodes[i] = (24 - key) % 33;
                    break;
                }
                case 'ш': {
                    decodes[i] = (25 - key) % 33;
                    break;
                }
                case 'щ': {
                    decodes[i] = (26 - key) % 33;
                    break;
                }
                case 'ъ': {
                    decodes[i] = (27 - key) % 33;
                    break;
                }
                case 'ы': {
                    decodes[i] = (28 - key) % 33;
                    break;
                }
                case 'ь': {
                    decodes[i] = (29 - key) % 33;
                    break;
                }
                case 'э': {
                    decodes[i] = (30 - key) % 33;
                    break;
                }
                case 'ю': {
                    decodes[i] = (31 - key) % 33;
                    break;
                }
                case 'я': {
                    decodes[i] = (32 - key) % 33;
                    break;
                }
                default: decodes[i] = -1;
            }
            if (decodes[i] == -1){
                locked[i] = chars[i];
            } else {
                locked[i] = alphabet[decodes[i]];
            }
            updated = updated + locked[i];
        }
        System.out.println("Текст после обратного преобразования: " + updated);
    }
}
