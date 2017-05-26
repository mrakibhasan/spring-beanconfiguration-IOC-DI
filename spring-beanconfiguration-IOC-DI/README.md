# Basic bean configuration with IOC and dependency injection.
    Project Structure: It is good to follow the structure while study this repository


    src/com/spring----(contains all the source file and bean configuration)

  
  
     -constructor (how to populate and configure the constructor with spring)
   
           --bean	(xml configuration file)
           --with/map	add constructor with map (contains java file and bean xml of constructor with map)
           --App.java
           --Person.java          
           
    -setter  (how to populate and configure the constructor with spring)
    
           --bean	(xml configuration file)
           --App.java
           --Person.java
    -dependencyinjection (How dependency Injection works in spring)
    
          --beans	(xml configuration file)
          --Address.java	
          --App.java	
          --Person.java
     -singleton (what singleton bean scope does)
     
          --bean	
          --Address.java	
          --App.java	
          --Person.java
     -singleton (what prototype bean scope does)
     
          --bean	
          --Address.java	
          --App.java	
          --Person.java
      -init/destory (How init and destory methods works in the spring bean)
      
          -bean	first 
          -Address.java	
          -App.java	first 
          -Person.java
          
       -factorymethod (Woking factory method in spring bean)
       
          --beans	first 
          --Address.java	
          --App.java	
          --Person.java
       -inner (inner beans working)
       
          --bean
          --Animal.java	
          --App.java	
          --Jungle.java
       -collection (How to configure collection in the bean.xml file)
       
          --beans	first 
          --App.java	
          --FruitBasket.java
