# Object类的介绍
1. **概念：**`Object` 类是 **Java 中所有类的“祖宗类”**，也就是 **所有类都直接或间接继承自 Object**。  
2. Object类的地位

Java的继承体系中：

```java
class A {}
```

等价于：

```java
class A extends Object {}
```

即使不写`extends Object`，Java也会默认继承它。

因此：

+ 所有类都可以被当作 `Object` 使用；
+ 所有类都拥有 `Object` 定义的方法。

# Object类的常用方法
## toString方法
1. **作用：**返回该对象的字符串表示形式
2. `**toString**`**的源码定义**

```java
public String toString() {
    return getClass().getName() + "@" + Integer.toHexString(hashCode());
}
```

**解释：**

+ `getClass().getName()` → 返回类的全限定名（如 `com.example.Person`）
+ `hashCode()` → 返回对象的哈希值（一个整数）
+ `Integer.toHexString()` → 将哈希值转成十六进制字符串
3. **在输出对象名时，**`**System.out.println(); **`**会默认调用Object中的**`**toString**`**方法，直接输出地址值**

```java
package com.aurora.ObjectDemo;

public class Person {
    String name;
    int age;
}
```

```java
package com.aurora.ObjectDemo;

public class toStringDemo01 {
    public static void main(String[] args) {
        Person person = new Person();
        //不写toString也默认调用
        System.out.println(person);
        //写toString
        System.out.println(person.toString());	//因为person类默认继承了Object类，所以可以直接写p.toString()去调用
    }
}
```

![](https://cdn.nlark.com/yuque/0/2025/png/38867830/1762691364733-532d309f-f3cb-4cec-a146-23b257503213.png)

+ 可以看到，显示写出`toString`与否，输出的结果都是一样的
+ 因为`person`类默认继承了Object类，所以可以直接写`p.toString()`去调用
4. 可以**重写**`**toString**`**，去改变输出的值**

例如：想输出对象中的属性，而不需要地址值时

```java
package com.aurora.ObjectDemo;

public class Person {
    String name;
    int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //重写toString方法
    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}
```

```java
package com.aurora.ObjectDemo;

public class toStringDemo01 {
    public static void main(String[] args) {
        Person person = new Person("Tom", 20);
        //不写toString也默认调用
        System.out.println(person);
        //写toString
        System.out.println(person.toString());  //因为person类默认继承了Object类，所以可以直接写p.toString()去调用
    }
}
```

![](https://cdn.nlark.com/yuque/0/2025/png/38867830/1762691816758-7face0b7-059e-433f-a589-52f892b42266.png)

+ 可见显示写出`toString`与否，输出的结果都是一样的，但经过`toString`方法的重写之后，输出的结果不再是对象的地址了，而是我们重新设定的值
5. 自动生成`toString()`的重写
+ `Alt + Insert` → `toString()`
+ ![](https://cdn.nlark.com/yuque/0/2025/png/38867830/1762692008419-77be3d57-7358-41be-a825-ab5aabdfca12.png)

## equals方法
1. **作用：**比较两个对象的地址值是否相同，默认等价于`==`
2. 源码定义

```java
public boolean equals(Object obj) {
    return (this == obj);
}
```

3. 示例

```java
package com.aurora.ObjectDemo;

public class equalsDemo01 {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();

        System.out.println(person1.equals(person2));
        System.out.println(person1 == person2);
    }
}
```

![](https://cdn.nlark.com/yuque/0/2025/png/38867830/1762692940875-62612f04-d675-418a-9d4a-8754fbeb5aa2.png)

4. **重写**`**equals**`**方法**
+ 如果不想比较对象的地址，就可以重写`equals`方法，比如重写为比较对象的内容

```java
package com.aurora.ObjectDemo;

public class Person {
    String name;
    int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //重写equals方法
    @Override
    public boolean equals(Object obj) {
        //1. 判断是否为同一个对象
        if (this == obj) return true;
        //2. 判断obj是否为person类型
        if (obj instanceof Person) {
            Person p = (Person) obj;    //向下强转类型
            //3. 比较主要属性
            return this.name.equals(p.name) && this.age == p.age;
        }

        //不是同类对象，返回false
        return false;
    }
}
```

```java
package com.aurora.ObjectDemo;

/*
    equals默认比较地址示例
 */

public class equalsDemo01 {
    public static void main(String[] args) {
        //name和age属性相同的两个对象
        Person person1 = new Person("Tom", 20);
        Person person2 = new Person("Tom", 20);

        System.out.println("equals的比较结果：" + person1.equals(person2));
        System.out.println("==的比较结果：" + (person1 == person2));
    }
}
```

![](https://cdn.nlark.com/yuque/0/2025/png/38867830/1762694089080-85b34b64-7163-4733-8693-8ffb2722df90.png)

+ 可以看到，虽然是两个不同的对象，但是属性`name`和`age`都相同，而重写的`equals`方法就是比较`name`和`age`，所以返回的结果是`true`
+ 而`==`对于对象而言仍然是比较两个对象的地址，两个不同的对象比较的结果当然是`false`
5. `==`和`equals()`的使用场景

上例中，在重写`equals`方法时，对`this.name`和`obj.name`比较时使用的时`equals`方法，而对`this.age` 和`obj.age`比较时使用的却是`==`，先来看一下二者的区别：

| 比较方式 | 比较内容 | 是否可重写 | 常用于 |
| --- | --- | --- | --- |
| `==` | 比较两个引用是否指向同一个对象（内存地址） | ❌ 不可重写 | `int`, `double`, `boolean`, `char` 等基本类型、以及对象地址比较 |
| `equals()` | 默认比较地址，但可以重写为比较内容 | ✅ 可重写 | 对象内容比较，**只适用于引用类型（对象）** |


+ 从上面的表可以看出`.equals()` 只能用于引用类型（对象）  ，`this.name`的类型是`String`，`String`类型就属于引用类型；而`this.age`的类型属于`int`，但是`int`是基本类型，不是对象，所以只能使用`==`来比较，不能使用`.equals()`比较
+ 如果把`age`改成`Integer`类型，就可以使用`.equals()`来比较了

## clone方法
1. **作用：**复制（克隆）一个属性值一样的新对象
2. **使用方式：**
    1. **被克隆的对象实现**`**Cloneable**`**接口**
    2. **重写**`**clone**`**方法：**因为它在 `Object` 中是 `protected`，外部无法直接访问。
3. 示例

```java
package com.aurora.ObjectDemo;

public class clonePerson implements Cloneable{
    String name;
    int age;

    public clonePerson() {
    }

    public clonePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof clonePerson) {
            clonePerson person = (clonePerson) obj;
            return name.equals(person.name) && age == person.age;
        }

        return false;
    }

    //重写clone方法

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
```

```java
package com.aurora.ObjectDemo;

public class cloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        clonePerson person1 = new clonePerson("Tom", 20);
        clonePerson person2 = (clonePerson) person1.clone();

        System.out.println(person1 == person2);     //false
        System.out.println(person1.equals(person2));    //true
    }
}
```

![](https://cdn.nlark.com/yuque/0/2025/png/38867830/1762745810712-83cd3358-124f-424d-a35a-6fdddc5e0d97.png)

可以从输出结果看出，`person1`和`person2`地址不同，但是属性值相同

