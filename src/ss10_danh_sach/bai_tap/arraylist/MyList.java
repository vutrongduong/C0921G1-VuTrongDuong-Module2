package ss10_danh_sach.bai_tap.arraylist;


import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        if (capacity > 0) {
            System.out.println("Khởi tạo thành công với kích thước là: " + capacity);
            elements = new Object[capacity];
        } else {
            System.out.println("Khởi tạo không thành công");
        }
    }

    public void add( E element,int index) {
        if (index > elements.length) {
            System.out.println("Lỗi index");
        } else if (index + 1 == elements.length) {
            ensureCapacity(1);
        }
        if (elements[index] == null) {
            size++;
            elements[index] = element;
        } else {
            if (size == elements.length) {
                ensureCapacity(1);
            }
            System.arraycopy(elements, index, elements, index + 1, size - index);
            elements[index] = element;
            size++;
        }
    }

    public E remove(int index) {
        if (index < 0 || index > elements.length) {
            System.out.println("Lỗi index");
        }
        E element = (E) elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return element;
    }

    public int size() {
        return size;
    }

    public MyList<E> clone() {
        MyList<E> newMyList = new MyList<>();
        newMyList.elements = Arrays.copyOf(elements, size);
        newMyList.size = size;
        return  newMyList;
    }

    public boolean contains(E e) {
        return this.indexOf(e) >= 0;
    }

    public int indexOf(E o) {
        if (o == null) {
            for (int i = 0; i < size; i++)
                if (elements[i] == null)
                    return i;
        } else {
            for (int i = 0; i < size; i++)
                if (o.equals(elements[i]))
                    return i;
        }
        return -1;
    }

    public boolean add(E e) {
        if (size == elements.length) {
            ensureCapacity(1);
            elements[size] = e;
        }
        elements[size] = e;
        size++;
        return true;
    }

    public void ensureCapacity(int minCapacity) {
        if (minCapacity >= 0) {
            int newSize = elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);
            System.out.println("Khởi tạo thành công mảng đối tượng với kích thước mới là: " + elements.length);
        } else {
            System.out.println("Không khởi tạo thành công");
        }
    }

    public E get(int i) {
        return (E) elements[i];
    }

    public void clear() {
        for (int i = 0; i < size; i++)
            elements[i] = null;
        size = 0;
    }
}
