# Design_Patterns
This includes most essential design patterns including singleton, factory, abstract factory, observer, builder, prototype, strategy, template method, adapter, facade, decorator design patterns in java
Below is the various patterns and the their use cases and implementations.

1->Singleton Design pattern

  Singleton pattern is a design solution where an application wants to have one and only one instance of any class, in all possible scenarios without any exceptional condition. This is a design pattern where an instance of a class is created much before it is actually required. Mostly it is done on system startup. In an eager initialization singleton pattern, the singleton instance is created irrespective of whether any other class actually asked for its instance or not.One of the main advantages of using the singleton pattern is that it can reduce the memory usage of your application. By creating only one instance of a class, you can avoid allocating and deallocating memory for multiple objects of the same type.Singleton is a creational pattern. This pattern ensures that there is only one instance of a class and provides a global access point for this object.When you need to provide a point for global access to an object. In other words, you need to make the object available from anywhere in the program.It’s not enough to simply create a global variable, if it’s not write-protected: anyone can change the variable’s value, so the object’s global access point might be lost. These properties of a Singleton are necessary, for example, when you have an object that works with a database, and you need to access the database from different parts of the program. A Singleton will ensure you that no one can write code that replaces the previously created instance.


2->Factory Design Pattern

   If object creation code is spread in the whole application, and if you need to change the process of object creation then you need to go in each and every place to make necessary changes. After finishing this article, while writing your application, consider using the Java factory pattern.Factory pattern introduces loose coupling between classes which is the most important principle one should consider and apply while designing the application architecture. Loose coupling can be introduced in application architecture by programming against abstract entities rather than concrete implementations. This not only makes our architecture more flexible but also less fragile.Factory pattern is most suitable where there is some complex object creation steps are involved. To ensure that these steps are centralized and not exposed to composing classes, factory pattern should be used.
pros->The creation of an object precludes its reuse without significant duplication of code.
->The creation of an object requires access to information or resources that should not be contained within the composing class.->The lifetime management of the generated objects must be centralized to ensure a consistent behavior within the application.


3->Abastract Factory Design Pattern

Abstract factory pattern is yet another creational design pattern and is considered as another layer of abstraction over factory pattern. In this tutorial, we will expand the scope of car factory problem discussed in factory pattern. We will learn when to use factory pattern by expanding scope of car factory and then how abstract factory pattern solves the expanded scope.We already have seen the use case scenarios of Factory pattern so whenever you need another level of abstraction over a group of factories, you should consider using the abstract factory pattern. It is probably only difference between factory pattern vs abstract factory pattern.


4->Prototype Design pattern

A prototype is a template of any object before the actual object is constructed. In java also, it holds the same meaning. Prototype design pattern is used in scenarios where application needs to create a number of instances of a class, which has almost same state or differs very little.In this design pattern, an instance of actual object (i.e. prototype) is created on starting, and thereafter whenever a new instance is required, this prototype is cloned to have another instance. The main advantage of this pattern is to have minimal instance creation process which is much costly than cloning process.Please ensure that you want to deep clone or shallow clone your prototype because both will have different behavior on runtime. If deep copy is needed, you can use a good technique given here using in memory serialization.Prototype : This is the prototype of actual object as discussed above.Prototype registry : This is used as registry service to have all prototypes accessible using simple string parameters.Client : Client will be responsible for using registry service to access prototype instances.


5->Builder Design Pattern

The builder pattern is a design pattern that allows for the step-by-step creation of complex objects using the correct sequence of actions. The construction is controlled by a director object that only needs to know the type of object it is to create.he only big difference between the builder pattern and the abstract factory pattern is that builder provides us more control over the object creation process, and that’s it. Apart from it, there are no major differences.Builder pattern aims to “Separate the construction of a complex object from its representation so that the same construction process can create multiple different representations.”builder pattern helps us in creating immutable classes with a large set of state attributes.
Advantages:
Undoubtedly, the number of lines of code increases at least to double in the builder pattern, but the effort pays off in terms of design flexibility and much more readable code.
The parameters to the constructor are reduced and are provided in highly readable chained method calls. This way there is no need to pass in null for optional parameters to the constructor while creating the instance of a class.
Another advantage is that an instance is always instantiated in a complete state rather than sitting in an incomplete state until the developer calls (if ever calls) the appropriate “setter” method to set additional fields.
And finally, we can build immutable objects without much complex logic in the object building process.
Disadvantages:
Though the Builder pattern reduces some lines of code by eliminating the need for setter methods, still it doubles up total lines by introducing the builder object. Furthermore, although client code is more readable, the client code is also more verbose. Though for me, readability weighs more than lines of code.


6->Adapter Design pattern

