package com.Builder;

public class ComputerCreator {
    private ComputerBuild computerBuild;

    public ComputerCreator(ComputerBuild computerBuild) {

        this.computerBuild = computerBuild;
    }

    public void creatComputer() {
        computerBuild.setMonitor();
        computerBuild.SetKeyboard();
        computerBuild.setMouse();
        computerBuild.setTower();
        computerBuild.setPrinter();
    }

    public Computer getComputer() {
        return computerBuild.GetComputer();
    }

}
