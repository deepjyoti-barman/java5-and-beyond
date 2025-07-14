# Important Features: Java 5 and Beyond

## Table of Contents

- [Java 5 (2004)](#java-5-2004)
  - [Enhanced for Loop](#enhanced-for-loop)
  - [Generics](#generics)
  - [Enums](#enums)
  - [Auto-boxing](#auto-boxing)
  - [Annotations](#annotations)
  - [Varargs (Variable Arguments)](#varargs-variable-arguments)
  - [Static Imports](#static-imports)
  - [Formatted I/O](#formatted-io)
  - [Concurrent Utilities](#concurrent-utilities)
  - [StringBuilder Class](#stringbuilder-class)

- [Java 6 (2006)](#java-6-2006)
  - [Console Class](#console-class)
  - [NavigableMap and NavigableSet](#navigablemap-and-navigableset)
  - [Deque Interface](#deque-interface)

- [Java 7 (2011)](#java-7-2011)
  - [Try with Resources](#try-with-resources)
  - [Strings in switch](#strings-in-switch)
  - [Diamond Operator](#diamond-operator)
  - [Multi-catch Exception Handling](#multi-catch-exception-handling)
  - [NIO.2 (New I/O)](#nio2-new-io)
  - [Binary Literals](#binary-literals)
  - [Underscore in Numeric Literals](#underscore-in-numeric-literals)
  - [JDBC 4.1 Enhancements](#jdbc-41-enhancements)
  - [Locale Enhancements](#locale-enhancements)

- [Java 8 (2014) - LTS](#java-8-2014---lts)
  - [Lambda Expressions](#lambda-expressions)
  - [Stream API](#stream-api)
  - [Functional Programming](#functional-programming)
  - [Date-Time API](#date-time-api)
  - [Optional Class](#optional-class)
  - [Method References](#method-references)
  - [Default Methods in Interfaces](#default-methods-in-interfaces)
  - [Functional Interfaces](#functional-interfaces)
  - [Parallel Streams](#parallel-streams)
  - [CompletableFuture](#completablefuture)
  - [Base64 API](#base64-api)

- [Java 9 (2017)](#java-9-2017)
  - [Module System (Project Jigsaw)](#module-system-project-jigsaw)
  - [JShell (REPL)](#jshell-repl)
  - [Factory Methods for Collections](#factory-methods-for-collections)
  - [Improved Stream API](#improved-stream-api)
  - [Private Methods in Interfaces](#private-methods-in-interfaces)
  - [Optional Improvements](#optional-improvements)
  - [Try-with-resources Improvements](#try-with-resources-improvements)
  - [Improved @Deprecated Annotation](#improved-deprecated-annotation)
  - [Diamond Operator for Anonymous Classes](#diamond-operator-for-anonymous-classes)

- [Java 10 (2018)](#java-10-2018)
  - [Local Variable Type Inference (var)](#local-variable-type-inference-var)
  - [Optional.orElseThrow()](#optionalorelsethrow)
  - [Application Class-Data Sharing (CDS)](#application-class-data-sharing-cds)
  - [Container Awareness](#container-awareness)
  - [Unmodifiable Collections](#unmodifiable-collections)

- [Java 11 (2018) - LTS](#java-11-2018---lts)
  - [String Methods](#string-methods)
  - [Files Methods](#files-methods)
  - [Path.of() Method](#pathof-method)
  - [HTTP Client (Standardized)](#http-client-standardized)
  - [var in Lambda Parameters](#var-in-lambda-parameters)
  - [Optional Enhancements](#optional-enhancements)
  - [Launch Single-File Source Programs](#launch-single-file-source-programs)
  - [Predicate.not()](#predicatenot)
  - [Collection.toArray(IntFunction)](#collectiontoarrayintfunction)
  - [Pattern.asMatchPredicate()](#patternasmatchpredicate)
  - [TimeUnit.convert() Overloads](#timeunitconvert-overloads)
  - [CharSequence.compare()](#charsequencecompare)
  - [Unicode 10 Support](#unicode-10-support)
  - [Nest-Based Access Control](#nest-based-access-control)

- [Java 12 (2019)](#java-12-2019)
  - [Compact Number Formatting](#compact-number-formatting)
  - [Teeing Collectors](#teeing-collectors)
  - [String Methods](#string-methods-1)
  - [Files.mismatch()](#filesmismatch)

- [Java 13 (2019)](#java-13-2019)
  - [String Methods Enhancement](#string-methods-enhancement)
  - [FileSystems.newFileSystem()](#filesystemsnewfilesystem)
  - [Socket API Reimplementation](#socket-api-reimplementation)

- [Java 14 (2020)](#java-14-2020)
  - [Switch Expressions (Standard)](#switch-expressions-standard)
  - [Helpful NullPointerExceptions](#helpful-nullpointerexceptions)

- [Java 15 (2020)](#java-15-2020)
  - [Text Blocks (Standard)](#text-blocks-standard)
  - [Hidden Classes](#hidden-classes)

- [Java 16 (2021)](#java-16-2021)
  - [Records (Standard)](#records-standard)
  - [Pattern Matching for instanceof (Standard)](#pattern-matching-for-instanceof-standard)

- [Java 17 (2021) - LTS](#java-17-2021---lts)
  - [Sealed Classes (Standard)](#sealed-classes-standard)
  - [Enhanced Pseudo-Random Number Generators](#enhanced-pseudo-random-number-generators)

- [Java 18 (2022)](#java-18-2022)
  - [UTF-8 by Default](#utf-8-by-default)
  - [Simple Web Server](#simple-web-server)

- [Java 19 (2022)](#java-19-2022)
  - [No Major Standard Features](#no-major-standard-features)

- [Java 20 (2023)](#java-20-2023)
  - [No Major Standard Features](#no-major-standard-features-1)

- [Java 21 (2023) - LTS](#java-21-2023---lts)
  - [Virtual Threads](#virtual-threads)
  - [Sequenced Collections](#sequenced-collections)
  - [Pattern Matching for switch (Standard)](#pattern-matching-for-switch-standard)
  - [Record Patterns](#record-patterns)

- [Java 22 (2024)](#java-22-2024)
  - [Unnamed Variables & Patterns](#unnamed-variables--patterns)
  - [Statements Before super()](#statements-before-super)
  - [Foreign Function & Memory API (Standard)](#foreign-function--memory-api-standard)
  - [Launch Multi-File Source Code Programs](#launch-multi-file-source-code-programs)

- [Java 23 (2024)](#java-23-2024)
  - [ZGC Generational Mode by Default](#zgc-generational-mode-by-default)
  - [No Other Major Standard Features](#no-other-major-standard-features)

- [Java 24 (2025)](#java-24-2025)
  - [Most Features Still in Preview](#most-features-still-in-preview)

## Java 5 (2004)

### Enhanced for Loop

- Simplifies iteration over collection and arrays.

```java
for (int num : numbers) {
    // Do something...
}
```

### Generics

- Enables type safety in collections and methods.
- Helps us to get rid of unnecessary explicit type casting issues.

```java

// Example 1
public class Printer<T> {

    private T number;

    public void setNumber(T number) {
        this.number = number;
    }

    public T getNumber() {
        return this.number;
    }
}

// Example 2
public class HashMap<K,V> extends AbstractMap<K, V>
```

### Enums

- Provides a type-safe way to define constants.

```java
enum Seasons {
    SUMMER, MONSOON, AUTUMN, WINTER, SPRING
}
```

### Auto-boxing

- Automatically converts primitive types into wrapper classes.

```java
Integer score = 101;
int intScore = score;
```

### Annotations

- Provides metadata about code elements.

```java
@Override
public String toString() {
    return "MyClass";
}

@Deprecated
public void oldMethod() {
    // Legacy code
}
```

### Varargs (Variable Arguments)

- Allows methods to accept variable number of arguments.

```java
public void printNumbers(int... numbers) {
    for (int num : numbers) {
        System.out.println(num);
    }
}

// Usage
printNumbers(1, 2, 3, 4, 5);
```

### Static Imports

- Allows importing static members directly.

```java
import static java.lang.Math.*;

// Instead of Math.sqrt(16)
double result = sqrt(16);
double value = PI * 2;
```

### Formatted I/O

- Provides printf-style formatted output.

```java
System.out.printf("Name: %s, Age: %d, Score: %.2f%n", 
                  "John", 25, 95.67);

String formatted = String.format("Value: %d", 42);
```

### Concurrent Utilities

- New concurrent programming utilities in java.util.concurrent.

```java
ExecutorService executor = Executors.newFixedThreadPool(5);
executor.submit(() -> System.out.println("Task executed"));

CountDownLatch latch = new CountDownLatch(3);
// Wait for 3 threads to complete
latch.await();
```

### StringBuilder Class

- High-performance string manipulation for better performance.

```java
StringBuilder sb = new StringBuilder();
sb.append("Hello").append(" ").append("World");
String result = sb.toString();  // "Hello World"

// More efficient than string concatenation
StringBuilder buffer = new StringBuilder();
for (int i = 0; i < 1000; i++) {
    buffer.append("Item ").append(i).append("\n");
}
String output = buffer.toString();
```

## Java 6 (2006)

### Console Class

- Better console I/O with password masking.

```java
Console console = System.console();
if (console != null) {
    String username = console.readLine("Username: ");
    char[] password = console.readPassword("Password: ");
}
```

### NavigableMap and NavigableSet

- Enhanced collection interfaces with navigation methods.

```java
NavigableMap<String, Integer> map = new TreeMap<>();
map.put("apple", 1);
map.put("banana", 2);

String lower = map.lowerKey("banana"); // "apple"
String higher = map.higherKey("apple"); // "banana"
```

### Deque Interface

- Double-ended queue for efficient insertion/removal at both ends.

```java
Deque<String> deque = new ArrayDeque<>();
deque.addFirst("first");
deque.addLast("last");
String first = deque.removeFirst();
String last = deque.removeLast();
```

## Java 7 (2011)

### Try with Resources

- Automatic resource management in try-catch blocks.

```java
try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {

} catch (Exception e) {
    e.printStackTrace();
}
```

### Strings in switch

- Allows using String values in switch statements.

```java
switch(day) {
    case "Monday":
        // Do something...
    case "Friday":
        // Do something...
    case "Sunday":
        // Do something...
    default:
        // Do something...
}
```

### Diamond Operator

- Type inference for generic instance creation.

```java
// Before Java 7
List<String> list = new ArrayList<String>();

// Java 7+
List<String> list = new ArrayList<>();
Map<String, Integer> map = new HashMap<>();
```

### Multi-catch Exception Handling

- Handle multiple exception types in a single catch block.

```java
try {
    // risky code
} catch (IOException | SQLException ex) {
    logger.log(ex);
}
```

### NIO.2 (New I/O)

- Enhanced file system operations and Path API.

```java
Path path = Paths.get("/tmp/example.txt");
List<String> lines = Files.readAllLines(path);
Files.write(path, "Hello World".getBytes());
Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
```

### Binary Literals

- Write binary numbers directly with `0b` prefix.

```java
int binary = 0b1010_1100;  // 172 in decimal
int flags = 0b0001_0010;   // 18 in decimal
byte mask = 0b1111_0000;   // 240 in decimal
```

### Underscore in Numeric Literals

- Improve readability of large numbers with underscores.

```java
int million = 1_000_000;
long creditCard = 1234_5678_9012_3456L;
double pi = 3.14_15_92_65_35;
float hex = 0xFF_EC_DE_5E;
```

### JDBC 4.1 Enhancements

- Automatic resource management for database connections.

```java
try (
    Connection conn = DriverManager.getConnection(url);
    PreparedStatement stmt = conn.prepareStatement(sql)
) {
    ResultSet rs = stmt.executeQuery();
    // Process results
} // Connection and statement automatically closed
```

### Locale Enhancements

- Better internationalization support with Locale.Builder.

```java
Locale locale = new Locale.Builder()
    .setLanguage("en")
    .setRegion("US")
    .setVariant("POSIX")
    .build();

// Language tags support
Locale german = Locale.forLanguageTag("de-DE");
```

## Java 8 (2014) - LTS

### Lambda Expressions

- Allows writing concise, functional-style code.

```java
public static Predicate<Course> createPredicate(int cutoff) {
    return course -> course.getReviewScore() > cutoff;
}
```

### Stream API

- Provides a powerful way to process collections.

```java
List<String> transformedNumbers = numbers.stream()
    .map(x -> x * x)            // Step 1: Square each number
    .map(x -> x + 10)           // Step 2: Add 10
    .map(x -> "value: " + x)    // Step 3: Convert
    .toList();                  // Step 4: Collect the result
```

### Functional Programming

- Introduces higher-order functions and immutability.

```java
courses.stream()
    .sorted((c1, c2) -> c1.length() - c2.length())
    .forEach(System.out::println);
```

### Date-Time API

- New comprehensive date and time API (java.time package).

```java
LocalDate today = LocalDate.now();
LocalDateTime now = LocalDateTime.now();
ZonedDateTime zonedDateTime = ZonedDateTime.now();
```

### Optional Class

- Helps avoid NullPointerException by wrapping potentially null values.

```java
Optional<String> optional = Optional.ofNullable(getString());
optional.ifPresent(System.out::println);
String result = optional.orElse("default");
```

### Method References

- Shorthand syntax for lambda expressions that call existing methods.

```java
// Instead of: x -> System.out.println(x)
list.forEach(System.out::println);

// Instead of: x -> x.length()
list.stream().map(String::length);
```

### Default Methods in Interfaces

- Allows interfaces to have method implementations.

```java
interface Vehicle {
    default void start() {
        System.out.println("Vehicle is starting");
    }
}
```

### Functional Interfaces

- Interfaces with exactly one abstract method, used with lambda expressions.

```java
@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}

Calculator add = (a, b) -> a + b;
```

### Parallel Streams

- Enables parallel processing of stream operations.

```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
numbers.parallelStream()
    .map(x -> x * x)
    .forEach(System.out::println);
```

### CompletableFuture

- Provides asynchronous programming capabilities.

```java
CompletableFuture<String> future = CompletableFuture
    .supplyAsync(() -> "Hello")
    .thenApply(s -> s + " World");
```

### Base64 API

- Built-in support for Base64 encoding and decoding.

```java
// Basic encoding/decoding
String original = "Hello World";
String encoded = Base64.getEncoder().encodeToString(original.getBytes());
byte[] decoded = Base64.getDecoder().decode(encoded);
String result = new String(decoded);

// URL-safe encoding
String urlEncoded = Base64.getUrlEncoder().encodeToString(original.getBytes());
byte[] urlDecoded = Base64.getUrlDecoder().decode(urlEncoded);

// MIME encoding (for email)
String mimeEncoded = Base64.getMimeEncoder().encodeToString(original.getBytes());
```

## Java 9 (2017)

### Module System (Project Jigsaw)

- Modular programming with explicit dependencies and encapsulation.

```java
// module-info.java
module com.example.myapp {
    requires java.base;
    requires java.logging;
    exports com.example.myapp.api;
}
```

### JShell (REPL)

- Interactive shell for experimenting with Java code.

```java
// Command line
jshell> int x = 5
x ==> 5

jshell> System.out.println("Hello " + x)
Hello 5
```

### Factory Methods for Collections

- Convenient methods to create immutable collections.

```java
List<String> list = List.of("apple", "banana", "cherry");
Set<Integer> set = Set.of(1, 2, 3, 4, 5);
Map<String, Integer> map = Map.of("one", 1, "two", 2);
```

### Improved Stream API

- New methods for better stream processing.

```java
Stream.of(1, 2, 3, 4, 5, 6)
    .takeWhile(x -> x < 4)    // [1, 2, 3]
    .forEach(System.out::println);

Stream.of(1, 2, 3, 4, 5)
    .dropWhile(x -> x < 3)    // [3, 4, 5]
    .forEach(System.out::println);
```

### Private Methods in Interfaces

- Allow private helper methods in interfaces.

```java
interface Calculator {
    default int addAndMultiply(int a, int b, int multiplier) {
        return multiply(add(a, b), multiplier);
    }
    
    private int add(int a, int b) {
        return a + b;
    }
    
    private int multiply(int a, int b) {
        return a * b;
    }
}
```

### Optional Improvements

- New methods for better Optional handling.

```java
Optional<String> optional = Optional.of("Hello");

optional.ifPresentOrElse(
    System.out::println,
    () -> System.out.println("Empty")
);

String result = optional.or(() -> Optional.of("Default")).get();
```

### Try-with-resources Improvements

- Use effectively final variables in try-with-resources.

```java
FileInputStream fis = new FileInputStream("file.txt");
try (fis) {  // No need to declare new variable
    // Use fis
}
```

### Improved @Deprecated Annotation

- Enhanced deprecation with more information about removal.

```java
@Deprecated(since="9", forRemoval=true)
public void oldMethod() {
    // Will be removed in future version
}

@Deprecated(since="1.5", forRemoval=false)
public void legacyMethod() {
    // Deprecated but will remain
}
```

### Diamond Operator for Anonymous Classes

- Use diamond operator with anonymous inner classes.

```java
List<String> list = new ArrayList<>() {
    {
        add("item1");
        add("item2");
    }
};

Map<String, Integer> map = new HashMap<>() {
    {
        put("one", 1);
        put("two", 2);
    }
};
```

## Java 10 (2018)

### Local Variable Type Inference (var)

- Use `var` keyword for local variable type inference.

```java
var list = List.of("apple", "banana", "cherry");
var map = Map.of("one", 1, "two", 2);
var stream = list.stream().filter(s -> s.startsWith("a"));

// Works with complex types
var result = someMethod().getSomething().process();
```

### Optional.orElseThrow()

- Cleaner way to throw exceptions from Optional.

```java
Optional<String> optional = Optional.empty();

// Before Java 10
String value = optional.orElseThrow(() -> new RuntimeException("Not found"));

// Java 10+
String value = optional.orElseThrow(); // Throws NoSuchElementException
```

### Application Class-Data Sharing (CDS)

- Improves startup performance by sharing class metadata.

```java
// Command line usage
java -Xshare:dump  // Create shared archive
java -Xshare:on MyApp  // Use shared archive
```

### Container Awareness

- Better Docker and container support for memory and CPU detection.

```java
// JVM automatically detects container limits
Runtime runtime = Runtime.getRuntime();
long maxMemory = runtime.maxMemory();  // Respects container limits
int processors = runtime.availableProcessors();  // Respects container limits
```

### Unmodifiable Collections

- New methods to create unmodifiable copies of collections.

```java
List<String> original = Arrays.asList("a", "b", "c");
List<String> copy = List.copyOf(original);  // Unmodifiable copy

Set<String> set = Set.copyOf(original);
Map<String, Integer> map = Map.copyOf(someMap);
```

## Java 11 (2018) - LTS

### String Methods

- New useful methods for string manipulation.

```java
String text = "  Hello World  ";
boolean empty = text.isBlank();           // false
String stripped = text.strip();          // "Hello World"
String leftStripped = text.stripLeading();   // "Hello World  "
String rightStripped = text.stripTrailing(); // "  Hello World"
String[] lines = "Line1\nLine2".lines().toArray(String[]::new);
String repeated = "Java".repeat(3);      // "JavaJavaJava"
```

### Files Methods

- Convenient methods for reading and writing files.

```java
// Read entire file as string
String content = Files.readString(Path.of("file.txt"));

// Write string to file
Files.writeString(Path.of("output.txt"), "Hello World");

// With encoding
String content = Files.readString(path, StandardCharsets.UTF_8);
```

### Path.of() Method

- Simpler way to create Path objects.

```java
Path path = Path.of("file.txt");        // Instead of Paths.get()
Path path = Path.of("dir", "subdir", "file.txt");
Path absolutePath = Path.of("/usr", "local", "bin");
```

### HTTP Client (Standardized)

- HTTP client moved from incubator to standard API.

```java
HttpClient client = HttpClient.newHttpClient();
HttpRequest request = HttpRequest.newBuilder()
    .uri(URI.create("https://api.example.com"))
    .header("Content-Type", "application/json")
    .POST(HttpRequest.BodyPublishers.ofString("{\"key\":\"value\"}"))
    .build();

HttpResponse<String> response = client.send(request, 
    HttpResponse.BodyHandlers.ofString());
```

### var in Lambda Parameters

- Use var keyword in lambda parameter declarations.

```java
// Allows annotations on lambda parameters
var list = List.of("apple", "banana", "cherry");
list.stream()
    .map((@Nonnull var x) -> x.toUpperCase())
    .forEach(System.out::println);
```

### Optional Enhancements

- New methods for better Optional handling.

```java
Optional<String> optional = Optional.empty();

// isEmpty() - cleaner way to check if Optional is empty
// Before Java 11
if (!optional.isPresent()) {
    // Handle empty case
}

// Java 11+
if (optional.isEmpty()) {
    // Handle empty case
}

// stream() - convert Optional to Stream
Optional<String> opt = Optional.of("value");
Stream<String> stream = opt.stream();  // Stream with one element
Optional<String> empty = Optional.empty();
Stream<String> emptyStream = empty.stream();  // Empty stream
```

### Launch Single-File Source Programs

- Run Java programs directly without compilation.

```java
// Command line
java HelloWorld.java  // No need to compile first
```

### Predicate.not()

- Static method for negating predicates.

```java
List<String> nonEmpty = strings.stream()
    .filter(Predicate.not(String::isEmpty))
    .collect(toList());

// More readable than
List<String> nonEmpty = strings.stream()
    .filter(s -> !s.isEmpty())
    .collect(toList());
```

### Collection.toArray(IntFunction)

- New overloaded method for better array conversion.

```java
List<String> list = List.of("apple", "banana", "cherry");
String[] array = list.toArray(String[]::new);

// More efficient than
String[] array = list.toArray(new String[list.size()]);
```

### Pattern.asMatchPredicate()

- Convert regex patterns to predicates.

```java
Pattern pattern = Pattern.compile("\\d+");
Predicate<String> isNumber = pattern.asMatchPredicate();

List<String> numbers = strings.stream()
    .filter(isNumber)
    .collect(toList());
```

### TimeUnit.convert() Overloads

- New methods for time conversion with Duration.

```java
long nanos = TimeUnit.MILLISECONDS.convert(Duration.ofSeconds(5));
long millis = TimeUnit.NANOSECONDS.convert(Duration.ofMinutes(1));
```

### CharSequence.compare()

- Static method for comparing char sequences.

```java
int result = CharSequence.compare("abc", "def");  // -3
int result2 = CharSequence.compare("hello", "hello");  // 0
```

### Unicode 10 Support

- Support for latest Unicode standard with new characters and emoji.

```java
// New Unicode 10 characters and emoji are supported
String emoji = "🤩🤯🤫";  // New emoji from Unicode 10
System.out.println(emoji);
```

### Nest-Based Access Control

- Better access control for nested classes (JVM improvement).

```java
public class Outer {
    private int value = 42;
    
    class Inner {
        void accessOuter() {
            System.out.println(value);  // More efficient access
        }
    }
}
```

## Java 12 (2019)

### Compact Number Formatting

- New NumberFormat for compact number representation.

```java
NumberFormat formatter = NumberFormat.getCompactNumberInstance();
System.out.println(formatter.format(1000));     // "1K"
System.out.println(formatter.format(1000000));  // "1M"
System.out.println(formatter.format(1500000));  // "2M"

// With specific locale
NumberFormat germanFormatter = NumberFormat.getCompactNumberInstance(
    Locale.GERMAN, NumberFormat.Style.SHORT);
System.out.println(germanFormatter.format(1000000)); // "1 Mio."
```

### Teeing Collectors

- New collector that allows collecting to two different collectors.

```java
List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);

// Collect to two different results simultaneously
var result = numbers.stream()
    .collect(Collectors.teeing(
        Collectors.summingInt(Integer::intValue),  // Sum
        Collectors.counting(),                     // Count
        (sum, count) -> "Sum: " + sum + ", Count: " + count
    ));
System.out.println(result); // "Sum: 21, Count: 6"
```

### String Methods

- New methods for string manipulation.

```java
String text = "Hello\nWorld\nJava";

// indent() - add or remove indentation
String indented = text.indent(4);
System.out.println(indented);
// "    Hello\n    World\n    Java\n"

// transform() - apply a function to the string
String transformed = "hello".transform(String::toUpperCase);
System.out.println(transformed); // "HELLO"

// Method chaining with transform
String result = "  hello world  "
    .transform(String::strip)
    .transform(String::toUpperCase)
    .transform(s -> s.replace(" ", "_"));
System.out.println(result); // "HELLO_WORLD"
```

### Files.mismatch()

- Method to find the first mismatch between two files.

```java
Path file1 = Path.of("file1.txt");
Path file2 = Path.of("file2.txt");

long mismatch = Files.mismatch(file1, file2);
if (mismatch == -1) {
    System.out.println("Files are identical");
} else {
    System.out.println("First mismatch at byte position: " + mismatch);
}
```

## Java 13 (2019)

### String Methods Enhancement

- Enhanced escape sequence processing for text blocks.

```java
// Text block with escape sequences
String textBlock = """
                   Line 1
                   Line 2 with \s spaces
                   Line 3 with \t tab
                   """;

// String formatting with text blocks
String formatted = """
                   Name: %s
                   Age: %d
                   Email: %s
                   """.formatted("John", 30, "john@example.com");

// Strip indent for text blocks
String code = """
              public class Hello {
                  public static void main(String[] args) {
                      System.out.println("Hello World");
                  }
              }
              """.stripIndent();
```

### FileSystems.newFileSystem()

- New overloaded methods for creating file systems.

```java
// Create file system from Path
Path jarPath = Path.of("example.jar");
FileSystem fileSystem = FileSystems.newFileSystem(jarPath);

// Create file system with specific class loader
FileSystem fs = FileSystems.newFileSystem(
    jarPath, 
    ClassLoader.getSystemClassLoader()
);

// Working with files inside JAR
Path fileInJar = fs.getPath("META-INF/MANIFEST.MF");
String content = Files.readString(fileInJar);
```

### Socket API Reimplementation

- Improved underlying socket implementation (mostly internal).

```java
// Socket usage remains the same, but with better performance
Socket socket = new Socket("localhost", 8080);
ServerSocket serverSocket = new ServerSocket(8080);

// The API didn't change, but the implementation is more efficient
// and easier to maintain
```

## Java 14 (2020)

### Switch Expressions (Standard)

- Switch expressions are now a standard feature (no longer preview).

```java
// Standard switch expressions
String result = switch (day) {
    case MONDAY, FRIDAY, SUNDAY -> "6";
    case TUESDAY -> "7";
    case THURSDAY, SATURDAY -> "8";
    case WEDNESDAY -> "9";
    default -> throw new IllegalStateException("Invalid day: " + day);
};

// Using yield for complex logic
int numLetters = switch (day) {
    case MONDAY, FRIDAY, SUNDAY -> {
        System.out.println("Processing: " + day);
        yield day.toString().length();
    }
    case TUESDAY, THURSDAY -> {
        System.out.println("Mid-week day: " + day);
        yield day.toString().length();
    }
    default -> day.toString().length();
};
```

### Helpful NullPointerExceptions

- More detailed NPE messages showing exactly which variable was null.

```java
// Code that might throw NPE
String name = person.getAddress().getStreet().getName();

// Before Java 14: Generic message
// Exception: java.lang.NullPointerException

// Java 14+: Detailed message
// Exception: java.lang.NullPointerException: 
//   Cannot invoke "Street.getName()" because the return value of 
//   "Address.getStreet()" is null

// Enable with JVM flag: -XX:+ShowCodeDetailsInExceptionMessages
```

## Java 15 (2020)

### Text Blocks (Standard)

- Text blocks are now a standard feature, no longer preview.

```java
// Multi-line strings with proper formatting
String html = """
              <html>
                  <head>
                      <title>My Page</title>
                  </head>
                  <body>
                      <h1>Hello World</h1>
                      <p>This is a text block.</p>
                  </body>
              </html>
              """;

// SQL queries
String query = """
               SELECT customer.name, customer.email, order.total
               FROM customers customer
               JOIN orders order ON customer.id = order.customer_id
               WHERE order.status = 'COMPLETED'
               ORDER BY order.total DESC
               """;

// JSON with proper formatting
String json = """
              {
                  "user": {
                      "id": 123,
                      "name": "John Doe",
                      "preferences": {
                          "theme": "dark",
                          "notifications": true
                      }
                  }
              }
              """;
```

### Hidden Classes

- Support for frameworks to define classes that are not discoverable.

```java
// Mainly used by frameworks like Spring, Hibernate
// Example usage (simplified)
public class DynamicClassLoader {
    public Class<?> defineHiddenClass(byte[] classBytes) {
        MethodHandles.Lookup lookup = MethodHandles.lookup();
        try {
            MethodHandles.Lookup hiddenLookup = lookup.defineHiddenClass(
                classBytes, 
                true, 
                MethodHandles.Lookup.ClassOption.NESTMATE
            );
            return hiddenLookup.lookupClass();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
```

## Java 16 (2021)

### Records (Standard)

- Records are now a standard feature, no longer preview.

```java
// Simple record declaration
public record Person(String name, int age, String email) {}

// Usage
Person person = new Person("John Doe", 30, "john@example.com");
System.out.println(person.name());     // John Doe
System.out.println(person.age());      // 30

// Records automatically provide constructor, getters, equals(), hashCode(), toString()
```

### Pattern Matching for instanceof (Standard)

- Pattern matching for instanceof is now a standard feature.

```java
// Before Java 16
if (obj instanceof String) {
    String s = (String) obj;
    System.out.println("Length: " + s.length());
}

// Java 16+ pattern matching
if (obj instanceof String s) {
    System.out.println("Length: " + s.length());
}
```

## Java 17 (2021) - LTS

### Sealed Classes (Standard)

- Sealed classes are now a standard feature, controlling inheritance hierarchy.

```java
// Sealed class declaration
public sealed class Shape permits Circle, Rectangle, Square {
    // Common shape methods
}

// Permitted subclasses
public final class Circle extends Shape {
    private final double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
}

public final class Rectangle extends Shape {
    private final double width, height;
    
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
}

public non-sealed class Square extends Shape {
    // Square can be extended further
    private final double side;
    
    public Square(double side) {
        this.side = side;
    }
}
```

### Enhanced Pseudo-Random Number Generators

- New interfaces and implementations for better random number generation.

```java
// New RandomGenerator interface
RandomGenerator generator = RandomGeneratorFactory
    .getDefault()
    .create();

int randomInt = generator.nextInt(100);
double randomDouble = generator.nextDouble();

// Specific algorithm
RandomGenerator xoroshiro = RandomGeneratorFactory
    .of("Xoroshiro128PlusPlus")
    .create();

// Splittable generators for parallel processing
SplittableGenerator splittable = RandomGeneratorFactory
    .of("L128X1024MixRandom")
    .create();
```

## Java 18 (2022)

### UTF-8 by Default

- UTF-8 is now the default charset for standard Java APIs.

```java
// Before Java 18: platform-dependent default charset
FileWriter writer = new FileWriter("file.txt"); // Used system default

// Java 18+: UTF-8 by default everywhere
FileWriter writer = new FileWriter("file.txt"); // Always UTF-8
String content = Files.readString(Path.of("file.txt")); // Always UTF-8
```

### Simple Web Server

- Built-in HTTP server for development and testing.

```java
// Command line usage
jwebserver -p 8080 -d /path/to/directory

// Programmatic usage
HttpServer server = SimpleFileServer.createFileServer(
    new InetSocketAddress(8080),
    Path.of("/path/to/directory"),
    SimpleFileServer.OutputLevel.VERBOSE
);
server.start();
```

## Java 19 (2022)

### No Major Standard Features

- Java 19 focused primarily on preview and incubator features.

## Java 20 (2023)

### No Major Standard Features

- Java 20 continued focus on preview and incubator features.

## Java 21 (2023) - LTS

### Virtual Threads

- Lightweight threads that dramatically improve concurrent programming.

```java
// Create virtual thread
Thread virtualThread = Thread.ofVirtual().start(() -> {
    System.out.println("Running in virtual thread");
});

// Virtual thread executor
try (ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor()) {
    executor.submit(() -> {
        // Task runs in virtual thread
        System.out.println("Task executed");
    });
}
```

### Sequenced Collections

- New interfaces for collections with defined encounter order.

```java
// Sequenced List - access first/last elements
List<String> list = List.of("first", "middle", "last");
String first = list.getFirst();  // "first"
String last = list.getLast();    // "last"

// Sequenced Set - ordered set operations
LinkedHashSet<String> set = new LinkedHashSet<>();
set.add("one");
set.add("two");
String firstInSet = set.getFirst();  // "one"
String lastInSet = set.getLast();   // "two"
```

### Pattern Matching for switch (Standard)

- Pattern matching in switch expressions is now standard.

```java
// Pattern matching with different types
public String describe(Object obj) {
    return switch (obj) {
        case Integer i -> "Integer: " + i;
        case String s -> "String: " + s;
        case null -> "It's null";
        default -> "Unknown type";
    };
}

// Pattern matching with guards
public String categorize(Object obj) {
    return switch (obj) {
        case Integer i when i > 0 -> "Positive integer";
        case Integer i when i < 0 -> "Negative integer";
        case String s when s.isEmpty() -> "Empty string";
        case String s -> "Non-empty string: " + s;
        default -> "Other";
    };
}
```

### Record Patterns

- Destructure records in pattern matching.

```java
// Record for example
public record Point(int x, int y) {}
public record Circle(Point center, int radius) {}

// Destructure records in switch
public String analyzeShape(Object shape) {
    return switch (shape) {
        case Circle(Point(int x, int y), int radius) -> 
            "Circle at (" + x + "," + y + ") with radius " + radius;
        case Point(int x, int y) -> 
            "Point at (" + x + "," + y + ")";
        default -> "Unknown shape";
    };
}

// Destructure in if statements
if (shape instanceof Circle(Point(var x, var y), var radius)) {
    System.out.println("Circle center: " + x + "," + y);
    System.out.println("Radius: " + radius);
}
```

## Java 22 (2024)

### Unnamed Variables & Patterns

- Use underscore for unused variables and patterns.

```java
// Unnamed variables in lambda expressions
list.stream()
    .map((var _, var name) -> name.toUpperCase())  // Don't care about first param
    .forEach(System.out::println);

// Unnamed patterns in switch
switch (shape) {
    case Circle(_, var radius) -> "Circle with radius: " + radius;  // Don't care about center
    case Rectangle(var width, _) -> "Rectangle with width: " + width;  // Don't care about height
    default -> "Other shape";
}

// Unnamed exception variable
try {
    riskyOperation();
} catch (IOException _) {  // Don't use the exception
    System.out.println("IO error occurred");
}
```

### Statements Before super()

- Allow statements before super() call in constructors.

```java
public class Student extends Person {
    private final String studentId;
    
    public Student(String name, String rawId) {
        // Statements before super() call
        String cleanId = rawId.trim().toUpperCase();  // Process data first
        this.studentId = cleanId;
        
        super(name);  // Call super constructor
    }
}
```

### Foreign Function & Memory API (Standard)

- Call native functions and access native memory safely.

```java
// Access native C library
Linker linker = Linker.nativeLinker();
SymbolLookup stdlib = linker.defaultLookup();

// Find strlen function
MethodHandle strlen = linker.downcallHandle(
    stdlib.find("strlen").get(),
    FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
);

// Call native function
try (Arena arena = Arena.ofConfined()) {
    MemorySegment cString = arena.allocateFrom("Hello");
    long length = (long) strlen.invoke(cString);
    System.out.println("String length: " + length);  // 5
}
```

### Launch Multi-File Source Code Programs

- Run Java programs with multiple source files directly without compilation.

```java
// Command line usage - can now run multiple .java files
java Main.java Helper.java Utils.java

// No need to compile multiple files separately
// All dependencies resolved automatically
// Great for scripting and prototyping
```

## Java 23 (2024)

### ZGC Generational Mode by Default

- ZGC now uses generational garbage collection by default for better performance.

```java
// No code changes needed - automatic improvement
// ZGC now optimizes for typical object lifecycles
// Better performance for applications with many short-lived objects
// Use -XX:+UseZGC to enable ZGC
```

### No Other Major Standard Features

- Java 23 focused primarily on preview features and internal improvements.

## Java 24 (2025)

### Most Features Still in Preview

- Java 24 focuses on preview and incubator features for future releases.

```java
// Most significant features are still in preview:
// - Stream Gatherers
// - Structured Concurrency  
// - Scoped Values
// - Class-File API
// Check future releases for standard features
```