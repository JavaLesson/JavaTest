package apps.java.lesson.literature.controller;

import apps.java.lesson.literature.entity.client.LiteratureArray;
import apps.java.lesson.literature.facade.LiteratureFacadeInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/literature")
public class LiteratureController implements LiteratureControllerInterface{

    private LiteratureFacadeInterface literatureFacade;

    @Autowired
    LiteratureController(LiteratureFacadeInterface literatureFacade){
        this.literatureFacade = literatureFacade;
    }

    @Override
    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public LiteratureArray getQuestion (@PathVariable("id") int  questionId){
        return literatureFacade.getLiterature(questionId);
    }

}
