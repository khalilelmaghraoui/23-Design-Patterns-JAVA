package com.Visitor;
import java.awt.*;


interface ShapeVisitor {
    void visit(Rectangle rectangle);
    void visit(Circle circle);
}
