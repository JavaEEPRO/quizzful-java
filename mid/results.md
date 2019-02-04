
===================oop====================
1. Foo.java -                                      compil.Err

2. NewClass.java -                                 1 Base.Base() 2 Sub.Sub()
                                                   1 Base.Base()
                       
3. Test.java (&& ||) -                             x:6  y:2

4. Top.java -                                      compil.Err

===================fundamental====================
1. Clazz.java -                                    static init
                                                   main
                                                   non-static init
                       
2. Initable.java -                                 Инициализация Initable2

3. Main.java -                                     true a+b=1

4. MyClass.java -                                  MyClass.main(String...args).d=2.7

5. Test.java (switch) -                            compil.Err

n. (byte x=0; byte y=(--x<0)? ++x:-x;) -           compil.Err

n. (передача параметров в Java) -                  >примитивные типы передаются по значению
                                                   >ссылки на объекты передаются по значению

===================generics-classes====================
1. Test.java (removeAndPrint(List<String> list)) - runtime.Err
              main(String[] args)

2. Test.java (main(String[] args) -                runtime.Err
              list.remove(e1);
              list.remove(e2);
              
3. Test<T>.java -                                  Hello world !              

===================threads====================
1. Checker.java -                                  unexpected result  
   Changer.java
   Data.java
   ThreadTest.java
   
2. ClassRoll.java -                               mark changeRoll(Student stud)  as synchronized
   Student.java                                        isInRoll(Student stud) synchronized

===================standartLibrary===================
1. SystemProperties.java -                        threetwonull

n. checked Exceptions -                           InterruptedException

n. классы, относ. к checked Exception -           Throwable, Exception

===================inner-classes====================
1. Test.java -                                    System.out..println(Test.this.helloString)

