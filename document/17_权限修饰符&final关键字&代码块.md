# 权限修饰符
## 四种权限修饰符的权限范围
| 修饰符 | 同一个类 | 同一个包 | 子类（不同包） | 其他包 |
| --- | --- | --- | --- | --- |
| **public** | ✅ | ✅ | ✅ | ✅ |
| **protected** | ✅ | ✅ | ✅ | ❌ |
| （默认 / 无修饰符） | ✅ | ✅ | ❌ | ❌ |
| **private** | ✅ | ❌ | ❌ | ❌ |


## 四种权限修饰符
### public（公共的）
+ 表示 **完全公开**，任何类都可以访问。
+ 常用于：
    - 对外提供接口的类（`public class Hello {}`）
    - 类中的公共方法（例如 `public static void main()`）
    - 工具类中的方法
+  `public`修饰的成员变量和成员方法在任何包、任何类中都可以访问 `类名.成员变量` 和 `类名.方法名()`。  

**例子：**

```java
public class A {
    public int x = 10;
    public void show() {
        System.out.println("Hello");
    }
}
```

### proteted（受保护的）
+ 允许：
    - 同一个包内访问；
    - 不同包中的**子类**访问。
+  常用于：**继承场景**下需要对子类开放访问但不完全公开的成员。  

**例子：**

```java
package pack1;
public class A {
    protected void test() {
        System.out.println("Protected method");
    }
}

package pack2;
import pack1.A;

public class B extends A {
    public void call() {
        test(); // ✅ 可以访问（子类继承）
    }
}
```

**但如果是以下情况不行：**

```java
new A().test(); // ❌ 不行（不同包非子类）
```

### 默认
+ 如果**不写修饰符**，默认是“包级访问权限”。
+ 只能在 **同一个包** 中访问，**不同包**的类不能访问。

```java
class A { // 默认权限
    void display() {
        System.out.println("Default");
    }
}
```

`A.display()` 只能被同包的类访问。  

### private（私有的）
+ 仅允许在**当前类内部**访问。
+ 最严格的访问级别。
+ 常用于：
    - 封装对象的内部状态；
    - 防止外部直接修改成员变量。

**例子：**

```java
public class A {
    private int value = 100;
    private void printValue() {
        System.out.println(value);
    }
}
```

其他类即使在同一个包中，也**不能**访问 `value` 或 `printValue()`。

# final关键字
## final可以修饰的元素
| 用途 | 修饰对象 |
| --- | --- |
| 修饰类 | 类不能被继承 |
| 修饰方法 | 方法不能被子类重写 |
| 修饰变量（局部变量、成员变量） | 变量值不能再改变 |
| 修饰对象 | 引用地址不可变，但对象内容可变 |
| 修饰形参 | 参数在方法体内不能被重新赋值 |


## final修饰类
1. **格式**

```java
public final class 类名{
    
}
```

2. 特点：被`final`修饰的类不能被继承

## final修饰方法
1. 格式

```java
修饰符 final 返回值类型 方法名(形参){
    
}
```

2. 特点：被`final`修饰的方法不能被重写
3. 注意
+ 子类仍然可以继承这个方法，只是不能重新定义它
+ `final`和`abstract`不能同时修饰一个方法，因为`abstract`修饰的抽象方法必须重写

## final修饰局部变量
1. **格式：**`final 数据类型 变量名 = 值`
2. **特点：**
+ 被`final`修饰的变量不能二次赋值
+ `final`修饰的局部变量必须在使用前赋值
3. 示例

```java
package com.aurora.finalDemo;

public class Test01 {
    public static void main(String[] args) {
        final int i = 10;
//        i = 100;  //不能修改

        final int j;
        j = 10;     //首次赋值，可以
//        j = 100;  //错误，不能再次赋值
    }
}
```

## final修饰成员变量
1. **格式：**`final 数据类型 变量名 = 值`，与`final`修饰局部变量一样
2. **特点：**与`final`修饰局部变量一样，同样是不能二次赋值
3. **赋值时机：**与`final`修饰局部变量不同，这里有三种赋值方式
    1. **定义时直接赋值**
    2. **构造函数中赋值**
    3. **实例初始化块中赋值**

