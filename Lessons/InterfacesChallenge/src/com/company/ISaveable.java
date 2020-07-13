package com.company;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;

public interface ISaveable {

    List<String> write();
    void read(List<String> savedValue);
}
