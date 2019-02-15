
===================oop====================
1. pak2.B extends pak1.A.java (doAThings()) -          A

2. A.java -                                            a.i=1  1  a.getI()=1  b.i=0  1  b.getI()=1  i=0  13  i=1  14
   B.java extends A                                    
   Tasks.java
   
3. Alpha.java  (doStuff()) -                           Код компилируется без ошибок
   Beta.java extends Alpha

4. Foo.java -                                          compil.Err         (+в строке 1)

5. Jack.java -                                         100
   RichJack.java extends Jack

6. Main.java -                                         Parent                                      
   Parent.java                                         Child
   Child.java extends Parent                           Parent

7. NewClass.java -                                     1 Base.Base() 2 Sub.Sub()
                                                       1 Base.Base()
                                                   
8. Impl.java implements One, Two -                     FileNotFoundException
   One.java (I) (method() throws FNFE)
   Two.java (I) (method() throws IOE
                       
9. Test.java (&& ||) -                                 x:6  y:2

10.Top.java -                                          compil.Err

===================fundamental====================
1. Clazz.java -                                        static init
                                                       main
                                                       non-static init
                                                   
2. ExceptionHandling.java (1.0d/0) -                   unreachable
                                                       reachable
                                                       unreachable
                       
3. Initable.java -                                     Инициализация Initable2

4. Main.java -                                         true a+b=1

5. Main.java (new Main().new Test().new Test()) -      compil.Success, empty stdout
   Test.java extends Main

6. MyClass.java -                                      MyClass.main(String...args).d=2.7

7. Overload.java (Object, Number, Float) -             Float

8. StringDestroyer.java (Sout("hello");) -             World

9. Test.java (switch(long)) -                          compil.Err

9a Test.java (switch(i&01) -                           Case1 Case2 Default Case3

10.Test.java ((float)(0.3+0.4)==(0.3f+0.4f)) -         false

11.Test.java (static int b=Test.a;) -                  a=3, b=0 runtime.Err
              static int a =3;
              static {System.out.print("a="+a..b)}
              
12.Test.java (NON-STATICvoid division(int a, int b)) - compil.Err  

13.Test.java (-1==(y>>1);(-1>>>1)==Integer.MAX_VALUE)- true true true
              -1==(byte)(x>>>4)
              
14.Test.java -                                         true
   TestClone.java implements Cloneable
   
15.Test.java (package question;                 -      Test.methodPublic  Test.methodProtected Test.methodPrivate        
              import java.lang.reflect.Method;)   

16.TestRegExp.java ( exam. ) -                         \\s.  .\\s  \\s(.)  \\s\\.

17.User.java ( int hashCode() {return id +...} -       runtime.Err

n. (byte x=0; byte y=(--x<0)? ++x:-x;) -               compil.Err

n. (передача параметров в Java) -                      >примитивные типы передаются по значению
                                                       >ссылки на объекты передаются по значению
                                                   
n. (for(1..<10) { if(k%2==0) {continue;}} -            4
   System.out.print("Test")
   
n. сигнатуры, соотв. стандартам имен JavaBeans -       public void addSomeListener(SomeListener l)   

n. (double x=2./0, y=-1/0; Sout(x+y);) -               ArithmeticException

n.  импортированный, но не использ. пакет повлияет -   никак не повлияет
    ли на размер байткода?
  
n. В каких фрагм. кода не будет ошибки компил. -       float f = '1'; float f = 1F;  

n. String s = "BIRD" (CAT GOAT FROG) -                 compil.Err

===================generics-collections====================
1. ClassA<U> implements Comparable<U>                  class ClassC<U,V> extends ClassA<U> {}
                                                       class ClassE<U> extends ClassA<Comparable<Number>> {}
                                                       class ClassF<U extends Comparable<U> & Serializable> extends
                                                                                               ClassA<Number> {}

2. Main.java (List<?> l... l.add("a")) -               compil.Err

3. StartClass.java -                                   compil.Err (4,7)
   Test<T>.java
  
4. Test.java (removeAndPrint(List<String> list)) -     runtime.Err
              main(String[] args)

5. Test.java (main(String[] args) -                    runtime.Err
              list.remove(e1);
              list.remove(e2);
              
6. Test<T>.java (implements Iterable<T>) -             Hello world !     
  
6a Test<T>.java (implements Iterator<T>) -             compil.Err (1,4) 
   
7. TestSet.java (что верно по отнош. к след. коду) -   Значения HashSet не упорядочены, не отсортированы и не имеют дубликатов                                    
  
8. User.java (userSet.add("John");) -                  userSet.size() == 3 
   Foo.java           add "Bill","John"
   
9. Q3.java -                                           ConcurrentModificationException   

10.Q11.java -                                          compil.Err (в строке 11)
   
n. (Set<Integer> numbers = new LinkedHashSet<>) -      ConcurrentModificationException
  for(Integer i: numbers) {
  if(i%2==0) {numbers.remove(i)}}

n. интерфейс NavigableMap extends... -                 SortedMap, Map

===================threads====================
1. Checker.java -                                      unexpected result  
   Changer.java
   Data.java
   ThreadTest.java
   
2. ClassRoll.java -                                    mark changeRoll(Student stud)  as synchronized
   Student.java                                        mark isInRoll(Student stud) as synchronized
   
3. ExampleThread.java extends Thread -                 01234ABCDE
    (CountDownLatch, Semaphore)

4. MainClass.java -                                    1 поток, т.к вызывается метод run() у Thread() а не start()
    
5. MyRunnable.java implements Runnable -               Thread!
   MyThread.java extends Thread                        Thread!
   
6. My11.java (removeEldestEntry() is overwritten!) -   {3=str3, 4=str4, 2=str2}   
    
7. Test.java extends Thread -                          Напечатается "Ex-B" и выбросится исключение   

8. Test.java (private static class Resource) -         Рано или поздно программа зайдет в тупик (deadlock)

9. Test.java implements Runnable -                     В коде есть три ошибки
===================standartLibrary===================
1. Formatting.java -                                   true|false|true|false|true

2. Main.java (StringBufer equals String ?) -           false,false

3. MatchTest.java (water) -                            Match not found 

4. PrintfTest.java -                                   3.9 4.0

5. SystemProperties.java -                             threetwonull

n. checked Exceptions -                                InterruptedException

n. классы, относ. к checked Exception -                Throwable, Exception

n. (String input = "AA BB CC";) -                      compil.Err
   Scanner s=new Scanner(input).useDelimeter("\s")

n. String[] slist={"Ted",Bill,Jack,Roy,Adam,Stan} -    Ted Bill David Roy Mark Stan

n. Что верно о классах StringBufer и StringBuilder-    StringBuilder эффективнее для однопоточных приложений, а для многопоточных -
                                                       требуется дополнительная синхронизация

===================inner-classes====================
1. Test.java -                                         System.out..println(Test.this.helloString)

2. Test.java -                                         onetwothree

3. Outer.java -                                        Outer o = new Outer(); o.new Inner();
   Starter.java                                        new Outer().new Inner();