```java
package com.aurora.finalDemo;

public class Test02 {
    /*
        final修饰成员变量的赋值时机
     */

    //1.直接赋值
    //final int x = 10;

    //2.在构造函数中赋值
    final int y;

    public Test02(int y) {
        this.y = y;
    }

    //3.在初始化块中赋值
    final int z;
    {z = 10;}
}
```

## final修饰对象
1. **格式：**`final 数据类型 对象名 = new 数据类型();`
2. **特点：**被`final`修饰的对象，地址值不能改变，但是对象中的属性可以改变
3. 示例

```java
package com.aurora.finalDemo;

public class Test03 {
    /*
        final修饰对象的示例
     */
    public static void main(String[] args) {
        final Person person = new Person("Tom", 20);
        person.setAge(21);      //可以修改对象中的属性值
        System.out.println(person.getAge());

        //不能让 p 指向另一个对象
//        person = new Person("Jerry", 22);     //编译错误
    }
}

```

**解释：**

+ `final` 修饰的是 **引用 **`**person**`，意味着它一直指向同一个内存地址；**（类似指针）**
+ 但那块地址中的对象（`Person`）内容是可以变的。

## final修饰方法参数
1. 特点： 形参在方法体内不能被重新赋值。  
2. 示例

```java
void test(final int x) {
    x = 10; // ❌ 错误
}
```

通常用于：

+ **匿名内部类** 中使用外部变量；
+ **防止误操作修改参数**。

# 代码块
1. 定义：一对用大括号`{}`括起来的一段代码

## 普通代码块
1. **概念**： **在方法或语句中**，用于限制变量作用域。  
2. **功能：**
+ 用来控制局部变量的作用范围；
+ 退出 `{}` 后，变量立即被销毁。
3. 示例

```java
package com.aurora.CodeBlock;

public class OrdinaryCodeBlock {
    public static void main(String[] args) {
        {
            int x = 10;
            System.out.println(x);
        }
        
        // // x 在这里就不可用了
//        System.out.println(x);
    }

}
```

![](https://cdn.nlark.com/yuque/0/2025/png/38867830/1762324865038-ca0d26f0-b375-49e8-80a3-56cc208f9aa1.png)

## 构造代码块
1. **概念：**定义在**类中、方法外**，每次创建对象时都会执行
2. **执行顺序：在构造方法之前执行**（即使构造代码块放在构造方法之后）**。**
3. **示例**

```java
package com.aurora.CodeBlock;

public class Person {

    //构造方法
    public Person() {
        System.out.println("无参构造方法执行");
    }

    //构造代码块
    {
        System.out.println("构造代码块执行");
    }
}
```

```java
package com.aurora.CodeBlock;

public class ConstructCodeBlockTest01 {
    public static void main(String[] args) {
        new Person();
    }
}
```

![](https://cdn.nlark.com/yuque/0/2025/png/38867830/1762488599351-91cd7308-9c54-49c8-867c-6d1b38740efb.png)

## 静态代码块
1. **概念： 使用 **`**static {}**`** 修饰的代码块，**在类加载时执行一次，常用于初始化静态变量或加载资源。  
2. **特点： 只执行一次（类第一次被加载时）**
3. **执行顺序：**静态代码块→构造代码块→构造方法
4. **示例**

```java
package com.aurora.CodeBlock;

public class Person {

    //构造方法
    public Person() {
        System.out.println("无参构造方法执行");
    }

    //构造代码块
    {
        System.out.println("构造代码块执行");
    }

    //静态代码块
    static {
        System.out.println("静态代码块执行");
    }
}
```

```java
package com.aurora.CodeBlock;

public class ConstructCodeBlockTest01 {
    public static void main(String[] args) {
        new Person();
    }
}
```

![](https://cdn.nlark.com/yuque/0/2025/png/38867830/1762493501624-bd6faf46-33d8-4be7-b84d-b7b18764d08c.png)

5. **使用场景**
+ 如果想让一些数据最先初始化,而且只需要初始化一次,就可以将这些数据放到静态代码块中

![](https://cdn.nlark.com/yuque/0/2025/png/38867830/1762493607463-744a039d-caf1-40a1-a930-8683247cf035.png)

