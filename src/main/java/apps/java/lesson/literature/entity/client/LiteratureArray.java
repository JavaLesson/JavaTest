package apps.java.lesson.literature.entity.client;


import apps.java.lesson.literature.entity.literature.Literature;

import java.util.ArrayList;
import java.util.List;

public class LiteratureArray {
    private List<Literature> literatureList = new ArrayList<Literature>();

    public List<Literature> getLiteratureList() {
        return literatureList;
    }

    public void setLiteratureList(List<Literature> literatureList) {
        this.literatureList = literatureList;
    }
}
