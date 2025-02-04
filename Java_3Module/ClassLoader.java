package Java_3Module;

public class ClassLoader {
/*          =============================== ClassLoader ================================
    ClassLoader в Java — это часть JRE, которая динамически загружает Java классы в JVM.
Он преобразует байт-код класса, хранящийся в .class файлах или других источниках, в объекты Class,
которые могут быть использованы во время выполнения программы.

        Этапы загрузки классов включают:

    1. Загрузка (Loading):
На этом этапе ClassLoader загружает байт-код класса.
Это может быть выполнено одним из встроенных загрузчиков классов или пользовательским загрузчиком классов.

    2. Связывание (Linking):
- Проверка (Verification):• JVM проверяет, корректен ли загруженный байт-код, чтобы гарантировать безопасность и стабильность.
- Подготовка (Preparation): На этом шаге JVM выделяет память для статических полей класса и инициализирует их стандартными значениями.
- Разрешение (Resolution):• Заменяет символические ссылки на прямые ссылки.

    3. Инициализация (Initialization):
На этом этапе инициализируются статические переменные и статические блоки инициализации класса в порядке их объявления в классе.

        Типы загрузчиков

    В Java существует несколько типов ClassLoader:

    1. Bootstrap ClassLoader:• Это самый верхний загрузчик классов, загружающий стандартные классы JDK из
 <JAVA_HOME>/jre/lib и не является объектом Java. Он написан на нативном коде.

    2. Extension ClassLoader:• Загружает классы из каталогов расширений Java, обычно из
<JAVA_HOME>/jre/lib/ext или любых других каталогов, указанных в системной переменной java.ext.dirs.

    3. System/Application ClassLoader:• Это загрузчик классов, который загружает классы из путей классов приложения,
указанных при запуске приложения или через переменную среды CLASSPATH.
Это классы, которые вы разрабатываете и/или добавляете в своё приложение.

    4. User-defined ClassLoaders:• Пользователи могут создавать свои собственные загрузчики классов,
наследуя от класса ClassLoader.
    Это позволяет загружать классы динамически во время выполнения из нестандартных источников, например,
из сети, архивных файлов и т.д.

    Каждый загрузчик классов, кроме Bootstrap, имеет родительский загрузчик классов.
Это создаёт иерархию загрузчиков классов, которая используется для делегирования загрузки классов.
Когда классу требуется загрузить другой класс, он сначала делегирует запрос своему родителю.
Если родительский загрузчик не может найти класс, запрос возвращается обратно,
и текущий загрузчик пытается загрузить класс самостоятельно. Это называется делегированием загрузки классов.
*/
}