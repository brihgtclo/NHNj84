package test;

import org.junit.jupiter.api.function.Executable;

public class Library {
    private String[] list;
    private int count;

    public Library(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("도서관의 크기는 1보다 작을 수 없습니다");
        }
        list = new String[size];
        count = 0;

        for (int i = 0; i < size; i++) {
            list[i] = "";
        }
    }


    public void add(String book) {
        if (count == list.length) throw new IllegalArgumentException("책장이 가득");
        for (int i = 0; i < list.length; i++) {
            if (list[i] == book) throw new IllegalArgumentException("[" + book + "]은 이미 존재하는 책입니다");
        }

        for (int i = 0; i < list.length; i++) {
            if (list[i] == "") {
                list[i] = book;
                count++;
                System.out.println("[" + book + "]" + (i + 1) + "번째에 추가되었습니다");
                return;
            }
        }
        System.out.println("자리가 없습니다");
    }


    public Executable delete(String book) {
        if (count == 0) {
            throw new IllegalAccessError("첵장이 비었습니다");
        }
        for (int i = 0; i < list.length; i++) {
            if (list[i] == book) {
                for (int j = i; j < list.length - 1; j++) {
                    list[j] = list[j + 1];
                }
                list[list.length - 1] = "";
                count--;
                return null;
            }
        }
        System.out.println("[" + book + "]과" + "일치하는 책이 없습니다");
        return null;
    }

    public void find(String book) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == book) {
                System.out.println("[" + book + "]이" + (i + 1) + "번째에 있습니다");
                return;
            }
        }
        System.out.println("[" + book + "]" + "책이 존재하지않습니다");
    }

    public void findAll() {
        System.out.println("==============================");
        for (int i = 0; i < list.length; i++) {
            System.out.println((i + 1) + "번째 : " + list[i] + " ");
        }
        System.out.println("==============================");
        System.out.println();
    }

    public int getLibrarySize() {
        return list.length;
    }

    public int getCount() {
        return count;
    }

}
