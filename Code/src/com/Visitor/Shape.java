package com.Visitor;


public interface Shape {
    void accept(ShapeVisitor visitor);
}
