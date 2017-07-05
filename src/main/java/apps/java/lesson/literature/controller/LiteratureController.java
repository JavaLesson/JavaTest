package apps.java.lesson.literature.controller;

import apps.java.lesson.literature.entity.client.LiteratureArray;
import apps.java.lesson.literature.facade.LiteratureFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/literature")
public class LiteratureController {

    private LiteratureFacade literatureFacade;

    @Autowired
    LiteratureController(LiteratureFacade literatureFacade){
        this.literatureFacade = literatureFacade;
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public LiteratureArray getQuestion (@PathVariable("id") int  id){
        return literatureFacade.getLiterature(id);
    }

}
