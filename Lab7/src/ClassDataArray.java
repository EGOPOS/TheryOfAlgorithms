class ClassDataArray
{
    private Person[] a; // Ссылка на массив
    private int nElems; // Количество элементов данных
    public ClassDataArray(int max) // Конструктор
    {
        a = new Person[max]; // Создание массива
        nElems = 0; // Пока нет ни одного элемента
    }

    static private Person emptyPerson = new Person("", "", 0);


    public Person find(String searchName)
    { // Поиск заданного значения
        int lowerBound = 0;
        int upperBound = nElems-1;
        int curIn;
        while(true)
        {
            curIn = (lowerBound + upperBound ) / 2;
            if(a[curIn].getLast().equals(searchName))
                return a[curIn]; // Элемент найден
            else if(lowerBound > upperBound)
                return emptyPerson; // a[nElems]; // Элемент не найден
            else // Деление диапазона
            {
                if(a[curIn].getLast().compareTo(searchName) < 0)
                    lowerBound = curIn + 1; // В верхней половине
                else
                    upperBound = curIn - 1; // В нижней половине
            }
        }
    } // end find()


    // Включение записи в массив
    public void insert(String last, String first, int age)
    {
        int j;
        for(j=0; j<nElems; j++) // Определение позиции вставки
            if(a[j].getLast().compareTo(last) > 0) // (линейный поиск)
                break;
        for(int k=nElems; k>j; k--) // Перемещение последующих элементов
            a[k] = a[k-1];
        a[j] = new Person(last, first, age); // Вставка
        nElems++; // Увеличение размера
    }


    public boolean delete(String searchName)
    { // Удаление из массива
        int j;
        for(j=0; j<nElems; j++) // Поиск удаляемого элемента
            if( a[j].getLast().equals(searchName) )
                break;
        if(j==nElems) // Найти не удалось
            return false;
        else // Значение найдено
        {
            for(int k=j; k<nElems; k++) // Сдвиг последующих элементов
                a[k] = a[k+1];
            nElems--; // Уменьшение размера
            return true;
        }
    }


    public void displayA() // Вывод содержимого массива
    {
        for(int j=0; j<nElems; j++) // Для каждого элемента
            a[j].displayPerson(); // Вывод
    }
} // Конец класса ClassDataArray