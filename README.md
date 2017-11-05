# ** LearnJava ** <a id="LearnJava"></a>
## 目录
### 1. [JavaGeneral](#1)
  >###### 1.1. [如何实现在main()方法执行之前执行一个方法](#1.1)
  >###### 1.2. [Java程序执行的顺序是怎样的](#1.2)

### 2. [AlgorithmProblem](#2)
  >###### 2.1 [百元白鸡](#2.1)
<br>
<br>

***
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
> 10.子类构造函数 <br>

#### [⬆ back to top](#LearnJava)

<br>

<a id="2"></a>
## AlgorithmProblem <br>
<a id="2.1"></a>
### 2.1. 百元百鸡

* #### **package：** AlgorithmProblem <br>
* #### **class：** bai_yuan_bai_chicken <br>
> 公鸡：一只5元<br>
> 母鸡：一只3元<br>
> 小鸡：三只1元<br>
> 问：100元买100只鸡共有几种情况？<br>

#### [⬆ back to top](#LearnJava)
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
