class HighArrayApp
{
    public static void main(String[] args) {
        int maxSize = 100; // Размер массива
        HighArray arr; // Ссылка на массив
        arr = new HighArray(maxSize); // Создание массива
        arr.insert(77); // Вставка 10 элементов
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);
        arr.display(); // Вывод элементов
        int searchKey = 35; // Поиск элемента
        if (arr.find(searchKey))
            System.out.println("Found " + searchKey);
        else
            System.out.println("Can't find " + searchKey);


        boolean useAltDelete = true;

        if (useAltDelete) {
            arr.altDelete(55);
            arr.altDelete(99);
            arr.altDelete(00); // Удаление трех элементов
        }
        else {
            arr.delete(00); // Удаление трех элементов
            arr.delete(55);
            arr.delete(99);
        }

        long maxKey = arr.getMax(); // max key
        if (maxKey != -1)
            System.out.println("Maximum key is '" + maxKey + "'");
        else
            System.out.println("Maximum key is '" + maxKey + "'" + "or arr is empty");

        arr.display(); // Повторный вывод
    }
}