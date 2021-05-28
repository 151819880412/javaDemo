/**
 * API
 *  Scanner:java.util.Scanner 是 Java5 的新特征，我们可以通过 Scanner 类来获取用户的输入
 *  Arrays 工具类：
 *                boolean   equals(int[] a , int[] b)         //判断两个数组是否相等(只比较值，不是内存地址)
 *                String   toString(int[] a)                  //输入数组信息
 *                void   fill(int[]a , int val)               //将指定值替换到数组中
 *                void   sort(int[] a)                        //对数组进行排序
 *                int   binarySearch(int[]a , int key)        //堆排序后的数组进行二分法的index值
 *  class封装性
 *                private：私有的
 *                缺省
 *                protucted
 *                public：公共的
 *  数组种常见的异常：
 *                ArrayIndexOutOfBoundsExcetion               //数组index异常
 *                NullPositionterException                    //空指针异常
 *  instanceof    检验对象是否为类的实例。向下转型之前先判断一下
 *  Object
 *                clone()         克隆对象
 *                equals()        判断两个对象是否相等(引用地址)
 *                finalize()      垃圾回收，对象被回收之前会调用
 *                getClass()      获取当前对象的所属类
 *                hashCode()      返回当前对象的哈希值
 *                getSuperClass()
 *                toString()      转字符串
 *  abstract：抽象的。用来修饰类、方法
 *  super     调用父类构造器
 *  Thread    运行多线程  
 *            void start() 启动线程，并执行 run() 方法
 *            run() 线程在被调度时执行的方法
 *            String getName() 返回县城的名称
 *            void setName(String Name) 设置该线程的名称
 *            static Thread currentThread() 返回当前线程，在子类中就是 this 通常用于主线程和 Runnable 实现类
 *            static void yiled() 线程让步，暂停当前线程，让步给其他优先级相同或者更高的线程
 *            join() 当某个程序执行流中调用其他线程的 join() 方法时，调用线程将被阻塞，知道 join() 方法加入的join线程执行完为止
 *            static void sleep(long millis) 令当前线程在指定时间内放弃对cpu的控制，使其他线程有机会执行
 *            stop() 强制线程生命周期结束
 *            boolean isAlive()  判断线程是否还活着
 *            wait()  必须在同步代码块或同步方法中，当前线程就会你购入阻塞状态，并释放同步监视器
 *            sleep() 可以在任何地方，不会释放同步监视器
 *            notify()  唤醒被 wait 阻塞的一个线程，如果有多个线程那么就唤醒优先级最高的
 *            notifyAll()  唤醒所有被 wait 的线程
 *  String 常用方法：
 *            int length()  返回字符串长度
 *            char chartAt(int index)  返回某处索引的字符串
 *            blloean isEmpty   判断是否空字符串
 *            String toLowerCase()    将字符串转为小写
 *            String toUpperCase()    将字符串转为大写
 *            Sting trim()            去掉首尾空格
 *            boolean equals(Object obj)  比较字符串内容是否相同
 *            boolean equalslgnoreCase(String anotherString)  与 equals 类似，忽略大小写
 *            String concat(String str)  连接字符串
 *            int compareTo(String anotherString)  比较两个字符串大小
 *            String substring(int beginIndex)  从index开始截取字符串
 *            String substring(int beginIndex,index endIndex)  截取beginIndex到endIndex的字符串
 *            boolean endsWith(String suffix)   判断字符串是否以特定字符结尾
 *            boolean startsWith(String prefix) 判断字符串是否以特定字符开始
 *            boolean startsWith(String prefix,int toffset)  判断字符串 index 处是否以特定字符开始
 *            boolean contains(CharSequence s)  当且仅当字符串包含指定 char 序列时，返回 true
 *            int indexOf(String str)   返回指定字符串的索引
 *            int lastIndexOf(String str) 返回指定字符串最后的索引
 *            int lastIndexOf(String str,int index)  从 index 开始返回指定字符串最后的索引
 *            String replace(char oldChar,char newChar)  返回 newChar 替换oldChar 的字符串
 *            String replace(CharSequence target,CharSequence replacement)    替换字符串的特定值
 *            String replaceAll(String regex,String str)    使用指定字符串替换正则匹配的字符串
 *            String replaceFirst(String regex,String str)  使用指定字符串替换正则匹配的第一个字符串
 *            boolean matches(String regex)  字符串是否包含正则匹配的值
 *            String[] split(String regex)   根据正则拆分字符串
 *            String[] split(String regex,int maxNum)  根据正则拆分字符串,不超过 maxNUm 个，超过了放在最后一个元素中
 *            char[] arr = str.toCharArray()   将字符串转换为 char[]
 *   StringBuffer 常用方法：
 *            StringBuffer append(xxx) 字符串拼接
 *            StringBuffer delete(int startIndex,int endIndex)  删除指定位置的字符串
 *            StringBuffer replace(int startIndex,int endIndex,String str)  替换指定位置的字符串
 *            StringBuffer insert(int,index,str) 在指定位置插入字符串
 *            StringBuffer reverse()  倒序
 *  time 类：
 *            LocalDate.now()  返回当前日期
 *            LocalTime.now()  返回当前时间
 *            LocalDateTime.now()  返回当前日期时间
 *            LocalDateTime.off(2020,11,11,11,11,11)  年月日时分秒
 *            .getDayOfMonth()  获取当前日所在月
 *            .getDayOfWeek()   获取当前周所在月
 *            .getMonth()       获取当前月
 *            .getMonthValue()  获取当前日所在月的数值
 *            .getMinute()      获取当前分
 *  Instart 类
 *            Instart.noew()  获取当前时间
 *  DateTimeFormatter 格式化或者解析日期、时间
 *  enum 枚举类
 *            values() 返回常量数组
 *  Collection 接口中的方法
 *              add()
 *              addAll(传入一个集合)
 *              isEmpty()    判断当前集合是否为空
 *              claer()      清空集合元素
 *              boolean contains(Object obj)  通过元素 equals 判断是否包含某个对象
 *              boolean ContainsAll(Collection c)  通过元素 equals 判断两个集合挨个比较是否包含
 *              remove(obj)   从当前集合移除某个对象
 *              removeAll(Collection c)  从当前集合中移除c集合的所有元素
 *              retainAll(Collection c)  返回两个集合的交集
 *              equals(Object obj)       判断两个集合是否完全相同
 *              hashCode()               返回当前对象的 hash 值
 *              .toArray()               将集合转为数组
 *              .Iterator                集合元素的遍历    
 *                        Iterator iterator =  collection.iterator()   
 *                        iterator.next()   
 *                        iterator.hasNext() 是否有下一个元素
 *                        iterator.remove()  移除迭代器中某个元素
 *                   遍历：
 *                        for(int a :arr)   把arr的值赋给 a 给 a 赋值不会改变 arr 的值
 *   Collection 的 List 子接口的方法
 *              void add(int index,Object ele)  在index处插入元素
 *              boolean addAll(int index,Collection c) 从index开始将Collection中的所有元素添加进来
 *              Object get(int,index)  获取指定index的元素
 *              int indexOf(Object obj)  返回obj在集合中首次出现的位置
 *              int lastIndexOf(Object obj)  返回obj在集合中最后出现的位置
 *              Object remove(int index)     移除指定位置的元素，并返回该元素
 *              Object set(int index,Object ele)  设置指定index位置的元素为ele
 *              List subList(int index1,int index2)  返回从index1到index2的元素集合
 *    Map 中的常用方法：
 *              Object put(Object key,Object value)  将制定key-value添加到或修改当前Map对象
 *              void putAll(Map m)                   将m中所有key-value放到当前Map中
 *              Object remove(Object key)            移除指定key-value，并返回value 
 *              void clear()                         清空当前Map中所有数据
 *              Object get(Object key)               获取指定key对应的value
 *              boolean containsKey(Object key)      是否包含指定key  
 *              boolean containsValue(Object value)  是否包含指定value  
 *              int size()                           返回Map中key-value的个数
 *              boolean isEmpty()                    判断当前Map是否为空
 *              boolean equals(Object obj)           判断当前Map和obj是否相等
 *              Set keySet()                         返回key所构成的Set集合
 *              Collection values()                  返回所有value构成的Collection集合
 *              Set entrySet()                       返回key-value构成的Set集合 
 *    Collections 中常用的方法
 *              reverse(List)                         反转List中元素的顺序
 *              shuffle(List)                         对List进行随机排序
 *              sort(List)                            根据元素自然顺序对指定List按升序排列
 *              sort(List,Comparator)                 根据指定的Comparator产生顺序对List集合元素进行排序
 *              swap(List,int index1,int index2)                将List index1 和index2互换
 *              
 *              
 *
 *
 */


