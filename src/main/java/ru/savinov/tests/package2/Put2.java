package ru.savinov.tests.package2;

import ru.savinov.tests.Test_debag;

public class Put2 {
    int a = 352;

    public void PutIn() {
        Test_debag test = new Test_debag();
        test.setNumMap("число", a);
        test.setNumMap("число", 55);
        test.setNumMap("число", 215);
        test.setNumMap("число", 97465);
        test.setNumMap("число", 546);
    }
}
