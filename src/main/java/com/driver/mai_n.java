package com.driver;
 class A{
    public String meth(){
        return "Invoking Method From Class A";
    }
}
 class B extends A{
//    @java.lang.Override
    public String meth() {
        return "Method overriden in Extendend class B";
    }
}

public class main_n{
  public  static  void main(String[] args){
      B c1=new B();
      System.out.println(c1.meth());
      B c2=new B();
      System.out.println(c2.meth());

  }
}