Adapter design pattern is one of the structural design pattern and its used so that two unrelated interfaces can work together. The object, that joins these unrelated interfaces, is called an Adapter. or “Convert the interface of a class into another interface clients expect. Adapter lets classes work together that couldn’t otherwise because of incompatible interfaces”. An adapter pattern is also known as Wrapper pattern as well. Adapter Design is very useful for the system integration when some other existing components have to be adopted by the existing system without sourcecode modifications.Where to use Adapter Design Pattern?->
The main use of this pattern is when a class that you need to use doesn’t meet the requirements of an interface. e.g. If you want to read the system input through command prompt in java.Target (BufferedReader): It defines the application-specific interface that Client uses directly.Adapter (InputStreamReader): It adapts the interface Adaptee to the Target interface. It’s middle man.Adaptee (System.in): It defines an existing incompatible interface that needs adapting before using in application.Client: It is your application that works with Target interface.


7->Strategy Design Pattern

Strategy design pattern is behavioral design pattern where we choose a specific implementation of algorithm or task in run time – out of multiple other implementations for same task.The important point is that these implementations are interchangeable – based on task a implementation may be picked without disturbing the application workflow.Strategy pattern involves removing an algorithm from its host class and putting it in separate class so that in the same programming context there might be different algorithms (i.e. strategies), which can be selected in runtime.Strategy pattern enables a client code to choose from a family of related but different algorithms and gives it a simple way to choose any of the algorithm in runtime depending on the client context.In Strategy pattern, we first create an abstraction of algorithm. This is an interface having the abstract operation. Then we create implementations of this abstraction and these are called strategies.
A client will always call the abstraction, and will pass a context object. This context object will decide which strategy to use.Combination of Collections.sort() and Comparator interface is an solid example of Strategy pattern.


8->Template Design Pattern

Template method design pattern is widely accepted behavioral design pattern to enforce some sort of algorithm (fixed set of steps) in the context of programming.It defines the sequential steps to execute a multi-step algorithm and optionally can provide a default implementation as well (based on requirements).Applicability of template method pattern. When we have pre-defined steps to achieve some algorithm.When we want to avoid duplicating code, moving the common implementation and steps in the base class.Key Design Points
Mark template method as final so that implementing class can’t override and change the order of steps.
In base class, implement all the methods with default implementation so the derived classes need not to define them.Mark all methods abstract which derived classes must implement.Popular implementations of template method pattern These are few popular existing implementations of template method design pattern.
Non-abstract methods of InputStream, OutputStream, Reader, Writer from Java IO.
Non-abstract methods of some abstract collection classes like AbstractList, AbstractSet, AbstractMap etc.
Template pattern is a very easy design pattern which is used to define and enforcing certain sequential algorithm steps in programming paradigm. It helps in defining the skeleton of an algorithm, which shall not be overridden in sub classes.


9->Obeserver Design Pattern

 observer pattern defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically. It is also referred to as the publish-subscribe pattern.In observer pattern, there are many observers (subscriber objects) that are observing a particular subject (publisher object). Observers register themselves to a subject to get a notification when there is a change made inside that subject.A observer object can register or unregister from subject at any point of time. It helps is making the objects objects loosely coupled.when you have a design a system where multiple entities are interested in any possible update to some particular second entity object, we can use the observer pattern.The flow is very simple to understand. Application creates the concrete subject object. All concrete observers register themselves to be notified for any further update in the state of subject.
As soon as the state of subject changes, subject notifies all the registered observers and the observers can access the updated state and act accordingly.A real world example of observer pattern can be any social media platform such as Facebook or twitter. When a person updates his status – all his followers gets the notification.The observer pattern has four participants.
Subject – interface or abstract class defining the operations for attaching and de-attaching observers to the subject.ConcreteSubject – concrete Subject class. It maintain the state of the object and when a change in the state occurs it notifies the attached Observers.Observer – interface or abstract class defining the operations to be used to notify this object.ConcreteObserver – concrete Observer implementations.


10->Facade Design Pattern

Facade pattern is one of structural design pattern among other Gang of Four design patterns. The facade pattern is appropriate when we have a complex system that we want to expose to clients in a simplified way. Its purpose is to hide internal complexity behind a single interface that appears simple from the outside.
Facade also decouples the code that uses the system from the details of the subsystems, making it easier to modify the system later. Advantages of facade pattern
Remember facade does not reduce the complexity. It only hides it from external systems and clients. So the primary beneficiary of facade patterns are client applications and other systems only.
It provides a simple interface to clients i.e. instead of presenting complex subsystems, we present one simplified interface to clients. It can also help us to reduce the number of objects that a client needs to deal with.Facade does not restrict access to sub-systems A facade does not encapsulate the subsystem classes or interfaces. It just provides a simple interface (or layer) to make our life easier. We are free to expose any functionality of the subsystem or the whole subsystem itself.It will just make the code look ugly, else it will work.Facade pattern vs adapter pattern ->
In the adapter pattern, we try to alter an interface so that the clients is able to work with the system. Else the system will be difficult to use by the client (even not usable).The facade pattern simplifies the interface. It presents the client with a simple interface to interact with (instead of a complex subsystem).
