# Java Generics

## Agenda

- Introduction
- Generic classes
- Bounded types
- Generic methods and wild-card character (?)
- Communication with non-generic code
- Conclusions

## Main Objective of Generics

- To provide type-safety
- To resolve type-casting problems

## Case 1: Type Safety

### C1: Arrays

- Problem: To store 10,000 student names
- Arrays: Type Safe
- Arrays are type-safe, that is we can give the guarantee for the type of elements present inside array.
- For example, if our programming requirement is to hold only String type of objects, we can choose String array. By mistake if we are trying to add any other type of objects we will get compile time error.

```java
String[] s = new String[10000];
s[0] = "Durga";
s[1] = "Robin";
// s[2] = new Integer(10);  // Compile-time Error: In-compatible types
                            // Found: java.lang.Integer
                            // Required: java.lang.String
s[2] = "Shiva";
```

- Hence, String array can contain only String type of objects. Due to this we can give the guarantee for the type of elements present inside array. Hence, arrays are safe to use with respect to types - that is, arrays are type-safe.

### C1: Collections

- Problem: To store 10,000 student names
- Collections: Type-safety is not available
- But Collections are not type safe - that is, we can't give the guarantee for the type of elements present inside a collection. For example, if our programming requirement is to hold only String type of objects and if we choose ArrayList, by mistake if we are trying to add any other type of object, we won't get any compile-time exception, but the program may fail at run-time.

```java
ArrayList l = new ArrayList();
l.add("Durga");
l.add("Robin");
l.add(new Integer(10));

// -----------------------------------

String name1 = (String) l.get(0);
String name2 = (String) l.get(1);
// String name3 = (String) l.get(2);   // Run-time Exception: ClassCastException
```

- Hence, we can't give the guarantee for the type of elements present inside collection. Due, to this collections are not safe to use with respect to type - that is, collection are not type safe.

## Case 2: Type-casting

### C2: Arrays

- In the case of arrays at the time of retrieval it is not required to perform type casting. Because there is a guarantee for the type of elements present inside array.

```java
String[] s = new String[10000];
s[0] = "Durga";

// ------------------------------

String name1 = s[0];        // Type-casting is not required
```

### C2: Collections

- But in the case of collections at the time of retrieval compulsorily we should perform type casting because there is no guarantee for the type elements present inside collection.

```java
ArrayList l = new ArrayList();
l.add("Durga");

// ------------------------------

// String name1 = l.get(0);     // Compile-time Error: In-compatible types
                                // Found: java.lang.Object
                                // Required: java.lang.String
String name1 = (String) l.get(0);       // Type-casting is mandatory
```

- Hence type-casting is a big headache in collections.
- To overcome above problems of collections, some people introduced Generics concept in Java 1.5 version.
- Hence the main objectives of Generics are:
  - To provide type-safety
  - To resolve type-casting problems

## Conclusions

- Only `extends` keyword is allowed in Generic class definition

```java
class A {}

class MyArray<T extends A> {
    // class properties and methods
}
```

- `extends` keyword is used for interfaces also

```java
interface B {}

class MyArray<T extends B> {
    // class properties and methods
}
```

- `extends` from only one class and multiple interfaces. In such cases, the first one must be a class and rest can be interfaces.

```java
class A {}
interface B {}
interface C {}

class Test extends A implements B, C {
    // properties and methods
}

class MyArray<T extends A & B & C> {
    // properties and methods
}

public class GenericsDemo {
    public static void main(String[] args) {
        // MyArray<String> ma1 = new MyArray<String>();    // Compile-time Error
        // MyArray will allow only those classes as its generics which are extending class A and implementing class B and C
        MyArray<Test> ma1 = new MyArray<Test>();
    }
}
```

- `extends` and `super` are allowed with `<?>` in methods

```java
class A {}

class MyArray<T extends A> {}
// class MyArray<T super A> {} // Compile-time Error

public class GenericDemo {
    // Following will allow only that type who is sub-class of Number i.e. Integer, Float, Double etc. types
    static void fun(MyArray<? extends Number> obj) {
        obj.append(null);
    }

    // Following will allow only that type who is super-class of String i.e. Object type
    static void fun(MyArray<? super String> obj) {
        obj.append(null);
    }
}
```

- `<?>` will accept all types but cannot access

```java
class A {}

class MyArray<T extends A> {}

public class GenericDemo {

    // Just <?> means type is not defined, type can be anything
    // i.e. it does not know which type of object to be inserted, so it does not allow
    static void fun(MyArray<?> obj) {
        // obj.append("Hello");    // Compile-time Error
        obj.append(null);          // It will allow you to store only null
    }

    static void fun(MyArray<String> obj) {
        obj.append("Hello");        // This works
    }

    static void fun(MyArray<? extends Object> obj) {
        obj.append("Hello");        // Even this works
    }

    public static void main(String[] args) {
        MyArray<String> ma1 = new MyArray<>();
        fun(ma1);
    }
}
```

- Base type of an Object should be same or `<?>`

```java
public class GenericDemo {
    public static void main(String[] args) {
        // MyArray<Object> ma1 = new MyArray<String>();    // Compile-time Error
        // MyArray<Number> ma1 = new MyArray<Integer>();   // Compile-time Error
        MyArray<Integer> ma1 = new MyArray<Integer>();

        // In following case it can hold the object but it cannot use it
        MyArray<?> ma2 = new MyArray<Integer>()
        // ma2.append(10);     // Compile-time Error
    }
}
```
