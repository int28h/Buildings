/**
 * Реализуйте клиентскую часть приложения в новом классе buildings.net.client.BinaryClient, 
 * содержащем метод main().
 * Входными параметрами программы (аргументами командной строки) являются имена трех файлов. 
 * Первый файл существует на момент запуска программы и содержит в текстовом виде информацию 
 * о зданиях (например, одна строка – одно здание). Второй файл существует на момент 
 * запуска программы и содержит в текстовом виде информацию о видах зданий (например, одна строка – 
 * одно слово, определяющее вид здания). Количество записей в первом и втором файле можно считать 
 * соответствующим друг другу, но неизвестным заранее (т.е. оно даже не записано в первой строке 
 * файлов). Файлы можно считать корректными. Третий файл должен быть создан программой в ходе работы
 * и должен хранить в текстовом виде оценки стоимости зданий (например, одна строчка – одна оценка
 * стоимости).
 * Программа должна установить через сокеты соединение с сервером, после чего считывать из первого 
 * и второго файла данные о здании, передавать их в бинарной форме серверу и получать от него 
 * результат оценки стоимости здания, и так по очереди для всех исходных данных.
 * Для обеспечения работы приложения потребуется создание протокола взаимодействия клиентской и 
 * серверной частей: порядка передачи данных, определения условия завершения передачи данных.
 * Считывание данных из первого файла, а также запись данных в поток сокета рекомендуется 
 * реализовать с помощью средств класса Buildings. Также рекомендуется реализовать вывод информации
 * о текущей операции в консоль (например, с помощью ранее реализованных методов toString() зданий).
 */
package buildings.net.client;

public class BinaryClient {
	public static void main (String[] args) {
		
	}
}
