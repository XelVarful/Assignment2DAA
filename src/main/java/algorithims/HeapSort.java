package algorithims;

public class HeapSort {

    // Основной метод сортировки (in-place)
    public static void heapSort(int[] arr) {
        int n = arr.length;

        // 1. Строим кучу (bottom-up heapify)
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // 2. Извлекаем элементы из кучи один за другим
        for (int i = n - 1; i > 0; i--) {
            // Перемещаем текущий корень в конец
            swap(arr, 0, i);

            // Вызываем heapify для уменьшенной кучи
            heapify(arr, i, 0);
        }
    }

    // Функция для восстановления свойства кучи
    private static void heapify(int[] arr, int n, int i) {
        int largest = i;      // Корень
        int left = 2 * i + 1; // Левый ребёнок
        int right = 2 * i + 2;// Правый ребёнок

        // Если левый ребёнок больше корня
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // Если правый ребёнок больше текущего наибольшего
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // Если наибольший не корень — меняем и продолжаем heapify
        if (largest != i) {
            swap(arr, i, largest);
            heapify(arr, n, largest);
        }
    }

    // Простая функция для обмена элементов
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Тестовый запуск (CLI)
    public static void main(String[] args) {
        int[] data = { 42, 12, 56, 23, 8, 99, 4 };

        System.out.println("📥 Before sorting:");
        printArray(data);

        heapSort(data);

        System.out.println("📤 After sorting:");
        printArray(data);
    }

    // Метод для вывода масссива
    private static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