/**
 *  1：javac a.java 将java文件编译为class文件
 *  2：java  a.java 运行java文件
 *  3：class hello {
 *      public static void main(String[] args){
 *        System.out.println(111);
 *      }
 *    }
 *  4：注释： 单行//   多行
 *  5：在一个java源文件中可以声明多个class，但是只能有一个class声明为public且类名鱼文件名相同
 *  6：程序的入库是main()方法  public static void main
 *  7：变量的类型
 *      基本数据类型：整数型：byte，short，int，long(以l或L结尾)
 *                    浮点类型：float(以f或F结尾)，double
 *                    字符型：cha r
 *                    布尔型：boolean
 *      引用数据类型：类：class
 *                    接口：interface
 *                    数组：[]
 *                    string
 *  8：强制类型转换：int b = (int)a 会导致精度丢失
 *  9：内存结构：
 *      栈，堆，方法区(常量池，静态域)
 *  10：数组：
 *      int[] arr = new int[4]
 *      int[][] arr1 = new int[][]{{1,2,3},{1,2},{1}}
 *      数组二分法查找数据：
 *        1：前提必须有序:
 *       2：个数为奇数时会进入死循环
 * 11：对象：
 *     类及类的成员            属性、方法、构造器；代码块、内部类
 *     面向对象的三大特性      封装性、继承性、多态性（抽象性）
 *     其他关键字              this、super、static、final、abstract、interface、package、import等
 * 12：JVM内存结构：
 *     栈：
 *     堆：
 *     方法区：类的加载信息，常量池，静态域
 * 13：具名对象： Phone p = new Phone()
 *     匿名对象： new Phone()
 * 14：重载：
 *       同一个类中允许定义多个重名的方法，但是必须参数列表不同，参数个数不同，参数类型不同(不会像js一样覆盖重名方法)
 * 15：可变个数形参
 *       public void show (String ... Str) (和js函数的...args差不多，但是js的...args只能放在最后)
 * 16；面向对象特征之一：封装与隐藏
 * 17：class的构造器：
 *        constructor：定义 class 中 constructor 默认和 calss 同名 class a{ class a(){} } 一个 class 中多个 constructor 也会重载
 *  18；this 关键字
 *       构造器的 this 指向这个类的所有构造器(包括重载的)，通过this(参数)调用不同构造器。且调用必须在首行，只能调用一次
 * 19：可以在一个类中声明另一个类
 * 20：类的继承 class a extends b
 * 21：类的方法重写：
 *        重写的方法名和参数完全相同
 *       重写会覆盖、重载参数不同
 *       子类权限修饰符不小于父类
 *       子类不能重写父类 priveate 方法，因为权限太小了
 *       返回值除了void 其他的子类返回值应该是父类返回值类型的子类
 *       子类抛出异常的类型应该是父类异常类型的子类
 *       在不同包中的子类不能调用父类的 preiveate 和 缺省，能调用 protected
 *       在同一工程下的子类只能调用父类的 public
 * 
 * 22：super
 *       super. 指向父类，和 this 区别：子类父类属性重名==>this.子类、super.父类
 *       super() 直接调用父类的构造器，通过不同参数调用不同构造器，只能写在首行
 * 23：多态性
 *       父类的引用指向子类的对象 Person p2 = new Man()  先访问的是子类，子类没有在访问父类
 *       编译看左边、执行看右边：编译时调用的是父类，执行时调用子类
 *       多态性只适用于方法不适用于属性，属性都是访问的父类
 *       不能直接调用子类特有的属性和方法。使用强制类型转换符 Man a = (Man)b
 * 24：单元测试：Junit
 * 25：包装类：
 *       8种基本数据类型都有包装类
 * 26：自动装箱和自动拆箱
 *       自动装箱：int a = 10；Interger b = a；
 *       自动拆箱：int c = b；
 * 27：static
 *       static  修饰属性：静态变量。
 *               多个实例共用一个静态变量
 *               类加载的同时就加载一次，存在方法区的静态域
 *       static 修饰方法：
 *               随着类的加载而加载
 *               静态方法中，只能调用静态方法或属性
 *               不能使用 this 、 super 关键字
 * 28：java 32种设计模式！
 *     单例设计模式：
 *         1.饥汉式
 *             一个类只能存在一个实例对象。
 *             将类的构造器设置为private，然后调用该类的静态方法返回类内部创建的对象(静态方法只能访问静态属性)，所以指向类内部产生该类对象的变量也必须是静态的
 *             class Bank{
 *               private Bank(){}
 *               private static Bank a = new Bank();
 *               public static Bank getA(){
 *                 return a
 *               }
 *             }
 *         2.懒汉式
 *             class Bank{
 *               private Bank(){}
 *               private static bank instance = null;
 *               public static getA(){
 *                 if(instance==null){     会涉及到多线程安全性问题
 *                   instance  new Bank()
 *                 }
 *                 return instance
 *               }
 *             }
 * 29：main() 方法的使用说明
 *       1.程序入口
 *       2.普通的静态方法
 * 30：类的成员之四：代码块 {} / static{}
 *       1.用来初始化类、对象
 *       2.代码块如果有修饰的话，只能使用 static
 *       3. static{} 随着类的加载而执行，只执行一次
 *       4.{} 随着对象的创建而执行，每创建一个对象就执行一次，可以进行属性赋值
 *       5.静态代码块只能调用静态结构，非静态代码块都可以调用
 *       6.父类的静态代码块先执行，在执行子类
 * 31：属性赋值的先后顺序：
 *       默认初始化--显式初始化/代码块赋值--构造器初始化--实例对象.xxx
 * 32：final：最终的
 *       1.修饰一个类就不能被继承
 *       2.修饰一个类的方法子类就不能重写
 *       3.修饰一个变量就称为常量，不能改变了
 * 33：abstract 抽象类和抽象方法
 *       1.抽象类：一旦修饰了类，这个类就不能被实例化
 *       2.抽象方法：只有方法声明没有方法体，包含抽象方法的类一定是抽象类
 *       3.子类重写父类所有抽象方法后才能实例化，否则子类也是抽象类
 *       4.不能修饰属性、构造器、代码块、私有方法
 * 34：抽象类的匿名子类
 *       1. Peron s = new Person({ public void aaa(){}... 需要重写所有方法 })
 * 35：模板方法的设计模式
 *         父类定义一个抽象方法然后子类重写这个抽象方法
 *         父:this.xxx() ...  public abstract void xxx()
 * 36：接口
 *           1.接口和类是并列的
 *           2.JDK7 以前：只能呢定义常量和抽象方法
 *                       全局常量：public static final 可以省略不写(默认的)
 *                       抽象方法：public abstract
 *                       interface a{
 *                             public static final b = 1;
 *                             public sbstract void c();
 *                       }
 *                       可以直接通过 a.b 、 a.c()
 *             JDK8：除了定义全局常量和抽象方法之外，还可以定义静态方法、默认方法
 *                       1.静态方法：只能通过接口调用(全局的，直接调用就行)
 *                                 public static void a(){}
 *                        2.默认方法：通过实现类的实例对象可以调用接口的默认方法
 *                                  public default void b(){
 *                       3.如果子类有同名方法(不是重写的)那么默认调用父类的方法(类优先原则)
 *                       4.如果子类实现了多个接口，那么必须重写多个重名方法，不然会报错
 *           3.接口中不能定义构造器，所以接口不能实例化
 *           4.接口通过让类去实现(implements)的方式使用，如果此类重写了接口中所有方法那么这个类就不是抽象类，就能被实例化
 *             class a1 implements a{
 *                public void c()
 *              }
 *           5.类可以实现多接口性--弥补了单继承性的局限性
 *             class A extends B implements C,D,E
 *           6.接口和接口之间可以多继承
 *           7.接口的使用可以体现多态性
 *           8.接口上，实际上就是一种规范
 *           9.接口属性都是常量，在子类中不能直接访问
 *  37：代理：Proxy
 *             1.接口提供一个方法 interface NetWork{ public void browse(); }
 *             2.被代理类重写这个方法 class Server implements NetWork{ public void browse() { } }
 *             3.代理类  在构造器里定义一个属性指向被代理类 public ProxyServer(NetWork work){ this.work = work;
 *                       然后重写接口的方法让被代理类去调用(使用this调用会死循环) public void browse() { work.browse();
 * 38：类的成员之五：内部类
 *       1.将一个类A声明定义在另一个类B中，A就是内部类，B就是外部类
 *       2.内部类：
 *               成员内部类(静态、非静态)
 *                   作为类的成员：
 *                                 调用外部内的结构
 *                                 可以被 static 修饰
 *                                 可以被四种不同权限修饰
 *                       创建实例：
 *                           A.B b = new A.B()
 *                   作为一个类：
 *                                 类内可以定义属性、方法、构造器等
 *                                 可以被 final 修饰，可以被继承
 *                                 可以被 abstract 修饰
 *                       创建实例：
 *                           A.B b = new A.new B()
 *               局部内部类(方法类、代码块、构造器内) public B get(){ class MyB implements B {} return new MyB()  }
 *                   在局部内部类的方法中，如果想要调用局部内部类的变量，要求这个变量声明为 final
 *   39：多线程运行：Thread
 *         方式一：
 *           1.创建一个继承与 Thread 的子类
 *               class A extends Thread
 *           2.重写 Thread 的 run 方法，将此线程执行的声明放在 run() 中  
 *               public void run(){}
 *           3.创建 Thread 类子类的实例对象  
 *               A a = new A()
 *               A a1 = new A()
 *           4.通过实例对象调用 start()      
 *               A.start()   (启用当前线程，调用当前线程 run() 方法)
 *         方式二：实现 Runable 接口  开发常用
 *           1.创建一个实现了 RUnable 接口的类                                         
 *               class A implements Runable{}
 *           2.实现类去实现 Runable 中的抽象方法 run()                                 
 *               public void run(){}
 *           3.创建实现类的实例对象                                                    
 *               A a = new A()
 *               A a1 = new A()
 *           4.将此对象作为参数传递到 Thread 类的构造器中，创建 Thread 类的实例对象     
 *               Thread B = new Thread(A)   形成多态
 *           5.通过 Thread 类的实例对象调用 start()                                    
 *               B.start()
 *   40：线程的生命周期
 *         1.新建
 *         2.就绪  调用 start()    sleep时间到了 join结束  notify()  notifyAll()  resume()
 *         3.运行
 *         4.阻塞  sleep(long time )  join()  suspend()
 *         5.死亡  run()  stop()  Error()
 *   41：线程的同步             
 *         1.同步监视器 synchronized(锁){ 同步代码 }
 *             要求多个线程必须共用一把锁(任何实例对象都可以充当锁)
 *             变相的将多线程变为单线程
 *         2.同步方法 private synchronized void A(){ 代码 }
 *             使用 Runable 接口的方式不需要锁(默认 this )
 *             使用 extends Thread 的方式 需要 private static synchronized void A(){ 代码 }
 *         3. 共享数据：多个县城共同操作的数据，需要使用同步机制将共享数据代码包起来
 *   42：死锁：不同线程分别占用对方需要的同步资源不放弃
 *   43：Lock 锁：
 *       1.实例化 ReentrantLock： private ReentrantLock lock = new  ReentrantLock()
 *       2.在 try 中调用锁定方法 lock()    lock.lock()
 *       3.在 finally 中调用解锁方法 unlock()  lock.unlock()
 *   44：线程的通信
 *   45：新增的线程创建方法
 *       1.实现 Callable 接口
 *           class A implements Callable {
 *             public Object call() throws Exception{
 *               return xxx
 *             }
 *           }
 *       2.创建实例对象
 *           A a = new A()
 *           FutureTask b = new FutureTask(A)
 *       3.获取回调返回值
 *           Object c = b.get()
 *   46：使用线程池创建线程
 *       corePoolSize：核心池的大小
 *       maximunPoolSize：最大线程数
 *       keepAliveTime：线程没有任务时最多保持多长时间会终止
 *       ExecutorService：真正的线程池接口
 *       Executors：工具类
 *       1.创建
 *           ExecutorService a = Executors.newFixedThreadPool(nThreads:10)
 *           a.execute(new B())  适合使用于 Runnable
 *           // a.submit()  适合使用于 Callable
 *       2.配合 Runnable 使用
 *           class B implements Runnable { public void run(){} }
 *       2.
 *   47： String 类
 *       1. String 类声明为 final ，不可被继承
 *       2. String 实现了 serializable 表示字符串是支持序列化的
 *                 实现了 Comparable 表示 Strign  是可以比较大小的
 *       3 String 内部定义了 final char [] value 用来储存字符串数据
 *   48： String 与其他类型的转换
 *       1. int num = Interger.parseInt(str);  调用包装类的静态方法 parsexxx
 *       2. String str = String.valueOf(num);  调用 String 重载的 valueOf 方法
 *       3. char[] arr = str.toCharArray()
 *       4. String str = new String(new char[]{'1','2','3'})
 *   49： String StringBuffer StringBuilder
 *       1. String : 不可变的字符串序列，底层用 char[] 储存
 *          StringBuffer 可变的字符序列，线程安全，效率低，底层用 char[] 储存
 *          StringBuilder 可变的字符串序列，线程不安全，效率高，底层用 char[] 储存
 *       2. 创建 String 时，是创建了一个空数组 char[]
 *          创建 StringBuffer 时，是创建了一个多加16长度的数组 char[str.length+16]
 *               当 StringBuffer append 超过16次时，就要扩容，默认扩容原来的2倍+2，还不够就拿需要扩容的长度
 *    50：日期和时间的API
 *      JDK8之前：
 *        1. currentTimeMillis()  返回和标准时间的时间差
 *        2. SimpleDateFormat     
 *            1. new SimpleDateFormat 的实例
 *            2.实例.format(Date) 格式化时间转为字符串   实例.parse(str) 字符串转时间
 *        3. Calendar 日历类(抽象类，不能实例化)  不重要
 *            1.创建子类(GregorianCalendar)的实例 /   调用静态方法 getInstance()
 *      JDK8之后：
 *        1.   time
 *        2.   Instart
 *        3.   DateTimeFormatter
 *    51：对象比较大小(排序)：自然排序、定制排序
 *        也可以 public static  A implements Comparable 
 *        然后重写 public int compareTo(Object obj){}
 *        1. Comparable：自然排序   a.Comparable(b)
 *        2. Comparator：定制排序   Comparator(a,b)
 *    52： System 类
 *    53： Math 类
 *    54： Biginteger 类
 *    55： BIgDecimal
 *    56： 枚举类：
 *            自定义枚举类：
 *                class Season{
 *                  private final String a;               1.声明对象属性并用 final 修饰
 *                  private Season (String a){
 *                    this.a = a                          2.私有化类的构造器，并给对象属性赋值
 *                  }
 *                  public static final Season A = new Season ('a')   3.提供当前枚举类的多个对象
 *                }
 *                4.使用： Season b = new Season.A
 *            Enum 枚举类
 *                enum{
 *                    A('11111')
 *                }
 *                1. values 返回枚举类的常量
 *                2. valueOf(str)  根据指定值找到对应独享
 *    57：注解：
 *          1. @Override         重写父类方法
 *          2. @Deprecated       表示所修饰的元素过时
 *          3. @SuppressWarnings 抑制编译器警告
 *          4. 自定义注解          
 *              public @interface AAA{  String value() 可以不要返回值，要的话就必须传参  }   @AAA(value=:"hi")
 *          5. 元注解： 对现有注解进行解释说明的注解
 *                Retention       指名修饰 Annotation 的生命周期                    SOURCE  CLASS  RUNTIME
 *                Target          用于指定被修饰的 Annotation 能用于哪些程序元素    
 *                Documented      所修饰的的注解在被 javadoc 解析时，保留下来       
 *                Inherited       被修饰的 Annotation 具有继承性                    
 *    58： 集合框架 和数组不同
 *          数组一创建长度和类型就确定了，增删改查效率不高
 *          1. Collection         单列集合，用来存储一个一个的对象
 *              List              储存有序的、可重复的数据      ==>动态数组
 *                    ArrayList  LinkedList  Vector
 *              Set               储存无序的、不可重复的数据(打印的顺序和储存的顺序不一致，根据hash排序。添加时如果equals为true就不添加)
 *                    HashSet    LinkedHashSet  TreeSet  
 *          2. Map                双列集合，用来储存键值对 key-value
 *                    HashMap   LinkedHashMap  TreeMap  Hashtable  Properties
 *          3. Collection 接口中的方法的使用
 *              Collection a = new ArrayList()
 *              a.add("length")
 *              a.size()  // 1
 *    59：Collection 的 List 子接口
 *        1. ArrayList  作为 List 接口的主要实现类，线程不安全，效率高，底层使用Object[] elementData储存
 *           LinkedList 对于频繁的插入删除操作，效率比 ArrayList 高，底层使用双向链表储存
 *           Vector     线程安全，效率低，底层使用Object[] elementData储存
 *           ArrayList 底层：
 *                      ArrayList arr= new ArratList()  底层 elementData 初始化为 {}
 *                      arr.add(123)    第一次调用add时，底层创建了长度为10的数组并将123添加到 elementData 中 。
 *                      默认情况下，扩容为原来的1.5倍，同时将原有数组中的数据复制到心数组中       懒汉式，延迟数组创建，节省内存
 *          LinkedList 底层：
 *                      LinkedList arr = new LinkedList() 内部声明 node 类型的first和last属性，默认值为null
 *                      arr.add(123)  将123封装到node中，创建了node对象
 *    60：Collection 的 Set 子接口  
 *        1. HashSet： 作为 Set 接口的主要实现类，线程不安全，可以存 null
 *           LinkedHashSet：  遍历时可以按照添加的顺序遍历，添加时多了两个变量来维护添加的先后顺序
 *           TreeSet：  可以按照添加对象的指定顺序进行排序。只能添加同一类的对象(int arr[])
 *                      自定义的类必须实现 implements Comparable 然后重写 compareTo 方法
 *    61： Map  
 *          key   是无序的不可重复，使用Set储存key            -->key所在的类要重写equals和hashCode
 *          value 是无序的可重复的 ，使用Collection储存value  -->value所在的类要重写equals
 *          一对 key-value 构成了一个 Entry
 *          Map 中 Entry 是无序的、不可重复的，使用Set储存所有的Entry
 *            HashMap           作为Map的主要实现类，效率高，线程不安全，储存null的key和value
 *            LinkedHashMap     保证在遍历map元素时，可以按照添加的顺序遍历，(添加时多了两个变量来维护添加的先后顺序)
 *            TreeMap           保证按照添加的key-value排序，实现排序遍历，此时考虑key的自然排序或定制排序，底层使用数组+链表+红黑树
 *            HashTable         效率低，线程安全，不能储存null的key和value
 *            Properties        用来处理配置文件，key和value都是string
 *    62： Properties 读取配置文件
 *          Properties p = new Properties()
 *          FileInputStream f = new FileInputStream(name:'xxx')
 *          p.load(f)
 *          String name = p.getProerty("name")
 *    63： Collections : 操作 Collect 和 Map 的工具类
 *    64： 泛型：主要用来限制参数类型
 *          ArrayList<Integer> list = new ArrayList<Integer>()     不能使用基本数据类型
 *            
 *               
 * 
 */