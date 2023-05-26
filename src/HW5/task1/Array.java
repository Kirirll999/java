package HW5.task1;
public class Array{
        /*
         * Найти в массиве самую длинную последовательность,
         *  состоящую из одинаковых элементов.
         * Вывести на экран количество элементов самой длиной
         *  последовательности и номер элемента, который является ее началом.
         */
        public static void main(String[] args) {
                int array[] = {2, 2, 0, 0, 0, 5, 1, 0, 0, 0, 0};
                int startLength = 0;
                int maxLength = 0;
                int current = 1;
                int startMaxLength = 0;
                for (int i = 1; i < array.length; i++) {
                        if (array[i] == array[i - 1]) {
                                current++;
                        } else {
                                current = 1;
                                startLength = i;
                        }
                        if (current > maxLength) {
                                maxLength = current;
                                startMaxLength = startLength;
                        }
                }

                System.out.println("символов в максимальной последовательности: " + maxLength);
                System.out.println("номер элемента начала последовательности: " + startLength);
        }
}