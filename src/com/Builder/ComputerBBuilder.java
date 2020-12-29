package com.Builder;

public class ComputerBBuilder implements ComputerBuild{
    Computer computer = new Computer();


    @Override
    public void setMonitor() {

        computer.Monitor="dual";

    }

    @Override
    public void setMouse() {
        computer.Mouse = "Gaming";

    }

    @Override
    public void SetKeyboard() {
        computer.Keyboard="Standrad";
    }

    @Override
    public void setTower() {
        computer.Tower="32 GB in Ram";


    }

    @Override
    public void setPrinter() {
        computer.Printer="HP LASER 2020 ";
    }

    @Override
    public Computer GetComputer() {
        return computer;
    }
}
