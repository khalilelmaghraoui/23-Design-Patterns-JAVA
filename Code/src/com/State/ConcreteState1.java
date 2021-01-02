package com.State;

public class ConcreteState1  implements Istate{
    @Override
    public void Handle(Context context) {
        System.out.println("handel called from Concrete state one ");
        context.State=new ConcreteState2();
    }
}
