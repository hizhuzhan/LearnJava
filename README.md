# LearnJava <a id="LearnJava"></a>
## 目录
### 1. [JavaGeneral](#1)
  >###### 1.1. [如何实现在main()方法执行之前执行一个方法](#1.1)
  >###### 1.2. [Java程序执行的顺序是怎样的](#1.2)
  >###### 1.3. [Java中的作用域](#1.3)

<br>
<br>

---
<a id="1"></a>
## JavaGeneral <br>
<a id="1.1"></a>
### 1.1. 如何实现在main()方法执行之前执行一个方法 <br>
* #### **package：** JavaGeneral</span><br>
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
* #### **package：** JavaGeneral</span><br>
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
### 1.2. Java中的作用域 <br>
* #### **package：** No package</span><br>
* #### **class：** No class
> | 作用域可比性 | 当前类 | 同意 package | 子类 | 其他 package |
  |-|-|-|-|-|
  public | √ | √ | √ | √ |
  private | √ | × | × | × |
  protected | √ | √ | √ | × |
  default | √ | √ | × | × |
  1. public 表明当前变量或方法对所有类或对象都是可见的，所有的类和对象都可以直接访问
  2. private 表面该成员变量或方法是私有的，只有当前类对其有访问权限，除此之外其他类或者对象都没有权限访问
  3. default 表明该成员变量或方法只有自己与其位于同一包内的类可见。若父类与子类位于一个包被，则子类对父类的default 成员变量或者方法都有访问权限；若父类与子类位于不同的包内，则没有访问权限。
  4. 注意： 这些修饰符只能修饰成员变量，不能用来修饰局部变量。private 与 protected不能用来修饰类（之有public、abstract、或final 能用来修饰类）


#### [⬆ back to top](#LearnJava)

<br>
