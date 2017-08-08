package apps.java.lesson.literature.entity.client;


import apps.java.lesson.literature.entity.literature.LiteratureModel;

import java.util.ArrayList;
import java.util.List;

public class LiteratureArray {
    private List<LiteratureModel> literatureModelList = new ArrayList<LiteratureModel>();

    public List<LiteratureModel> getLiteratureModelList() {
        return literatureModelList;
    }

    public void setLiteratureModelList(List<LiteratureModel> literatureModelList) {
        this.literatureModelList = literatureModelList;
    }
}
