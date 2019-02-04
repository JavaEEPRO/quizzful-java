
===================oop====================
1. pak2.B extends pak1.A.java (doAThings()) -      A

2. Foo.java -                                      compil.Err

3. Main.java -                                     Parent                                      
   Parent.java                                     Child
   Child.java extends Parent                       Parent

4. NewClass.java -                                 1 Base.Base() 2 Sub.Sub()
                                                   1 Base.Base()
                                                   
5. Impl.java implements One, Two -                 FileNotFoundException
   One.java (I) (method() throws FNFE)
   Two.java (I) (method() throws IOE
                       
6. Test.java (&& ||) -                             x:6  y:2

7. Top.java -                                      compil.Err

===================fundamental====================
1. Clazz.java -                                    static init
                                                   main
                                                   non-static init
                                                   
2. ExceptionHandling.java (1.0d/0) -               unreachable
                                                   reachable
                                                   unreachable
                       
3. Initable.java -                                 Инициализация Initable2

4. Main.java -                                     true a+b=1

5. Main.java (new Main().new Test().new Test()) -  compil.Success, empty stdout
   Test.java extends Main

5. MyClass.java -                                  MyClass.main(String...args).d=2.7

6. Test.java (switch) -                            compil.Err

7. Test.java ((float)(0.3+0.4)==(0.3f+0.4f)) -     false

8. Test.java (static int b=Test.a;) -              a=3, b=0 runtime.Err
              static int a =3;
              static {System.out.print("a="+a..b)}

9. TestRegExp.java ( exam. ) -                     \\s.  .\\s  \\s(.)  \\s\\.

n. (byte x=0; byte y=(--x<0)? ++x:-x;) -           compil.Err

n. (передача параметров в Java) -                  >примитивные типы передаются по значению
                                                   >ссылки на объекты передаются по значению
                                                   
n. (for(1..<10) { if(k%2==0) {continue;}} -        4
   System.out.print("Test")

===================generics-collections====================
1. StartClass.java -                               compil.Err (4,7)
   Test<T>.java
  
2. Test.java (removeAndPrint(List<String> list)) - runtime.Err
              main(String[] args)

3. Test.java (main(String[] args) -                runtime.Err
              list.remove(e1);
              list.remove(e2);
              
4. Test<T>.java (implements Iterable<T>) -        Hello world !     
  
4a Test<T>.java (implements Iterator<T>) -        compil.Err (1,4)  
  
5. User.java (userSet.add("John");) -             userSet.size() == 3 
   Foo.java           add "Bill","John"
   
n. (Set<Integer> numbers = new LinkedHashSet<>) - ConcurrentModificationException
  for(Integer i: numbers) {
  if(i%2==0) {numbers.remove(i)}}

===================threads====================
1. Checker.java -                                  unexpected result  
   Changer.java
   Data.java
   ThreadTest.java
   
2. ClassRoll.java -                               mark changeRoll(Student stud)  as synchronized
   Student.java                                        isInRoll(Student stud) synchronized
   
3. ExampleThread.java extends Thread -            01234ABCDE
    (CountDownLatch, Semaphore)
    
4. MyRunnable.java implements Runnable -          Thread!
   MyThread.java extends Thread                   Thread!
    
===================standartLibrary===================
1. Formatting.java -                              true|false|true|false|true
2. MatchTest.java (water) -                       Match not found 

3. SystemProperties.java -                        threetwonull

n. checked Exceptions -                           InterruptedException

n. классы, относ. к checked Exception -           Throwable, Exception

===================inner-classes====================
1. Test.java -                                    System.out..println(Test.this.helloString)

