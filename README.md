# LearnJava <a id="LearnJava"></a>
## 目录
### 1. [JavaGeneral](#1)
  >###### 1.1. [如何实现在main()方法执行之前执行一个方法](#1.1)
  >###### 1.2. [Java程序执行的顺序是怎样的](#1.2)
  >###### 1.3. [Java中的作用域](#1.3)
  >###### 1.4. [Java中的标识接口](#1.4)

<br>
<br>

---
<a id="1"></a>
## JavaGeneral <br>
<a id="1.1"></a>
### 1.1. 如何实现在main()方法执行之前执行一个方法 <br>
* #### **package：** javaGeneral</span><br>
* #### **class：** Earlier_print_than_mainMethod.java
> 在Java中，main() 方法是程序的入口方法，在程序运行时，最先加载的就是main() 方法。<br>
> 但！不意味着main() 方法就是程序运行时第一个执行的模块。<br>
> ：在Java中静态块在累被加载时就会被调用，如下：<br>
> 由于静态块 不管顺序如何，都会在main() 方法执行之前执行，因此不管静态块 放在何处都会比main() 方法先执行。

#### [⬆ back to top](#LearnJava)

<br>

---

<a id="1.2"></a>
### 1.2. Java程序执行的顺序是怎样的 <br>
* #### **package：** javaGeneral</span><br>
* #### **class：** Java_initialize_the_order.java
> Java中不同类型的代码块执行的顺序：<br>
> 1. 父类静态变量<br>
> 2. 父类静态变量代码块<br>
> 3. 子类静态变量<br>
> 4. 子类静态变量代码块<br>
> 5. 父类非静态变量<br>
> 6. 父类非静态变量代码块<br>
> 7. 父类构造函数<br>
> 8. 子类非静态变量<br>
> 9. 子类非静态变量代码块<br>
> 10. 子类构造函数 <br>

#### [⬆ back to top](#LearnJava)

<br>

---

<a id="1.3"></a>
### 1.3. Java中的作用域 <br>
* #### **package：** No package</span><br>
* #### **class：** No class
> | 作用域可比性 | 当前类 | 同一 package | 子类 | 其他 package |<br>
  |-------------|----:--|--------------|------|-------------|<br>
  | public | √ | √ | √ | √ |<br>
  |private | √ | × | × | × |<br>
  |protected | √ | √ | √ | × |<br>
  |default | √ | √ | × | × |<br>
  1. public 表明当前变量或方法对所有类或对象都是可见的，所有的类和对象都可以直接访问
  2. private 表面该成员变量或方法是私有的，只有当前类对其有访问权限，除此之外其他类或者对象都没有权限访问
  3. default 表明该成员变量或方法只有自己与其位于同一包内的类可见。若父类与子类位于一个包被，则子类对父类的default 成员变量或者方法都有访问权限；若父类与子类位于不同的包内，则没有访问权限。
  4. 注意： 这些修饰符只能修饰成员变量，不能用来修饰局部变量。private 与 protected不能用来修饰类（之有public、abstract、或final 能用来修饰类）


#### [⬆ back to top](#LearnJava)

<br>

---

<a id="1.4"></a>
### 1.4. Java中的标识接口 <br>
* #### **package：** markup_interface</span><br>
* #### **class：** Main.java
> **接口**：由于Java不支持多重继承，即一个类只能有一个父类，为了克服单继承的缺点，Java语言引入了接口这一概念。由于一个类可以实现多个接口，因此通常采用实现多个接口的方式来简介达到多重集成的目的。
> > 1. 接口是抽象方法定义的集合（接口中也可以定义一些常量值），是一种特殊的抽象类
> > 2. 接口中只包含方法的定义，没有方法的实现。
> > 3. 接口中的所有方法都是抽象的。
> > 4. 接口中成员变量的作用域修饰符都是public。
> > 5. 接口中的常量默认使用 public static final 修饰。
>
> **标识接口**： 有些接口内部没有生命方法，也就是说，实现这些接口的类不需要重写任何方法，这些没有任何方法的接口又被称作表示接口，表示接口对实现他的类没有任何语义上的要求，它仅仅是充当一个标识的作用，用来表明实现他的类属于一个特定的类型。类似于是汽车的一个标志。
> Java类库中已存在的标识接口有Cloneable 和Serializable 等。在使用是回经常用instanceof来判断实例化对象的类型是否实现了一个给定的接口。

#### [⬆ back to top](#LearnJava)

<br>
