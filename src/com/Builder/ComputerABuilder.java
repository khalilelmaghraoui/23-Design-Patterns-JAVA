package com.Builder;

public class ComputerABuilder implements ComputerBuild {
    Computer computer = new Computer();

    @Override
    public void setMonitor() {

        computer.Monitor="single";

    }

    @Override
    public void setMouse() {
        computer.Mouse = "Regular";

    }

    @Override
    public void SetKeyboard() {
        computer.Keyboard="Standrad";
    }

    @Override
    public void setTower() {
        computer.Tower="16 GB in Ram";


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
