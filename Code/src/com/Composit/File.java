package com.Composit;

public class File extends Component {

    private String value;

    public File(String value) {
        this.value = value;
    }

    @Override
    public void addChile(Component C) {

    }

    @Override
    public void travers() {

        System.out.println("File : " + value);
    }
}
