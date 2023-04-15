# static

static is a modifier that can modify the member methods
and member variables.

- Shared by all objects of the class
- One more way to call by class name
- Loaded as the class is loaded, taking precedence over the existence of the object

static member variables : share data

static member methods : Commonly used in the tools class

### Attention
- In static methods, only static members can be accessed.
- The use of keyword 'this' is not allowed in static.

### Member access features in inheritance

If there are member variables with the same name in the child and parent classes, who will take precedence when using them?

```java
public class superclass{
    int num = 10;
}
```


```java
public class subclass extends superclass{
    int num = 20;
    public void method(){
        System.out.println(num);
    }
}
```


```java
public class Test{
    public static void main(String([] args) {
        subclass sc = new subclass();
        sc.method();
    }
}
```

Subclasses will be executed first because of the proximity principle。

If we want to make the superclass execute first, we need to use 'super' keyword.


- this: calling members of this class
- super: calling members of superclass

```java
public class superclass{
    int num = 10;
}

class subclass extends superclass{
    int num = 20;
    public void method(){
        int num = 30;
        System.out.println(num); //30
        System.out.println(this.num); //20
        System.out.println(super.num); //10
    }
}
```

## Overriding

In java, can a subclass that inherits methods from its superclass continue to define its own methods?

In Java, it is possible for a subclass to inherit methods from a superclass and also define its own methods. This process is called method **overloading** or method **overriding**.

When a subclass defines a method with the same name as a method in its parent class, the subclass method overrides the parent method. 

This process is called method overriding, and the subclass method must have the same name, parameter list, and return type as the method being overridden in the parent class to be a valid override.

Additionally, the subclass can also overload inherited methods, which involves defining a method with the same name but a different parameter list.



